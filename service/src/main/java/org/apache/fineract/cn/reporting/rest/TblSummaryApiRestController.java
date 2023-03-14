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
import org.apache.fineract.cn.reporting.internal.service.TblSummaryApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
@RequestMapping("/apiSummary")
public class TblSummaryApiRestController {
    private final Logger logger;
    private final TblSummaryApiService tblSummaryApiService;


    @Autowired
    public TblSummaryApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                 final TblSummaryApiService tblSummaryApiService) {
        super();
        this.logger = logger;
        this.tblSummaryApiService = tblSummaryApiService;
    }


    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/rpt_summary",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<TblSummaryResponse>> gettblsummarydata(@RequestBody TblSummaryRequest request,
                                                               HttpServletRequest headerRequest) {

        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String reportName=request.getReportName();
        String locationType=request.getLocationType();
        String dateTo=request.getDateTo();
        String dateFrom =request.getDateFrom();
        String stateId=request.getStateId();
        String districtId=request.getDistrictId();
        String blockId=request.getBlockId();
        String panchayatId=request.getPanchayatId();
        String villageId=request.getVillageId();
        String bankTypeId=request.getBankTypeId();
        String bankType=request.getBankType();
        String bankCode=request.getBankCode();
        String branchCode=request.getBranchCode();
        String clf=request.getClf();
        String vo=request.getVo();
        String shg=request.getShg();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.tblSummaryApiService.gettbl_summarydata(reportName,locationType,dateTo
                        ,dateFrom,stateId, districtId, blockId,panchayatId,villageId,bankTypeId,bankType,bankCode,branchCode,clf,vo,shg, tenantIdentifier));
    }

}
