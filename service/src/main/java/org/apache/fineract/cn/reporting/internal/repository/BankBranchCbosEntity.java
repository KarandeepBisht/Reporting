package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Cacheable(value = false)
//@Table(name = "tbl_summary_banks")
@Table(name = "reports.tbl_summary_banks")
public class BankBranchCbosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id ;
    @Column(name = "geographical_flag")
    private Integer geographicalFlag;
    @Column(name = "state_id")
    private Integer stateId;
    @Column(name = "district_id")
    private Integer districtId;
    @Column(name = "block_id")
    private Integer blockId;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "district_name")
    private String districtName;
    @Column(name = "block_name")
    private String blockName;
    @Column(name = "bank_id")
    private Integer bankId;
    @Column(name = "branch_id")
    private Integer branchId;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "bank_type_id")
    private Integer bankTypeId;
    @Column(name = "bank_type_name")
    private String bankTypeName;
    @Column(name = "shg_bank")
    private Integer shgBank;
    @Column(name = "vo_bank")
    private Integer voBank;
    @Column(name = "clf_bank")
    private Integer clfBank;
    @Column(name = "year_month")
    private String yearMonth;
    @Column(name = "updated_date")
    private String updatedDate;
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

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

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getBankTypeId() {
        return bankTypeId;
    }

    public void setBankTypeId(Integer bankTypeId) {
        this.bankTypeId = bankTypeId;
    }

    public String getBankTypeName() {
        return bankTypeName;
    }

    public void setBankTypeName(String bankTypeName) {
        this.bankTypeName = bankTypeName;
    }

    public Integer getShgBank() {
        return shgBank;
    }

    public void setShgBank(Integer shgBank) {
        this.shgBank = shgBank;
    }

    public Integer getVoBank() {
        return voBank;
    }

    public void setVoBank(Integer voBank) {
        this.voBank = voBank;
    }

    public Integer getClfBank() {
        return clfBank;
    }

    public void setClfBank(Integer clfBank) {
        this.clfBank = clfBank;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}
