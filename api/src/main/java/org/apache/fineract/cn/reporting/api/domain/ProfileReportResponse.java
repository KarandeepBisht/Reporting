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
package org.apache.fineract.cn.reporting.api.domain;

import javax.persistence.Column;
import java.sql.Timestamp;

public class ProfileReportResponse {


    private Integer geographicalFlag;

    private Integer stateId;

    private Integer districtId;

    private Integer blockId;

    private Integer panchayatId;

    private Integer villageId;

    private String stateName;

    private String districtName;

    private String blockName;

    private String panchayat_name;

    private String villageName;

    private String yearMonth;

    private Integer shgCount;

    private Integer shgBk;

    private Integer shgMapped;

    private Integer shgUnmapped;

    private Integer voCount;

    private Integer voBk;

    private Integer voMapped;

    private Integer voUnmapped;

    private Integer clfCount;

    private Integer clfBk;

    private Integer clfMapped;

    private Integer clfUnmapped;

    private Integer shgApproved;

    private Integer shgActivationPending;

    private Integer shgChangePending;

    private Integer shgMem;

    private Integer shgMemApproved;

    private Integer shgMemActivationPending;

    private Integer shgMemChangePending;

    private Integer shgUpdatedLokos;

    private Integer voApproved;

    private Integer voActivationPending;

    private Integer voChangePending;

    private Integer voMem;

    private Integer voMemApproved;

    private Integer voMemActivationPending;

    private Integer voMemChangePending;

    private Integer voUpdatedLokos;

    private Integer clfApproved;

    private Integer clfActivationPending;

    private Integer clfChangePending;

    private Integer clfMem;

    private Integer clfMemApproved;

    private Integer clfMemActivationPending;


    private Integer clfMemModifiedPending;

    private Integer clfUpdatedLokos;

    private Integer shgFormed;

    private Integer shgMembers;

    private Integer ageBlock;

    private Boolean saturationCoverage;

    private Timestamp clfLastupdatedon;

    private Timestamp voLastupdatedon;

    private Timestamp shgLastupdatedon;

    private Timestamp memLastupdatedon;

    private Integer shgCountMigrated;
    private Integer memberCountMigrated;
    private Integer memberUpdatedLokos;
    private Integer voCountMigrated;
    private Integer clfCountMigrated;

    private Integer voEc;

    private Integer clfShg;

    private Integer clfEc;

    private String updatedDate;

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getPanchayat_name() {
        return panchayat_name;
    }

    public void setPanchayat_name(String panchayat_name) {
        this.panchayat_name = panchayat_name;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getShgCount() {
        return shgCount;
    }

    public void setShgCount(Integer shgCount) {
        this.shgCount = shgCount;
    }

    public Integer getShgBk() {
        return shgBk;
    }

    public void setShgBk(Integer shgBk) {
        this.shgBk = shgBk;
    }

    public Integer getShgMapped() {
        return shgMapped;
    }

    public void setShgMapped(Integer shgMapped) {
        this.shgMapped = shgMapped;
    }

    public Integer getShgUnmapped() {
        return shgUnmapped;
    }

    public void setShgUnmapped(Integer shgUnmapped) {
        this.shgUnmapped = shgUnmapped;
    }

    public Integer getVoCount() {
        return voCount;
    }

    public void setVoCount(Integer voCount) {
        this.voCount = voCount;
    }

    public Integer getVoBk() {
        return voBk;
    }

    public void setVoBk(Integer voBk) {
        this.voBk = voBk;
    }

    public Integer getVoMapped() {
        return voMapped;
    }

    public void setVoMapped(Integer voMapped) {
        this.voMapped = voMapped;
    }

    public Integer getVoUnmapped() {
        return voUnmapped;
    }

    public void setVoUnmapped(Integer voUnmapped) {
        this.voUnmapped = voUnmapped;
    }

    public Integer getClfCount() {
        return clfCount;
    }

    public void setClfCount(Integer clfCount) {
        this.clfCount = clfCount;
    }

    public Integer getClfBk() {
        return clfBk;
    }

    public void setClfBk(Integer clfBk) {
        this.clfBk = clfBk;
    }

    public Integer getClfMapped() {
        return clfMapped;
    }

    public void setClfMapped(Integer clfMapped) {
        this.clfMapped = clfMapped;
    }

    public Integer getClfUnmapped() {
        return clfUnmapped;
    }

    public void setClfUnmapped(Integer clfUnmapped) {
        this.clfUnmapped = clfUnmapped;
    }

    public Integer getShgApproved() {
        return shgApproved;
    }

    public void setShgApproved(Integer shgApproved) {
        this.shgApproved = shgApproved;
    }

    public Integer getShgActivationPending() {
        return shgActivationPending;
    }

    public void setShgActivationPending(Integer shgActivationPending) {
        this.shgActivationPending = shgActivationPending;
    }

    public Integer getShgChangePending() {
        return shgChangePending;
    }

    public void setShgChangePending(Integer shgChangePending) {
        this.shgChangePending = shgChangePending;
    }

    public Integer getShgMem() {
        return shgMem;
    }

    public void setShgMem(Integer shgMem) {
        this.shgMem = shgMem;
    }

    public Integer getShgMemApproved() {
        return shgMemApproved;
    }

    public void setShgMemApproved(Integer shgMemApproved) {
        this.shgMemApproved = shgMemApproved;
    }

    public Integer getShgMemActivationPending() {
        return shgMemActivationPending;
    }

    public void setShgMemActivationPending(Integer shgMemActivationPending) {
        this.shgMemActivationPending = shgMemActivationPending;
    }

    public Integer getShgMemChangePending() {
        return shgMemChangePending;
    }

    public void setShgMemChangePending(Integer shgMemChangePending) {
        this.shgMemChangePending = shgMemChangePending;
    }

    public Integer getShgUpdatedLokos() {
        return shgUpdatedLokos;
    }

    public void setShgUpdatedLokos(Integer shgUpdatedLokos) {
        this.shgUpdatedLokos = shgUpdatedLokos;
    }

    public Integer getVoApproved() {
        return voApproved;
    }

    public void setVoApproved(Integer voApproved) {
        this.voApproved = voApproved;
    }

    public Integer getVoActivationPending() {
        return voActivationPending;
    }

    public void setVoActivationPending(Integer voActivationPending) {
        this.voActivationPending = voActivationPending;
    }

    public Integer getVoChangePending() {
        return voChangePending;
    }

    public void setVoChangePending(Integer voChangePending) {
        this.voChangePending = voChangePending;
    }

    public Integer getVoMem() {
        return voMem;
    }

    public void setVoMem(Integer voMem) {
        this.voMem = voMem;
    }

    public Integer getVoMemApproved() {
        return voMemApproved;
    }

    public void setVoMemApproved(Integer voMemApproved) {
        this.voMemApproved = voMemApproved;
    }

    public Integer getVoMemActivationPending() {
        return voMemActivationPending;
    }

    public void setVoMemActivationPending(Integer voMemActivationPending) {
        this.voMemActivationPending = voMemActivationPending;
    }

    public Integer getVoMemChangePending() {
        return voMemChangePending;
    }

    public void setVoMemChangePending(Integer voMemChangePending) {
        this.voMemChangePending = voMemChangePending;
    }

    public Integer getVoUpdatedLokos() {
        return voUpdatedLokos;
    }

    public void setVoUpdatedLokos(Integer voUpdatedLokos) {
        this.voUpdatedLokos = voUpdatedLokos;
    }

    public Integer getClfApproved() {
        return clfApproved;
    }

    public void setClfApproved(Integer clfApproved) {
        this.clfApproved = clfApproved;
    }

    public Integer getClfActivationPending() {
        return clfActivationPending;
    }

    public void setClfActivationPending(Integer clfActivationPending) {
        this.clfActivationPending = clfActivationPending;
    }

    public Integer getClfChangePending() {
        return clfChangePending;
    }

    public void setClfChangePending(Integer clfChangePending) {
        this.clfChangePending = clfChangePending;
    }

    public Integer getClfMem() {
        return clfMem;
    }

    public void setClfMem(Integer clfMem) {
        this.clfMem = clfMem;
    }

    public Integer getClfMemApproved() {
        return clfMemApproved;
    }

    public void setClfMemApproved(Integer clfMemApproved) {
        this.clfMemApproved = clfMemApproved;
    }

    public Integer getClfMemActivationPending() {
        return clfMemActivationPending;
    }

    public void setClfMemActivationPending(Integer clfMemActivationPending) {
        this.clfMemActivationPending = clfMemActivationPending;
    }

    public Integer getClfMemModifiedPending() {
        return clfMemModifiedPending;
    }

    public void setClfMemModifiedPending(Integer clfMemModifiedPending) {
        this.clfMemModifiedPending = clfMemModifiedPending;
    }

    public Integer getClfUpdatedLokos() {
        return clfUpdatedLokos;
    }

    public void setClfUpdatedLokos(Integer clfUpdatedLokos) {
        this.clfUpdatedLokos = clfUpdatedLokos;
    }

    public Integer getShgFormed() {
        return shgFormed;
    }

    public void setShgFormed(Integer shgFormed) {
        this.shgFormed = shgFormed;
    }

    public Integer getShgMembers() {
        return shgMembers;
    }

    public void setShgMembers(Integer shgMembers) {
        this.shgMembers = shgMembers;
    }

    public Integer getAgeBlock() {
        return ageBlock;
    }

    public void setAgeBlock(Integer ageBlock) {
        this.ageBlock = ageBlock;
    }

    public Boolean getSaturationCoverage() {
        return saturationCoverage;
    }

    public void setSaturationCoverage(Boolean saturationCoverage) {
        this.saturationCoverage = saturationCoverage;
    }

    public Timestamp getClfLastupdatedon() {
        return clfLastupdatedon;
    }

    public void setClfLastupdatedon(Timestamp clfLastupdatedon) {
        this.clfLastupdatedon = clfLastupdatedon;
    }

    public Timestamp getVoLastupdatedon() {
        return voLastupdatedon;
    }

    public void setVoLastupdatedon(Timestamp voLastupdatedon) {
        this.voLastupdatedon = voLastupdatedon;
    }

    public Timestamp getShgLastupdatedon() {
        return shgLastupdatedon;
    }

    public void setShgLastupdatedon(Timestamp shgLastupdatedon) {
        this.shgLastupdatedon = shgLastupdatedon;
    }

    public Timestamp getMemLastupdatedon() {
        return memLastupdatedon;
    }

    public void setMemLastupdatedon(Timestamp memLastupdatedon) {
        this.memLastupdatedon = memLastupdatedon;
    }

    public Integer getShgCountMigrated() {
        return shgCountMigrated;
    }

    public void setShgCountMigrated(Integer shgCountMigrated) {
        this.shgCountMigrated = shgCountMigrated;
    }

    public Integer getMemberCountMigrated() {
        return memberCountMigrated;
    }

    public void setMemberCountMigrated(Integer memberCountMigrated) {
        this.memberCountMigrated = memberCountMigrated;
    }

    public Integer getMemberUpdatedLokos() {
        return memberUpdatedLokos;
    }

    public void setMemberUpdatedLokos(Integer memberUpdatedLokos) {
        this.memberUpdatedLokos = memberUpdatedLokos;
    }

    public Integer getVoCountMigrated() {
        return voCountMigrated;
    }

    public void setVoCountMigrated(Integer voCountMigrated) {
        this.voCountMigrated = voCountMigrated;
    }

    public Integer getClfCountMigrated() {
        return clfCountMigrated;
    }

    public void setClfCountMigrated(Integer clfCountMigrated) {
        this.clfCountMigrated = clfCountMigrated;
    }

    public Integer getVoEc() {
        return voEc;
    }

    public void setVoEc(Integer voEc) {
        this.voEc = voEc;
    }

    public Integer getClfShg() {
        return clfShg;
    }

    public void setClfShg(Integer clfShg) {
        this.clfShg = clfShg;
    }

    public Integer getClfEc() {
        return clfEc;
    }

    public void setClfEc(Integer clfEc) {
        this.clfEc = clfEc;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}
