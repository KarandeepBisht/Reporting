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
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.LeaderEducationApiService;
import org.apache.fineract.cn.reporting.internal.service.VoClfApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/voclf")
public class VoClfApiRestController {

        private final Logger logger;
        private final VoClfApiService voClfApiService;


        @Autowired
        public VoClfApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                                final VoClfApiService voClfApiService) {
            super();
            this.logger = logger;
            this.voClfApiService = voClfApiService;
        }
    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/clf-subCommity",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ClfSubCommityResponse>> getClfSCData(@RequestBody ClfSubCommityRequest request,
                                                             HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
            String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.voClfApiService.getClfSCData(location_type,date_to,date_from, state_id, district_id, block_id, tenantIdentifier));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/vo-subCommity",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<VoSubCommityResponse>> getClfSCData(@RequestBody VoSubCommityRequest request,
                                                            HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.voClfApiService.getVoSCData(location_type,date_to,date_from, state_id, district_id, block_id, tenantIdentifier));
    }
}
