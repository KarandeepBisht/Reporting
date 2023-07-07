package org.apache.fineract.cn.reporting.internal.repository;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
@Entity
@Cacheable(value = false)
//@Table(name = "tbl_summary_banks")
@Table(name = "reports.tbl_summary_banks")
public class BranchDetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id ;
    @Column(name = "bank_id")
    private Integer bankId;
    @Column(name = "geographical_flag")
    private Integer geographicalFlag;
    @Column(name = "branch_id")
    private Integer branchId;
    @Column(name = "branch_name")
    private String branchName;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
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

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }


}
