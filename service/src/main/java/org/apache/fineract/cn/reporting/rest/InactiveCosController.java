/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.CboPromotedResponse;
import org.apache.fineract.cn.reporting.api.domain.Cbo_PromotedRequest;
import org.apache.fineract.cn.reporting.api.domain.InactiveCbosRequest;
import org.apache.fineract.cn.reporting.api.domain.InactiveCbosResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.CboPromotedApiService;
import org.apache.fineract.cn.reporting.internal.service.InactiveCboServiceClass;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inactive")
public class InactiveCosController {
    private final Logger logger;
    private final InactiveCboServiceClass inactiveCboServiceClass;


    @Autowired
    public InactiveCosController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                 final InactiveCboServiceClass inactiveCboServiceClass) {
        super();
        this.logger = logger;
        this.inactiveCboServiceClass = inactiveCboServiceClass;
    }


    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/inactive-data",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<InactiveCbosResponse>> getGeoData(@RequestBody InactiveCbosRequest request,
                                                          @RequestHeader Map<String, String> headers) {
        if(headers.get("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String loctype=request.getLoctype();
        String dto=request.getDto();
        String dfrom =request.getDfrom();
        String sid=request.getSid();
        String did=request.getDid();
        String bid=request.getBid();
        String tenantIdentifier = headers.get("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.inactiveCboServiceClass.getinactivedata(loctype,dto,dfrom,sid,did,bid,tenantIdentifier));
    }
}
