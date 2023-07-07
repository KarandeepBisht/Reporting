package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
@Cacheable(value = false)
//@Table(name = "tbl_summary")
@Table(name = "reports.tbl_summary")
public class MeetingApiRestEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private BigInteger id ;
        @Column(name = "geographical_flag")
        private Integer geographicalFlag;
        @Column(name = "year_month")
        private String yearMonth;
        @Column(name = "state_id")
        private Integer stateId;
        @Column(name = "district_id")
        private Integer districtId;
        @Column(name = "block_id")
        private Integer blockId;
        @Column(name = "panchayat_id")
        private Integer panchayatId;
        @Column(name = "village_id")
        private Integer villageId;
        @Column(name = "shg_id")
        private Integer shgId;
        @Column(name = "vo_id")
        private Integer voId;

        @Column(name = "clf_id")
        private Integer clfId;

        @Column(name = "shg_name")
        private String shgName;

        @Column(name = "vo_name")
        private String voName;
        @Column(name = "clf_name")
        private String clfName;

        @Column(name = "shg_sc_month")
        private Integer shgScMonth;
        @Column(name = "shg_st_month")
        private Integer shgStMonth;
        @Column(name = "shg_gen_month")
        private Integer shgGenMonth;
        @Column(name = "shg_mem_sc_month")
        private Integer shgMemScMonth;
        @Column(name = "shg_mem_st_month")
        private Integer shgMemStMonth;
        @Column(name = "clfvo_shg")
        private Integer clfVoShg;
        @Column(name = "clfvo_shgmem")
        private Integer clfVoShgMem;
        @Column(name = "shg_mem_gen_month")
        private Integer shgMemGenMonth;
        @Column(name = "shg_mem_other_month")
        private Integer shgMemOtherMonth;

        @Column(name = "shg_other_month")
        private Integer shgOtherMonth;
        @Column(name = "updated_date")
        private String updatedDate;
        public Integer getShgOtherMonth() {
                return shgOtherMonth;
        }

        public void setShgOtherMonth(Integer shgOtherMonth) {
                this.shgOtherMonth = shgOtherMonth;
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

        public String getYearMonth() {
                return yearMonth;
        }

        public void setYearMonth(String yearMonth) {
                this.yearMonth = yearMonth;
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

        public String getUpdatedDate() {
                return updatedDate;
        }

        public void setUpdatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
        }
}
