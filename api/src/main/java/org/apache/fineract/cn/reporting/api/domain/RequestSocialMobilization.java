package org.apache.fineract.cn.reporting.api.domain;

public class RequestSocialMobilization {
    private Integer stateId;

    private Integer districtId;

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

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    private Integer blockId;
    private Integer geographicalFlag;

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    private String fromDate;
    private String toDate;

//    public String getFromDate() {
//        return fromDate;
//    }
//
//    public void setFromDate(Long fromDate) {
//        this.fromDate = fromDate;
//    }
//
//    public String getToDate() {
//        return toDate;
//    }
//
//    public void setToDate(Long toDate) {
//        this.toDate = toDate;
//    }
//
//    private Long fromDate;
//    private Long toDate;
}
