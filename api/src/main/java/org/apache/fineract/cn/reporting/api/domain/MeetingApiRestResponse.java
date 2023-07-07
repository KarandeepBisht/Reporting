package org.apache.fineract.cn.reporting.api.domain;

import javax.persistence.Column;

public class MeetingApiRestResponse {

    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer panchayatId;
    private Integer villageId;
    private Integer geographicalFlag;
    private String yearMonth;
    private Integer shgId;
    private Integer voId;
    private Integer clfId;
    private String shgName;
    private String voName;
    private String clfName;

    private Integer shgScMonth;
    private Integer shgStMonth;
    private Integer shgGenMonth;
    private Integer shgMemScMonth;
    private Integer shgMemStMonth;
    private Integer clfVoShg;

    private Integer clfVoShgMem;
    private Integer shgMemGenMonth;

    private String updatedDate;
    public Integer getShgMemGenMonth() {
        return shgMemGenMonth;
    }

    public void setShgMemGenMonth(Integer shgMemGenMonth) {
        this.shgMemGenMonth = shgMemGenMonth;
    }

    public Integer getShgMemOtherMonth() {
        return shgMemOtherMonth;
    }

    public void setShgMemOtherMonth(Integer shgMemOtherMonth) {
        this.shgMemOtherMonth = shgMemOtherMonth;
    }

    public Integer getShgOtherMonth() {
        return shgOtherMonth;
    }

    public void setShgOtherMonth(Integer shgOtherMonth) {
        this.shgOtherMonth = shgOtherMonth;
    }

    private Integer shgMemOtherMonth;

    private Integer shgOtherMonth;

    public Integer getShgScMonth() {
        return shgScMonth;
    }

    public void setShgScMonth(Integer shgScMonth) {
        this.shgScMonth = shgScMonth;
    }

    public Integer getShgStMonth() {
        return shgStMonth;
    }

    public void setShgStMonth(Integer shgStMonth) {
        this.shgStMonth = shgStMonth;
    }

    public Integer getShgGenMonth() {
        return shgGenMonth;
    }

    public void setShgGenMonth(Integer shgGenMonth) {
        this.shgGenMonth = shgGenMonth;
    }

    public Integer getShgMemScMonth() {
        return shgMemScMonth;
    }

    public void setShgMemScMonth(Integer shgMemScMonth) {
        this.shgMemScMonth = shgMemScMonth;
    }

    public Integer getShgMemStMonth() {
        return shgMemStMonth;
    }

    public void setShgMemStMonth(Integer shgMemStMonth) {
        this.shgMemStMonth = shgMemStMonth;
    }

    public Integer getClfVoShg() {
        return clfVoShg;
    }

    public void setClfVoShg(Integer clfVoShg) {
        this.clfVoShg = clfVoShg;
    }

    public Integer getClfVoShgMem() {
        return clfVoShgMem;
    }

    public void setClfVoShgMem(Integer clfVoShgMem) {
        this.clfVoShgMem = clfVoShgMem;
    }

    public Integer getShgId() {
        return shgId;
    }

    public void setShgId(Integer shgId) {
        this.shgId = shgId;
    }

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public Integer getClfId() {
        return clfId;
    }

    public void setClfId(Integer clfId) {
        this.clfId = clfId;
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

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }
    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public String getVoName() {
        return voName;
    }

    public void setVoName(String voName) {
        this.voName = voName;
    }

    public String getClfName() {
        return clfName;
    }

    public void setClfName(String clfName) {
        this.clfName = clfName;
    }


    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }
    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}




