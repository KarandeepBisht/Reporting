package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Cacheable(value = false)
//@Table(name = "tbl_summary")
@Table(name = "reports.tbl_summary")
public class SocialMobalizationEntity {
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
    @Column(name="totalruralhouseholds")
    private Integer totalRuralHouseholds;
    @Column(name = "targetruralhouseholds")
    private Integer targetRuralHouseholds;
    @Column(name = "shg_mem")
    private Integer shgMem;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "district_name")
    private String districtName;
    @Column(name = "block_name")
    private String blockName;
    @Column(name = "age_block")
    private Integer ageBlock;
    @Column(name = "shg_formed_month")
    private Integer shgFormedMonth;
    @Column(name = "shg_members_joined_month")
    private Integer shgMembersJoinedMonth;
    @Column(name = "vo_formed_month")
    private Integer voFormedMonth;
    @Column(name = "vo_shg_formed_month")
    private Integer voShgFormedMonth;
    @Column(name = "vo_member_formed_month")
    private Integer voMemberFormedMonth;
    @Column(name = "clf_formed_month")
    private Integer clfFormedMonth;
    @Column(name = "clf_member_formed_month")
    private Integer clfMemberFormedMonth;
    @Column(name = "clf_shg_formed_month")
    private Integer clfShgFormedMonth;
    @Column(name = "clf_vo_formed_month")
    private Integer clfVoFormedMonth;
    @Column(name = "shg_approved")
    private Integer shgApproved;
    @Column(name = "shg_inactive_month")
    private Integer shgInactiveMonth;
    @Column(name = "shg_inactive_member_month")
    private Integer shgInactiveMemberMonth;
    @Column(name = "vo_approved")
    private Integer voApproved;
    @Column(name = "vo_inactive_month")
    private Integer voInactiveMonth;
    @Column(name = "clf_approved")
    private Integer clfApproved;
    @Column(name = "clf_inactive_month")
    private Integer clfInactiveMonth;
    @Column(name = "village_name")
    private String villageName;
    @Column(name = "panchayat_name")
    private String panchayatName;
    @Column(name = "totaldistict")
    private Integer totalDistict;
    @Column(name = "totalblock")
    private Integer totalBlock;
    @Column(name = "totalgp")
    private Integer totalGP;
    @Column(name = "totalvillage")
    private Integer totalVillage;
    @Column(name = "totaldistrictcoverage")
    private Integer totalDistrictCoverage;
    @Column(name = "totalblockcoverage")
    private Integer totalBlockCoverage;
    @Column(name = "totalgpcoverage")
    private Integer totalGPCoverage;

    @Column(name = "totalvillagecoverage")
    private Integer totalVillageCoverage;

    @Column(name = "illiteratemem_month")
    private Integer illiterateMem;
    @Column(name = "functionalliteracymem_month")
    private Integer functionalLiteracyMem;
    @Column(name = "educationupto5_month")
    private Integer educationUpto5;
    @Column(name = "educationupto8_month")
    private Integer educationUpto8;
    @Column(name = "educationupto12_month")
    private Integer educationUpto12;
    @Column(name = "vocationaltrainingmem_month")
    private Integer vocationalTrainingMem;
    @Column(name = "otheredumem_month")
    private Integer otherEduMem;
    @Column(name = "shgwithbankaccount")
    private Integer shgWithBankAccount;
    //    @Column(name = "shgwithoutbankaccount")
//    private Integer shgWithoutBankAccount;
    @Column(name = "vowithbankaccount")
    private Integer voWithBankAccount;
    //    @Column(name = "vowithoutbankaccount")
//    private Integer voWithoutBankAccount;
    @Column(name = "clfwithbankaccount")
    private Integer clfWithBankAccount;
    //    @Column(name = "clfwithoutbankaccount")
//    private Integer clfWithoutBankAccount;
    @Column(name = "shgbankacount1")
    private Integer shgBankAcount1;
    @Column(name = "shgbankacount2")
    private Integer shgBankAcount2;
    @Column(name = "memwithbankaccount")
    private Integer memWithBankAccount;
    @Column(name = "memwithadhaar")
    private Integer memWithAdhaar;
    @Column(name = "memwithsecct")
    private Integer memWithSecct;
    @Column(name = "womenshg_month")
    private Integer womenshgMonth;
    @Column(name = "pvtgshg_month")
    private Integer pvtgshgMonth;
    @Column(name = "pwdshg_month")
    private Integer pwdshgMonth;
    @Column(name = "elderlyshg_month")
    private Integer elderlyshgMonth;
    @Column(name = "othertypeshg_month")
    private Integer othertypeshgMonth;
    @Column(name = "clfbanklinkage_month")
    private Integer clfbanklinkageMonth;
    @Column(name = "clfassetverification_month")
    private Integer clfassetverificationMonth;
    @Column(name = "clflivelihoodpromo_month")
    private Integer clflivelihoodpromoMonth;
    @Column(name = "clfmonitoring_month")
    private Integer clfmonitoringMonth;
    @Column(name = "clfsocialaction_month")
    private Integer clfsocialactionMonth;
    @Column(name = "clfspecial_month")
    private Integer clfspecialMonth;
    @Column(name = "vobanklinkage_month")
    private Integer vobanklinkageMonth;
    @Column(name = "voassetverification_month")
    private Integer voassetverificationMonth;
    @Column(name = "volivelihoodpromo_month")
    private Integer volivelihoodpromoMonth;
    @Column(name = "vomonitoring_month")
    private Integer vomonitoringMonth;
    @Column(name = "vosocialaction_month")
    private Integer vosocialactionMonth;
    @Column(name = "vospecial_month")
    private Integer vospecialMonth;
    @Column(name = "illiteratemem_leader_month")
    private Integer illiteratememLeaderMonth;
    @Column(name = "functionalliteracymem_leader_month")
    private Integer functionalliteracymemLeaderMonth;
    @Column(name = "educationupto5_leader_month")
    private Integer educationupto5LeaderMonth;
    @Column(name = "educationupto8_leader_month")
    private Integer educationupto8LeaderMonth;
    @Column(name = "educationupto12_leader_month")
    private Integer educationupto12LeaderMonth;
    @Column(name = "vocationaltrainingmem_leader_month")
    private Integer vocationalTrainingmemLeaderMonth;
    @Column(name = "otheredumem_leader_month")
    private Integer otheredumemLeaderMonth;
    @Column(name = "shg_leader_month")
    private Integer shgLeaderMonth;
    @Column(name = "shg_count")
    private Integer shgCount;
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
    @Column(name = "shg_mem_gen_month")
    private Integer shgMemGenMonth;
    @Column(name = "monthsOld_3_month")
    private Integer monthsOld3Month;
    @Column(name = "monthsOld_6_month")
    private Integer monthsOld6Month;
    @Column(name = "monthsOld_9_month")
    private Integer monthsOld9Month;
    @Column(name = "monthsOld_12_month")
    private Integer monthsOld12Month;
    @Column(name = "monthsOld_12More_month")
    private Integer monthsOld12MoreMonth;
    @Column(name = "shg_mem_approved")
    private Integer shgMemApproved;
    @Column(name = "vo_count")
    private Integer voCount;
    @Column(name = "vo_mem_approved")
    private Integer voMemApproved;
    @Column(name = "clf_count")
    private Integer clfCount;
    @Column(name = "clf_shg")
    private Integer clfShg;
    @Column(name = "clf_mem")
    private Integer clfMem;
    @Column(name = "clf_mem_approved")
    private Integer clfMemApproved;
    @Column(name = "shg_agricultural")
    private Integer shgAgricultural;
    @Column(name = "shg_horticulture")
    private Integer shgHorticulture;
    @Column(name = "shg_livestock")
    private Integer shgLivestock;
    @Column(name = "shg_fishery")
    private Integer shgFishery;
    @Column(name = "shg_ntfp")
    private Integer shgNtfp;
    @Column(name = "shg_manufacturing")
    private Integer shgManufacturing;
    @Column(name = "shg_trading")
    private Integer shgTrading;
    @Column(name = "shg_services")
    private Integer shgServices;
    @Column(name = "shg_custom_hiring")
    private Integer shgCustomHiring;

    @Column(name = "mem_agricultural")
    private Integer memAgricultural;
    @Column(name = "mem_horticulture")
    private Integer memHorticulture;
    @Column(name = "mem_livestock")
    private Integer memLivestock;
    @Column(name = "mem_fishery")
    private Integer memFishery;
    @Column(name = "mem_ntfp")
    private Integer memNtfp;
    @Column(name = "mem_manufacturing")
    private Integer memManufacturing;
    @Column(name = "mem_trading")
    private Integer memTrading;
    @Column(name = "mem_services")
    private Integer memServices;

    @Column(name = "shg_leader_agricultural")
    private Integer shgLeaderAgricultural;
    @Column(name = "shg_leader_horticulture")
    private Integer shgLeaderHorticulture;
    @Column(name = "shg_leader_livestock")
    private Integer shgLeaderLivestock;
    @Column(name = "shg_leader_fishery")
    private Integer shgLeaderFishery;
    @Column(name = "shg_leader_ntfp")
    private Integer shgLeaderNtfp;
    @Column(name = "shg_leader_manufacturing")
    private Integer shgLeaderManufacturing;
    @Column(name = "shg_leader_trading")
    private Integer shgLeaderTrading;
    @Column(name = "shg_leader_services")
    private Integer shgLeaderServices;
    @Column(name = "shg_approved_month")
    private Integer shgApprovedMonth;
    @Column(name = "vo_approved_month")
    private Integer voApprovedMonth;
    @Column(name = "clf_approved_month")
    private Integer clfApprovedMonth;
    @Column(name ="wages_leader")
    private Integer wagesLeader;
    @Column(name = "shg_leader_cader_service")
    private Integer shgLeaderCaderService;
    @Column(name = "shg_leader_other")
    private Integer shgLeaderOther;
    @Column(name = "shg_live_aggregation")
    private Integer shgLiveAggregation;
    @Column(name = "shg_live_others")
    private Integer shgLiveOthers;
    @Column(name = "mem_wages")
    private Integer memWages;
    @Column(name = "mem_cader_service")
    private Integer memCaderService;

    @Column(name = "mem_others")
    private Integer memOthers;
    @Column(name = "is_saturated")
    private Integer isSaturated;
    @Column(name = "shg_obc_month")
    private Integer shgObcMonth;
    @Column(name = "shg_mem_obc_month")
    private Integer shgMemObcMonth;
    @Column(name = "educationuptoGradAndAbve_month")
    private Integer educationUptoGradAndAboveMonth;
    @Column(name = "educationuptoGradandabve_leader_month")
    private Integer educationuptoGradandabveLeaderMonth;
    @Column(name = "mem_mobile")
    private Integer memMobile;
    @Column(name = "monthsOld_12_24_month")
    private Integer monthOld12to24Month;
    @Column(name = "monthsOld_24_60_month")
    private Integer monthsOld24to60Month;
    @Column(name = "monthsOld_60_120_month")
    private Integer monthsOld60to120Month;
    @Column(name = "monthsOld_120_More_month")
    private Integer monthsOld120MoreMonth;
    @Column(name = "shg_activated")
    private Integer shgActivated;
    @Column(name = "vo_activated")
    private Integer voActivated;
    @Column(name = "clf_activated")
    private Integer clfActivated;
    @Column(name = "mem_activated")
    private Integer memActivated;
    @Column(name = "shg_other_month")
    private Integer shgOtherMonth;
    @Column(name = "shg_mem_other_month")
    private Integer shgMemOtherMonth;
    @Column(name = "shg_last_day")
    private Integer shgLastDay;
    @Column(name = "mem_last_day")
    private Integer memLastDay;
    @Column(name = "updated_date")
    private String updatedDate;
    @Column(name = "shg_formed")
    private Integer shgFormed;
    @Column(name = "shg_members")
    private Integer shgMembers;
    @Column(name = "shg_tot")
    private Integer shgTot;
    @Column(name = "approved_nic_shg_bpm")
    private Integer approvedNicShgBpm;
    @Column(name = "pending_nic_shg_bpm")
    private Integer pendingNicShgBpm;
    @Column(name = "rejected_nic_shg_bpm")
    private Integer rejectedNicShgBpm;
    @Column(name = "lokos_shg")
    private Integer lokosShg;
    @Column(name = "approved_lokos_shg_bpm")
    private Integer approvedLokosShgBpm;
    @Column(name = "pending_lokos_shg_bpm")
    private Integer pendingLokosShgBpm;
    @Column(name = "rejected_lokos_shg_bpm")
    private Integer rejectedLokosShgBpm;
    @Column(name = "nic_mem")
    private Integer nicMem;
    @Column(name = "approve_nic_mem")
    private Integer approveNicMem;
    @Column(name = "pending_nic_mem")
    private Integer pendingNicMem;
    @Column(name = "rejected_nic_mem")
    private Integer rejectedNicMem;
    @Column(name = "lokos_mem")
    private Integer lokosMem;
    @Column(name = "approve_lokos_mem")
    private Integer approveLokosMem;
    @Column(name = "pending_lokos_mem")
    private Integer pendingLokosMem;
    @Column(name = "rejected_lokos_mem")
    private Integer rejectedLokosMem;
    @Column(name = "nrlm_promoted_by")
    private Integer nrlmPromotedBy;
    @Column(name = "state_project_promoted_by")
    private Integer stateProjectPromotedBy;
    @Column(name = "ngo_promoted_by")
    private Integer ngoPromotedBy;
    @Column(name = "sgsy_promoted_by")
    private Integer sgsyPromotedBy;
    @Column(name = "other_promoted_by")
    private Integer otherPromotedBy;
    @Column(name = "state_project_coopted")
    private Integer stateProjectCoopted;
    @Column(name = "state_project_noncoopted")
    private Integer stateProjectNoncoopted;
    @Column(name = "ngo_coopted")
    private Integer ngoCoopted;
    @Column(name = "ngo_noncoopted")
    private Integer ngoNoncoopted;
    @Column(name = "other_coopted")
    private Integer otherCoopted;
    @Column(name = "other_noncoopted")
    private Integer otherNoncoopted;
    @Column(name = "allshgwithbankaccount")
    private Integer allShgwithBankAccount;
    @Column(name = "allshgwithbankaccount_mem")
    private Integer allShgwithBankAccountMem;
    @Column(name = "allshg_without_mig")
    private Integer allShgWithoutMig;
    @Column(name = "allmem_without_mig")
    private Integer allMemWithoutMig;
    @Column(name = "allshg_without_lokos")
    private Integer allShgWithoutLokos;
    @Column(name = "allmem_without_lokos")
    private Integer allMemWithoutLokos;
    @Column(name = "allshg_active")
    private Integer allShgActive;
    @Column(name = "allmem_active")
    private Integer allMemActive;
    @Column(name = "allshg_inactive_mig")
    private Integer allShgInactiveMig;
    @Column(name = "allmem_inactive_mig")
    private Integer allMemInactiveMig;
    @Column(name = "allshg_inactive_lokos")
    private Integer allShgInactiveLokos;
    @Column(name = "allmem_inactive_lokos")
    private Integer allMemInactiveLokos;
    @Column(name = "complete_shg_nic_lokos")
    private Integer completeShgNicLokos;
    @Column(name = "complete_mem_nic_lokos")
    private Integer completeMemNicLokos;
    @Column(name = "incomplete_shg_due_5_mem_nic")
    private Integer incompleteShgDue5MemNic;
    @Column(name = "incomplete_mem_due_5_mem_nic")
    private Integer incompleteMemDue5MemNic;
    @Column(name = "incomplete_shg_due_5_mem_lok")
    private Integer incompleteShgDue5MemLok;
    @Column(name = "incomplete_mem_due_5_mem_lok")
    private Integer incompleteMemDue5MemLok;
    @Column(name = "state_project_reviwed")
    private Integer stateProjectReviwed;
    @Column(name = "ngo_noncoopted_reviwed")
    private Integer ngoNoncooptedReviwed;
    @Column(name = "other_reviwed")
    private Integer otherReviwed;
    @Column(name = "allmem_count")
    private Integer allmemCount;
    @Column(name = "allshg_count")
    private Integer allShgCount;
    @Column(name = "all_shg_formed_month")
    private Integer allShgFormedMonth;
    @Column(name = "all_shg_members_joined_month")
    private Integer allShgMembersJoinedMonth;
    public Integer getMemActivated() {
        return memActivated;
    }

    public void setMemActivated(Integer memActivated) {
        this.memActivated = memActivated;
    }

    public Integer getVoActivated() {
        return voActivated;
    }

    public void setVoActivated(Integer voActivated) {
        this.voActivated = voActivated;
    }

    public Integer getClfActivated() {
        return clfActivated;
    }

    public void setClfActivated(Integer clfActivated) {
        this.clfActivated = clfActivated;
    }

    public Integer getShgActivated() {
        return shgActivated;
    }

    public void setShgActivated(Integer shgActivated) {
        this.shgActivated = shgActivated;
    }

    public Integer getMonthOld12to24Month() {
        return monthOld12to24Month;
    }

    public void setMonthOld12to24Month(Integer monthOld12to24Month) {
        this.monthOld12to24Month = monthOld12to24Month;
    }

    public Integer getMonthsOld24to60Month() {
        return monthsOld24to60Month;
    }

    public void setMonthsOld24to60Month(Integer monthsOld24to60Month) {
        this.monthsOld24to60Month = monthsOld24to60Month;
    }

    public Integer getMonthsOld60to120Month() {
        return monthsOld60to120Month;
    }

    public void setMonthsOld60to120Month(Integer monthsOld60to120Month) {
        this.monthsOld60to120Month = monthsOld60to120Month;
    }

    public Integer getMonthsOld120MoreMonth() {
        return monthsOld120MoreMonth;
    }

    public void setMonthsOld120MoreMonth(Integer monthsOld120MoreMonth) {
        this.monthsOld120MoreMonth = monthsOld120MoreMonth;
    }

    public Integer getMemMobile() {
        return memMobile;
    }

    public void setMemMobile(Integer memMobile) {
        this.memMobile = memMobile;
    }

    public Integer getShgObcMonth() {
        return shgObcMonth;
    }

    public void setShgObcMonth(Integer shgObcMonth) {
        this.shgObcMonth = shgObcMonth;
    }

    public Integer getShgMemObcMonth() {
        return shgMemObcMonth;
    }

    public void setShgMemObcMonth(Integer shgMemObcMonth) {
        this.shgMemObcMonth = shgMemObcMonth;
    }

    public Integer getEducationUptoGradAndAboveMonth() {
        return educationUptoGradAndAboveMonth;
    }

    public void setEducationUptoGradAndAboveMonth(Integer educationUptoGradAndAboveMonth) {
        this.educationUptoGradAndAboveMonth = educationUptoGradAndAboveMonth;
    }

    public Integer getEducationuptoGradandabveLeaderMonth() {
        return educationuptoGradandabveLeaderMonth;
    }

    public void setEducationuptoGradandabveLeaderMonth(Integer educationuptoGradandabveLeaderMonth) {
        this.educationuptoGradandabveLeaderMonth = educationuptoGradandabveLeaderMonth;
    }

    public Integer getIsSaturated() {
        return isSaturated;
    }

    public void setIsSaturated(Integer isSaturated) {
        this.isSaturated = isSaturated;
    }

    public BigInteger getId() {
        return id;
    }

    public Integer getMemWages() {
        return memWages;
    }

    public void setMemWages(Integer memWages) {
        this.memWages = memWages;
    }

    public Integer getMemCaderService() {
        return memCaderService;
    }

    public void setMemCaderService(Integer memCaderService) {
        this.memCaderService = memCaderService;
    }

    public Integer getMemOthers() {
        return memOthers;
    }

    public void setMemOthers(Integer memOthers) {
        this.memOthers = memOthers;
    }

    public Integer getShgLiveAggregation() {
        return shgLiveAggregation;
    }

    public void setShgLiveAggregation(Integer shgLiveAggregation) {
        this.shgLiveAggregation = shgLiveAggregation;
    }

    public Integer getShgLiveOthers() {
        return shgLiveOthers;
    }

    public void setShgLiveOthers(Integer shgLiveOthers) {
        this.shgLiveOthers = shgLiveOthers;
    }

    public Integer getWagesLeader() {
        return wagesLeader;
    }

    public void setWagesLeader(Integer wagesLeader) {
        this.wagesLeader = wagesLeader;
    }

    public Integer getShgLeaderCaderService() {
        return shgLeaderCaderService;
    }

    public void setShgLeaderCaderService(Integer shgLeaderCaderService) {
        this.shgLeaderCaderService = shgLeaderCaderService;
    }

    public Integer getShgLeaderOther() {
        return shgLeaderOther;
    }

    public void setShgLeaderOther(Integer shgLeaderOther) {
        this.shgLeaderOther = shgLeaderOther;
    }
    public Integer getShgMem() {
        return shgMem;
    }
    public void setShgMem(Integer shgMem) {
        this.shgMem = shgMem;
    }
    public Integer getShgApprovedMonth() {
        return shgApprovedMonth;
    }

    public void setShgApprovedMonth(Integer shgApprovedMonth) {
        this.shgApprovedMonth = shgApprovedMonth;
    }

    public Integer getVoApprovedMonth() {
        return voApprovedMonth;
    }

    public void setVoApprovedMonth(Integer voApprovedMonth) {
        this.voApprovedMonth = voApprovedMonth;
    }

    public Integer getClfApprovedMonth() {
        return clfApprovedMonth;
    }

    public void setClfApprovedMonth(Integer clfApprovedMonth) {
        this.clfApprovedMonth = clfApprovedMonth;
    }

    public Integer getMemServices() {
        return memServices;
    }

    public void setMemServices(Integer memServices) {
        this.memServices = memServices;
    }

    public Integer getShgLeaderAgricultural() {
        return shgLeaderAgricultural;
    }

    public void setShgLeaderAgricultural(Integer shgLeaderAgricultural) {
        this.shgLeaderAgricultural = shgLeaderAgricultural;
    }

    public Integer getShgLeaderHorticulture() {
        return shgLeaderHorticulture;
    }

    public void setShgLeaderHorticulture(Integer shgLeaderHorticulture) {
        this.shgLeaderHorticulture = shgLeaderHorticulture;
    }

    public Integer getShgLeaderLivestock() {
        return shgLeaderLivestock;
    }

    public void setShgLeaderLivestock(Integer shgLeaderLivestock) {
        this.shgLeaderLivestock = shgLeaderLivestock;
    }

    public Integer getShgLeaderFishery() {
        return shgLeaderFishery;
    }

    public void setShgLeaderFishery(Integer shgLeaderFishery) {
        this.shgLeaderFishery = shgLeaderFishery;
    }

    public Integer getShgLeaderNtfp() {
        return shgLeaderNtfp;
    }

    public void setShgLeaderNtfp(Integer shgLeaderNtfp) {
        this.shgLeaderNtfp = shgLeaderNtfp;
    }

    public Integer getShgLeaderManufacturing() {
        return shgLeaderManufacturing;
    }

    public void setShgLeaderManufacturing(Integer shgLeaderManufacturing) {
        this.shgLeaderManufacturing = shgLeaderManufacturing;
    }

    public Integer getShgLeaderTrading() {
        return shgLeaderTrading;
    }

    public void setShgLeaderTrading(Integer shgLeaderTrading) {
        this.shgLeaderTrading = shgLeaderTrading;
    }

    public Integer getShgLeaderServices() {
        return shgLeaderServices;
    }

    public void setShgLeaderServices(Integer shgLeaderServices) {
        this.shgLeaderServices = shgLeaderServices;
    }
    public Integer getMemAgricultural() {
        return memAgricultural;
    }

    public void setMemAgricultural(Integer memAgricultural) {
        this.memAgricultural = memAgricultural;
    }

    public Integer getMemHorticulture() {
        return memHorticulture;
    }

    public void setMemHorticulture(Integer memHorticulture) {
        this.memHorticulture = memHorticulture;
    }

    public Integer getMemLivestock() {
        return memLivestock;
    }

    public void setMemLivestock(Integer memLivestock) {
        this.memLivestock = memLivestock;
    }

    public Integer getMemFishery() {
        return memFishery;
    }

    public void setMemFishery(Integer memFishery) {
        this.memFishery = memFishery;
    }

    public Integer getMemNtfp() {
        return memNtfp;
    }

    public void setMemNtfp(Integer memNtfp) {
        this.memNtfp = memNtfp;
    }

    public Integer getMemManufacturing() {
        return memManufacturing;
    }

    public void setMemManufacturing(Integer memManufacturing) {
        this.memManufacturing = memManufacturing;
    }

    public Integer getMemTrading() {
        return memTrading;
    }

    public void setMemTrading(Integer memTrading) {
        this.memTrading = memTrading;
    }

    public Integer getShgAgricultural() {
        return shgAgricultural;
    }

    public void setShgAgricultural(Integer shgAgricultural) {
        this.shgAgricultural = shgAgricultural;
    }

    public Integer getShgHorticulture() {
        return shgHorticulture;
    }

    public void setShgHorticulture(Integer shgHorticulture) {
        this.shgHorticulture = shgHorticulture;
    }

    public Integer getShgLivestock() {
        return shgLivestock;
    }

    public void setShgLivestock(Integer shgLivestock) {
        this.shgLivestock = shgLivestock;
    }

    public Integer getShgFishery() {
        return shgFishery;
    }

    public void setShgFishery(Integer shgFishery) {
        this.shgFishery = shgFishery;
    }

    public Integer getShgNtfp() {
        return shgNtfp;
    }

    public void setShgNtfp(Integer shgNtfp) {
        this.shgNtfp = shgNtfp;
    }

    public Integer getShgManufacturing() {
        return shgManufacturing;
    }

    public void setShgManufacturing(Integer shgManufacturing) {
        this.shgManufacturing = shgManufacturing;
    }

    public Integer getShgTrading() {
        return shgTrading;
    }

    public void setShgTrading(Integer shgTrading) {
        this.shgTrading = shgTrading;
    }

    public Integer getShgServices() {
        return shgServices;
    }

    public void setShgServices(Integer shgServices) {
        this.shgServices = shgServices;
    }

    public Integer getShgCustomHiring() {
        return shgCustomHiring;
    }

    public void setShgCustomHiring(Integer shgCustomHiring) {
        this.shgCustomHiring = shgCustomHiring;
    }

    public Integer getShgMemApproved() {
        return shgMemApproved;
    }

    public void setShgMemApproved(Integer shgMemApproved) {
        this.shgMemApproved = shgMemApproved;
    }

    public Integer getVoCount() {
        return voCount;
    }

    public void setVoCount(Integer voCount) {
        this.voCount = voCount;
    }

    public Integer getVoMemApproved() {
        return voMemApproved;
    }

    public void setVoMemApproved(Integer voMemApproved) {
        this.voMemApproved = voMemApproved;
    }

    public Integer getClfCount() {
        return clfCount;
    }

    public void setClfCount(Integer clfCount) {
        this.clfCount = clfCount;
    }

    public Integer getClfShg() {
        return clfShg;
    }

    public void setClfShg(Integer clfShg) {
        this.clfShg = clfShg;
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

    public Integer getMonthsOld3Month() {
        return monthsOld3Month;
    }

    public void setMonthsOld3Month(Integer monthsOld3Month) {
        this.monthsOld3Month = monthsOld3Month;
    }

    public Integer getMonthsOld6Month() {
        return monthsOld6Month;
    }

    public void setMonthsOld6Month(Integer monthsOld6Month) {
        this.monthsOld6Month = monthsOld6Month;
    }

    public Integer getMonthsOld9Month() {
        return monthsOld9Month;
    }

    public void setMonthsOld9Month(Integer monthsOld9Month) {
        this.monthsOld9Month = monthsOld9Month;
    }

    public Integer getMonthsOld12Month() {
        return monthsOld12Month;
    }

    public void setMonthsOld12Month(Integer monthsOld12Month) {
        this.monthsOld12Month = monthsOld12Month;
    }

    public Integer getMonthsOld12MoreMonth() {
        return monthsOld12MoreMonth;
    }

    public void setMonthsOld12MoreMonth(Integer monthsOld12MoreMonth) {
        this.monthsOld12MoreMonth = monthsOld12MoreMonth;
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

    public Integer getShgCount() {
        return shgCount;
    }

    public void setShgCount(Integer shgCount) {
        this.shgCount = shgCount;
    }
    public Integer getShgLeaderMonth() {
        return shgLeaderMonth;
    }

    public void setShgLeaderMonth(Integer shgLeaderMonth) {
        this.shgLeaderMonth = shgLeaderMonth;
    }

    public Integer getIlliteratememLeaderMonth() {
        return illiteratememLeaderMonth;
    }

    public void setIlliteratememLeaderMonth(Integer illiteratememLeaderMonth) {
        this.illiteratememLeaderMonth = illiteratememLeaderMonth;
    }

    public Integer getFunctionalliteracymemLeaderMonth() {
        return functionalliteracymemLeaderMonth;
    }

    public void setFunctionalliteracymemLeaderMonth(Integer functionalliteracymemLeaderMonth) {
        this.functionalliteracymemLeaderMonth = functionalliteracymemLeaderMonth;
    }

    public Integer getEducationupto5LeaderMonth() {
        return educationupto5LeaderMonth;
    }

    public void setEducationupto5LeaderMonth(Integer educationupto5LeaderMonth) {
        this.educationupto5LeaderMonth = educationupto5LeaderMonth;
    }

    public Integer getEducationupto8LeaderMonth() {
        return educationupto8LeaderMonth;
    }

    public void setEducationupto8LeaderMonth(Integer educationupto8LeaderMonth) {
        this.educationupto8LeaderMonth = educationupto8LeaderMonth;
    }

    public Integer getEducationupto12LeaderMonth() {
        return educationupto12LeaderMonth;
    }

    public void setEducationupto12LeaderMonth(Integer educationupto12LeaderMonth) {
        this.educationupto12LeaderMonth = educationupto12LeaderMonth;
    }

    public Integer getVocationalTrainingmemLeaderMonth() {
        return vocationalTrainingmemLeaderMonth;
    }

    public void setVocationalTrainingmemLeaderMonth(Integer vocationalTrainingmemLeaderMonth) {
        this.vocationalTrainingmemLeaderMonth = vocationalTrainingmemLeaderMonth;
    }

    public Integer getOtheredumemLeaderMonth() {
        return otheredumemLeaderMonth;
    }

    public void setOtheredumemLeaderMonth(Integer otheredumemLeaderMonth) {
        this.otheredumemLeaderMonth = otheredumemLeaderMonth;
    }

    public Integer getClfbanklinkageMonth() {
        return clfbanklinkageMonth;
    }

    public void setClfbanklinkageMonth(Integer clfbanklinkageMonth) {
        this.clfbanklinkageMonth = clfbanklinkageMonth;
    }

    public Integer getClfassetverificationMonth() {
        return clfassetverificationMonth;
    }

    public void setClfassetverificationMonth(Integer clfassetverificationMonth) {
        this.clfassetverificationMonth = clfassetverificationMonth;
    }

    public Integer getClflivelihoodpromoMonth() {
        return clflivelihoodpromoMonth;
    }

    public void setClflivelihoodpromoMonth(Integer clflivelihoodpromoMonth) {
        this.clflivelihoodpromoMonth = clflivelihoodpromoMonth;
    }

    public Integer getClfmonitoringMonth() {
        return clfmonitoringMonth;
    }

    public void setClfmonitoringMonth(Integer clfmonitoringMonth) {
        this.clfmonitoringMonth = clfmonitoringMonth;
    }

    public Integer getClfsocialactionMonth() {
        return clfsocialactionMonth;
    }

    public void setClfsocialactionMonth(Integer clfsocialactionMonth) {
        this.clfsocialactionMonth = clfsocialactionMonth;
    }

    public Integer getClfspecialMonth() {
        return clfspecialMonth;
    }

    public void setClfspecialMonth(Integer clfspecialMonth) {
        this.clfspecialMonth = clfspecialMonth;
    }

    public Integer getVobanklinkageMonth() {
        return vobanklinkageMonth;
    }

    public void setVobanklinkageMonth(Integer vobanklinkageMonth) {
        this.vobanklinkageMonth = vobanklinkageMonth;
    }

    public Integer getVoassetverificationMonth() {
        return voassetverificationMonth;
    }

    public void setVoassetverificationMonth(Integer voassetverificationMonth) {
        this.voassetverificationMonth = voassetverificationMonth;
    }

    public Integer getVolivelihoodpromoMonth() {
        return volivelihoodpromoMonth;
    }

    public void setVolivelihoodpromoMonth(Integer volivelihoodpromoMonth) {
        this.volivelihoodpromoMonth = volivelihoodpromoMonth;
    }

    public Integer getVomonitoringMonth() {
        return vomonitoringMonth;
    }

    public void setVomonitoringMonth(Integer vomonitoringMonth) {
        this.vomonitoringMonth = vomonitoringMonth;
    }

    public Integer getVosocialactionMonth() {
        return vosocialactionMonth;
    }

    public void setVosocialactionMonth(Integer vosocialactionMonth) {
        this.vosocialactionMonth = vosocialactionMonth;
    }

    public Integer getVospecialMonth() {
        return vospecialMonth;
    }

    public void setVospecialMonth(Integer vospecialMonth) {
        this.vospecialMonth = vospecialMonth;
    }

    public Integer getWomenshgMonth() {
        return womenshgMonth;
    }

    public void setWomenshgMonth(Integer womenshgMonth) {
        this.womenshgMonth = womenshgMonth;
    }

    public Integer getPvtgshgMonth() {
        return pvtgshgMonth;
    }

    public void setPvtgshgMonth(Integer pvtgshgMonth) {
        this.pvtgshgMonth = pvtgshgMonth;
    }

    public Integer getPwdshgMonth() {
        return pwdshgMonth;
    }

    public void setPwdshgMonth(Integer pwdshgMonth) {
        this.pwdshgMonth = pwdshgMonth;
    }

    public Integer getElderlyshgMonth() {
        return elderlyshgMonth;
    }

    public void setElderlyshgMonth(Integer elderlyshgMonth) {
        this.elderlyshgMonth = elderlyshgMonth;
    }

    public Integer getOthertypeshgMonth() {
        return othertypeshgMonth;
    }

    public void setOthertypeshgMonth(Integer othertypeshgMonth) {
        this.othertypeshgMonth = othertypeshgMonth;
    }

    public Integer getIlliterateMem() {
        return illiterateMem;
    }

    public void setIlliterateMem(Integer illiterateMem) {
        this.illiterateMem = illiterateMem;
    }

    public Integer getFunctionalLiteracyMem() {
        return functionalLiteracyMem;
    }

    public void setFunctionalLiteracyMem(Integer functionalLiteracyMem) {
        this.functionalLiteracyMem = functionalLiteracyMem;
    }

    public Integer getEducationUpto5() {
        return educationUpto5;
    }

    public void setEducationUpto5(Integer educationUpto5) {
        this.educationUpto5 = educationUpto5;
    }

    public Integer getEducationUpto8() {
        return educationUpto8;
    }

    public void setEducationUpto8(Integer educationUpto8) {
        this.educationUpto8 = educationUpto8;
    }

    public Integer getEducationUpto12() {
        return educationUpto12;
    }

    public void setEducationUpto12(Integer educationUpto12) {
        this.educationUpto12 = educationUpto12;
    }

    public Integer getVocationalTrainingMem() {
        return vocationalTrainingMem;
    }

    public void setVocationalTrainingMem(Integer vocationalTrainingMem) {
        this.vocationalTrainingMem = vocationalTrainingMem;
    }

    public Integer getOtherEduMem() {
        return otherEduMem;
    }

    public void setOtherEduMem(Integer otherEduMem) {
        this.otherEduMem = otherEduMem;
    }

    public Integer getShgWithBankAccount() {
        return shgWithBankAccount;
    }

    public void setShgWithBankAccount(Integer shgWithBankAccount) {
        this.shgWithBankAccount = shgWithBankAccount;
    }

    public Integer getVoWithBankAccount() {
        return voWithBankAccount;
    }

    public void setVoWithBankAccount(Integer voWithBankAccount) {
        this.voWithBankAccount = voWithBankAccount;
    }

    public Integer getClfWithBankAccount() {
        return clfWithBankAccount;
    }

    public void setClfWithBankAccount(Integer clfWithBankAccount) {
        this.clfWithBankAccount = clfWithBankAccount;
    }

    public Integer getShgBankAcount1() {
        return shgBankAcount1;
    }

    public void setShgBankAcount1(Integer shgBankAcount1) {
        this.shgBankAcount1 = shgBankAcount1;
    }

    public Integer getShgBankAcount2() {
        return shgBankAcount2;
    }

    public void setShgBankAcount2(Integer shgBankAcount2) {
        this.shgBankAcount2 = shgBankAcount2;
    }

    public Integer getMemWithBankAccount() {
        return memWithBankAccount;
    }

    public void setMemWithBankAccount(Integer memWithBankAccount) {
        this.memWithBankAccount = memWithBankAccount;
    }

    public Integer getMemWithAdhaar() {
        return memWithAdhaar;
    }

    public void setMemWithAdhaar(Integer memWithAdhaar) {
        this.memWithAdhaar = memWithAdhaar;
    }

    public Integer getMemWithSecct() {
        return memWithSecct;
    }

    public void setMemWithSecct(Integer memWithSecct) {
        this.memWithSecct = memWithSecct;
    }
    public Integer getTotalDistict() {
        return totalDistict;
    }

    public void setTotalDistict(Integer totalDistict) {
        this.totalDistict = totalDistict;
    }

    public Integer getTotalBlock() {
        return totalBlock;
    }

    public void setTotalBlock(Integer totalBlock) {
        this.totalBlock = totalBlock;
    }

    public Integer getTotalGP() {
        return totalGP;
    }

    public void setTotalGP(Integer totalGP) {
        this.totalGP = totalGP;
    }

    public Integer getTotalVillage() {
        return totalVillage;
    }

    public void setTotalVillage(Integer totalVillage) {
        this.totalVillage = totalVillage;
    }

    public Integer getTotalDistrictCoverage() {
        return totalDistrictCoverage;
    }

    public void setTotalDistrictCoverage(Integer totalDistrictCoverage) {
        this.totalDistrictCoverage = totalDistrictCoverage;
    }

    public Integer getTotalBlockCoverage() {
        return totalBlockCoverage;
    }

    public void setTotalBlockCoverage(Integer totalBlockCoverage) {
        this.totalBlockCoverage = totalBlockCoverage;
    }

    public Integer getTotalGPCoverage() {
        return totalGPCoverage;
    }

    public void setTotalGPCoverage(Integer totalGPCoverage) {
        this.totalGPCoverage = totalGPCoverage;
    }

    public Integer getTotalVillageCoverage() {
        return totalVillageCoverage;
    }

    public void setTotalVillageCoverage(Integer totalVillageCoverage) {
        this.totalVillageCoverage = totalVillageCoverage;
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

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getPanchayatName() {
        return panchayatName;
    }

    public void setPanchayatName(String panchayatName) {
        this.panchayatName = panchayatName;
    }

    public Integer getShgApproved() {
        return shgApproved;
    }

    public void setShgApproved(Integer shgApproved) {
        this.shgApproved = shgApproved;
    }

    public Integer getShgInactiveMonth() {
        return shgInactiveMonth;
    }

    public void setShgInactiveMonth(Integer shgInactiveMonth) {
        this.shgInactiveMonth = shgInactiveMonth;
    }

    public Integer getShgInactiveMemberMonth() {
        return shgInactiveMemberMonth;
    }

    public void setShgInactiveMemberMonth(Integer shgInactiveMemberMonth) {
        this.shgInactiveMemberMonth = shgInactiveMemberMonth;
    }

    public Integer getVoApproved() {
        return voApproved;
    }

    public void setVoApproved(Integer voApproved) {
        this.voApproved = voApproved;
    }

    public Integer getVoInactiveMonth() {
        return voInactiveMonth;
    }

    public void setVoInactiveMonth(Integer voInactiveMonth) {
        this.voInactiveMonth = voInactiveMonth;
    }

    public Integer getClfApproved() {
        return clfApproved;
    }

    public void setClfApproved(Integer clfApproved) {
        this.clfApproved = clfApproved;
    }

    public Integer getClfInactiveMonth() {
        return clfInactiveMonth;
    }

    public void setClfInactiveMonth(Integer clfInactiveMonth) {
        this.clfInactiveMonth = clfInactiveMonth;
    }
    public Integer getShgFormedMonth() {
        return shgFormedMonth;
    }

    public void setShgFormedMonth(Integer shgFormedMonth) {
        this.shgFormedMonth = shgFormedMonth;
    }

    public Integer getShgMembersJoinedMonth() {
        return shgMembersJoinedMonth;
    }

    public void setShgMembersJoinedMonth(Integer shgMembersJoinedMonth) {
        this.shgMembersJoinedMonth = shgMembersJoinedMonth;
    }

    public Integer getVoFormedMonth() {
        return voFormedMonth;
    }

    public void setVoFormedMonth(Integer voFormedMonth) {
        this.voFormedMonth = voFormedMonth;
    }

    public Integer getVoShgFormedMonth() {
        return voShgFormedMonth;
    }

    public void setVoShgFormedMonth(Integer voShgFormedMonth) {
        this.voShgFormedMonth = voShgFormedMonth;
    }

    public Integer getVoMemberFormedMonth() {
        return voMemberFormedMonth;
    }

    public void setVoMemberFormedMonth(Integer voMemberFormedMonth) {
        this.voMemberFormedMonth = voMemberFormedMonth;
    }

    public Integer getClfFormedMonth() {
        return clfFormedMonth;
    }

    public void setClfFormedMonth(Integer clfFormedMonth) {
        this.clfFormedMonth = clfFormedMonth;
    }

    public Integer getClfMemberFormedMonth() {
        return clfMemberFormedMonth;
    }

    public void setClfMemberFormedMonth(Integer clfMemberFormedMonth) {
        this.clfMemberFormedMonth = clfMemberFormedMonth;
    }

    public Integer getClfShgFormedMonth() {
        return clfShgFormedMonth;
    }

    public void setClfShgFormedMonth(Integer clfShgFormedMonth) {
        this.clfShgFormedMonth = clfShgFormedMonth;
    }

    public Integer getClfVoFormedMonth() {
        return clfVoFormedMonth;
    }

    public void setClfVoFormedMonth(Integer clfVoFormedMonth) {
        this.clfVoFormedMonth = clfVoFormedMonth;
    }
    public Integer getAgeBlock() {
        return ageBlock;
    }

    public void setAgeBlock(Integer ageBlock) {
        this.ageBlock = ageBlock;
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
    public Integer getTotalRuralHouseholds() {
        return totalRuralHouseholds;
    }

    public void setTotalRuralHouseholds(Integer totalRuralHouseholds) {
        this.totalRuralHouseholds = totalRuralHouseholds;
    }

    public Integer getTargetRuralHouseholds() {
        return targetRuralHouseholds;
    }

    public void setTargetRuralHouseholds(Integer targetRuralHouseholds) {
        this.targetRuralHouseholds = targetRuralHouseholds;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getShgOtherMonth() {
        return shgOtherMonth;
    }

    public void setShgOtherMonth(Integer shgOtherMonth) {
        this.shgOtherMonth = shgOtherMonth;
    }

    public Integer getShgMemOtherMonth() {
        return shgMemOtherMonth;
    }

    public void setShgMemOtherMonth(Integer shgMemOtherMonth) {
        this.shgMemOtherMonth = shgMemOtherMonth;
    }

    public Integer getShgLastDay() {
        return shgLastDay;
    }

    public void setShgLastDay(Integer shgLastDay) {
        this.shgLastDay = shgLastDay;
    }

    public Integer getMemLastDay() {
        return memLastDay;
    }

    public void setMemLastDay(Integer memLastDay) {
        this.memLastDay = memLastDay;
    }
    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
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

    public Integer getShgTot() {
        return shgTot;
    }

    public void setShgTot(Integer shgTot) {
        this.shgTot = shgTot;
    }

    public Integer getApprovedNicShgBpm() {
        return approvedNicShgBpm;
    }

    public void setApprovedNicShgBpm(Integer approvedNicShgBpm) {
        this.approvedNicShgBpm = approvedNicShgBpm;
    }

    public Integer getPendingNicShgBpm() {
        return pendingNicShgBpm;
    }

    public void setPendingNicShgBpm(Integer pendingNicShgBpm) {
        this.pendingNicShgBpm = pendingNicShgBpm;
    }

    public Integer getRejectedNicShgBpm() {
        return rejectedNicShgBpm;
    }

    public void setRejectedNicShgBpm(Integer rejectedNicShgBpm) {
        this.rejectedNicShgBpm = rejectedNicShgBpm;
    }

    public Integer getLokosShg() {
        return lokosShg;
    }

    public void setLokosShg(Integer lokosShg) {
        this.lokosShg = lokosShg;
    }

    public Integer getApprovedLokosShgBpm() {
        return approvedLokosShgBpm;
    }

    public void setApprovedLokosShgBpm(Integer approvedLokosShgBpm) {
        this.approvedLokosShgBpm = approvedLokosShgBpm;
    }

    public Integer getPendingLokosShgBpm() {
        return pendingLokosShgBpm;
    }

    public void setPendingLokosShgBpm(Integer pendingLokosShgBpm) {
        this.pendingLokosShgBpm = pendingLokosShgBpm;
    }

    public Integer getRejectedLokosShgBpm() {
        return rejectedLokosShgBpm;
    }

    public void setRejectedLokosShgBpm(Integer rejectedLokosShgBpm) {
        this.rejectedLokosShgBpm = rejectedLokosShgBpm;
    }

    public Integer getNicMem() {
        return nicMem;
    }

    public void setNicMem(Integer nicMem) {
        this.nicMem = nicMem;
    }

    public Integer getApproveNicMem() {
        return approveNicMem;
    }

    public void setApproveNicMem(Integer approveNicMem) {
        this.approveNicMem = approveNicMem;
    }

    public Integer getPendingNicMem() {
        return pendingNicMem;
    }

    public void setPendingNicMem(Integer pendingNicMem) {
        this.pendingNicMem = pendingNicMem;
    }

    public Integer getRejectedNicMem() {
        return rejectedNicMem;
    }

    public void setRejectedNicMem(Integer rejectedNicMem) {
        this.rejectedNicMem = rejectedNicMem;
    }

    public Integer getLokosMem() {
        return lokosMem;
    }

    public void setLokosMem(Integer lokosMem) {
        this.lokosMem = lokosMem;
    }

    public Integer getApproveLokosMem() {
        return approveLokosMem;
    }

    public void setApproveLokosMem(Integer approveLokosMem) {
        this.approveLokosMem = approveLokosMem;
    }

    public Integer getPendingLokosMem() {
        return pendingLokosMem;
    }

    public void setPendingLokosMem(Integer pendingLokosMem) {
        this.pendingLokosMem = pendingLokosMem;
    }

    public Integer getRejectedLokosMem() {
        return rejectedLokosMem;
    }

    public void setRejectedLokosMem(Integer rejectedLokosMem) {
        this.rejectedLokosMem = rejectedLokosMem;
    }

    public Integer getNrlmPromotedBy() {
        return nrlmPromotedBy;
    }

    public void setNrlmPromotedBy(Integer nrlmPromotedBy) {
        this.nrlmPromotedBy = nrlmPromotedBy;
    }

    public Integer getStateProjectPromotedBy() {
        return stateProjectPromotedBy;
    }

    public void setStateProjectPromotedBy(Integer stateProjectPromotedBy) {
        this.stateProjectPromotedBy = stateProjectPromotedBy;
    }

    public Integer getNgoPromotedBy() {
        return ngoPromotedBy;
    }

    public void setNgoPromotedBy(Integer ngoPromotedBy) {
        this.ngoPromotedBy = ngoPromotedBy;
    }

    public Integer getSgsyPromotedBy() {
        return sgsyPromotedBy;
    }

    public void setSgsyPromotedBy(Integer sgsyPromotedBy) {
        this.sgsyPromotedBy = sgsyPromotedBy;
    }

    public Integer getOtherPromotedBy() {
        return otherPromotedBy;
    }

    public void setOtherPromotedBy(Integer otherPromotedBy) {
        this.otherPromotedBy = otherPromotedBy;
    }

    public Integer getStateProjectCoopted() {
        return stateProjectCoopted;
    }

    public void setStateProjectCoopted(Integer stateProjectCoopted) {
        this.stateProjectCoopted = stateProjectCoopted;
    }

    public Integer getStateProjectNoncoopted() {
        return stateProjectNoncoopted;
    }

    public void setStateProjectNoncoopted(Integer stateProjectNoncoopted) {
        this.stateProjectNoncoopted = stateProjectNoncoopted;
    }

    public Integer getNgoCoopted() {
        return ngoCoopted;
    }

    public void setNgoCoopted(Integer ngoCoopted) {
        this.ngoCoopted = ngoCoopted;
    }

    public Integer getNgoNoncoopted() {
        return ngoNoncoopted;
    }

    public void setNgoNoncoopted(Integer ngoNoncoopted) {
        this.ngoNoncoopted = ngoNoncoopted;
    }

    public Integer getOtherCoopted() {
        return otherCoopted;
    }

    public void setOtherCoopted(Integer otherCoopted) {
        this.otherCoopted = otherCoopted;
    }

    public Integer getOtherNoncoopted() {
        return otherNoncoopted;
    }

    public void setOtherNoncoopted(Integer otherNoncoopted) {
        this.otherNoncoopted = otherNoncoopted;
    }

    public Integer getAllShgwithBankAccount() {
        return allShgwithBankAccount;
    }

    public void setAllShgwithBankAccount(Integer allShgwithBankAccount) {
        this.allShgwithBankAccount = allShgwithBankAccount;
    }

    public Integer getAllShgwithBankAccountMem() {
        return allShgwithBankAccountMem;
    }

    public void setAllShgwithBankAccountMem(Integer allShgwithBankAccountMem) {
        this.allShgwithBankAccountMem = allShgwithBankAccountMem;
    }

    public Integer getAllShgWithoutMig() {
        return allShgWithoutMig;
    }

    public void setAllShgWithoutMig(Integer allShgWithoutMig) {
        this.allShgWithoutMig = allShgWithoutMig;
    }

    public Integer getAllMemWithoutMig() {
        return allMemWithoutMig;
    }

    public void setAllMemWithoutMig(Integer allMemWithoutMig) {
        this.allMemWithoutMig = allMemWithoutMig;
    }

    public Integer getAllShgWithoutLokos() {
        return allShgWithoutLokos;
    }

    public void setAllShgWithoutLokos(Integer allShgWithoutLokos) {
        this.allShgWithoutLokos = allShgWithoutLokos;
    }

    public Integer getAllMemWithoutLokos() {
        return allMemWithoutLokos;
    }

    public void setAllMemWithoutLokos(Integer allMemWithoutLokos) {
        this.allMemWithoutLokos = allMemWithoutLokos;
    }

    public Integer getAllShgActive() {
        return allShgActive;
    }

    public void setAllShgActive(Integer allShgActive) {
        this.allShgActive = allShgActive;
    }

    public Integer getAllMemActive() {
        return allMemActive;
    }

    public void setAllMemActive(Integer allMemActive) {
        this.allMemActive = allMemActive;
    }

    public Integer getAllShgInactiveMig() {
        return allShgInactiveMig;
    }

    public void setAllShgInactiveMig(Integer allShgInactiveMig) {
        this.allShgInactiveMig = allShgInactiveMig;
    }

    public Integer getAllMemInactiveMig() {
        return allMemInactiveMig;
    }

    public void setAllMemInactiveMig(Integer allMemInactiveMig) {
        this.allMemInactiveMig = allMemInactiveMig;
    }

    public Integer getAllShgInactiveLokos() {
        return allShgInactiveLokos;
    }

    public void setAllShgInactiveLokos(Integer allShgInactiveLokos) {
        this.allShgInactiveLokos = allShgInactiveLokos;
    }

    public Integer getAllMemInactiveLokos() {
        return allMemInactiveLokos;
    }

    public void setAllMemInactiveLokos(Integer allMemInactiveLokos) {
        this.allMemInactiveLokos = allMemInactiveLokos;
    }

    public Integer getCompleteShgNicLokos() {
        return completeShgNicLokos;
    }

    public void setCompleteShgNicLokos(Integer completeShgNicLokos) {
        this.completeShgNicLokos = completeShgNicLokos;
    }

    public Integer getCompleteMemNicLokos() {
        return completeMemNicLokos;
    }

    public void setCompleteMemNicLokos(Integer completeMemNicLokos) {
        this.completeMemNicLokos = completeMemNicLokos;
    }

    public Integer getIncompleteShgDue5MemNic() {
        return incompleteShgDue5MemNic;
    }

    public void setIncompleteShgDue5MemNic(Integer incompleteShgDue5MemNic) {
        this.incompleteShgDue5MemNic = incompleteShgDue5MemNic;
    }

    public Integer getIncompleteMemDue5MemNic() {
        return incompleteMemDue5MemNic;
    }

    public void setIncompleteMemDue5MemNic(Integer incompleteMemDue5MemNic) {
        this.incompleteMemDue5MemNic = incompleteMemDue5MemNic;
    }

    public Integer getIncompleteShgDue5MemLok() {
        return incompleteShgDue5MemLok;
    }

    public void setIncompleteShgDue5MemLok(Integer incompleteShgDue5MemLok) {
        this.incompleteShgDue5MemLok = incompleteShgDue5MemLok;
    }

    public Integer getIncompleteMemDue5MemLok() {
        return incompleteMemDue5MemLok;
    }

    public void setIncompleteMemDue5MemLok(Integer incompleteMemDue5MemLok) {
        this.incompleteMemDue5MemLok = incompleteMemDue5MemLok;
    }

    public Integer getStateProjectReviwed() {
        return stateProjectReviwed;
    }

    public void setStateProjectReviwed(Integer stateProjectReviwed) {
        this.stateProjectReviwed = stateProjectReviwed;
    }

    public Integer getNgoNoncooptedReviwed() {
        return ngoNoncooptedReviwed;
    }

    public void setNgoNoncooptedReviwed(Integer ngoNoncooptedReviwed) {
        this.ngoNoncooptedReviwed = ngoNoncooptedReviwed;
    }

    public Integer getOtherReviwed() {
        return otherReviwed;
    }

    public void setOtherReviwed(Integer otherReviwed) {
        this.otherReviwed = otherReviwed;
    }

    public Integer getAllmemCount() {
        return allmemCount;
    }

    public void setAllmemCount(Integer allmemCount) {
        this.allmemCount = allmemCount;
    }

    public Integer getAllShgCount() {
        return allShgCount;
    }

    public void setAllShgCount(Integer allShgCount) {
        this.allShgCount = allShgCount;
    }

    public Integer getAllShgFormedMonth() {
        return allShgFormedMonth;
    }

    public void setAllShgFormedMonth(Integer allShgFormedMonth) {
        this.allShgFormedMonth = allShgFormedMonth;
    }

    public Integer getAllShgMembersJoinedMonth() {
        return allShgMembersJoinedMonth;
    }

    public void setAllShgMembersJoinedMonth(Integer allShgMembersJoinedMonth) {
        this.allShgMembersJoinedMonth = allShgMembersJoinedMonth;
    }
}

