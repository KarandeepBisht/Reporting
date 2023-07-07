package org.apache.fineract.cn.reporting.internal.repository;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Cacheable(value = false)
//@Table(name = "tbl_summary_banks")
@Table(name = "reports.tbl_summary_banks")
public class BankDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id ;
    @Column(name = "bank_id")
    private Integer bankId;
    @Column(name = "state_id")
    private Integer stateId;
    @Column(name = "geographical_flag")
    private Integer geographicalFlag;

    @Column(name = "bank_name")
    private String bankName;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }


}
