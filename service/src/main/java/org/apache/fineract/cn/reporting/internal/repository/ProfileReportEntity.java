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
package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Cacheable(value = false)
//@Table(name = "tbl_summary")
@Table(name = "reports.tbl_summary")
public class ProfileReportEntity {

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
 @Column(name = "panchayat_id")
 private Integer panchayatId;
 @Column(name = "village_id")
 private Integer villageId;
 @Column(name = "state_name")
 private String stateName;
 @Column(name = "district_name")
 private String districtName;
 @Column(name = "block_name")
 private String blockName;
 @Column(name = "panchayat_name")
 private String panchayat_name;
 @Column(name = "village_name")
 private String villageName;
 @Column(name = "year_month")
 private String yearMonth;
 @Column(name = "shg_count")
 private Integer shgCount;
 @Column(name = "shg_bk")
 private Integer shgBk;
 @Column(name = "shg_mapped")
 private Integer shgMapped;
 @Column(name = "shg_unmapped")
 private Integer shgUnmapped;
 @Column(name = "vo_count")
 private Integer voCount;
 @Column(name = "vo_bk")
 private Integer voBk;
 @Column(name = "vo_mapped")
 private Integer voMapped;
 @Column(name = "vo_unmapped")
 private Integer voUnmapped;
 @Column(name = "clf_count")
 private Integer clfCount;
 @Column(name = "clf_bk")
 private Integer clfBk;
 @Column(name = "clf_mapped")
 private Integer clfMapped;
 @Column(name = "clf_unmapped")
 private Integer clfUnmapped;
 // @Column(name = "shg_approved")
 @Column(name = "shg_activated")
 private Integer shgApproved;
 @Column(name = "shg_activation_pending")
 private Integer shgActivationPending;
 @Column(name = "shg_change_pending")
 private Integer shgChangePending;
 @Column(name = "shg_mem")
 private Integer shgMem;
 @Column(name = "shg_mem_approved")
 private Integer shgMemApproved;
 @Column(name = "shg_mem_activation_pending")
 private Integer shgMemActivationPending;
 @Column(name = "shg_mem_change_pending")
 private Integer shgMemChangePending;
 @Column(name = "shg_updated_lokos")
 private Integer shgUpdatedLokos;
 @Column(name = "vo_approved")
 private Integer voApproved;
 @Column(name = "vo_activation_pending")
 private Integer voActivationPending;
 @Column(name = "vo_change_pending")
 private Integer voChangePending;
 @Column(name = "vo_mem")
 private Integer voMem;
 @Column(name = "vo_mem_approved")
 private Integer voMemApproved;
 @Column(name = "vo_mem_activation_pending")
 private Integer voMemActivationPending;
 @Column(name = "vo_mem_change_pending")
 private Integer voMemChangePending;
 @Column(name = "vo_updated_lokos")
 private Integer voUpdatedLokos;
 @Column(name = "clf_approved")
 private Integer clfApproved;
 @Column(name = "clf_activation_pending")
 private Integer clfActivationPending;
 @Column(name = "clf_change_pending")
 private Integer clfChangePending;
 @Column(name = "clf_mem")
 private Integer clfMem;
 @Column(name = "clf_mem_approved")
 private Integer clfMemApproved;
 @Column(name = "clf_mem_activation_pending")
 private Integer clfMemActivationPending;
 @Column(name = "clf_mem_modified_pending")
 private Integer clfMemModifiedPending;
 @Column(name = "clf_updated_lokos")
 private Integer clfUpdatedLokos;
 @Column(name = "shg_formed")
 private Integer shgFormed;
 @Column(name = "shg_members")
 private Integer shgMembers;
 @Column(name = "age_block")
 private Integer ageBlock;
 @Column(name = "saturation_coverage")
 private Boolean saturationCoverage;
 @Column(name = "clf_lastupdatedon")
 private Timestamp clfLastupdatedon;
 @Column(name = "vo_lastupdatedon")
 private Timestamp voLastupdatedon;
 @Column(name = "shg_lastupdatedon")
 private Timestamp shgLastupdatedon;
 @Column(name = "mem_lastupdatedon")
 private Timestamp memLastupdatedon;
 @Column(name = "shg_count_migrated")
 private Integer shgCountMigrated;
 @Column(name = "member_count_migrated")
 private Integer memberCountMigrated;
 @Column(name = "member_updated_lokos")
 private Integer memberUpdatedLokos;
 @Column(name = "vo_count_migrated")
 private Integer voCountMigrated;
 @Column(name = "clf_count_migrated")
 private Integer clfCountMigrated;
 @Column(name="vo_ec")
 private Integer voEc;
 @Column(name="clf_shg")
 private Integer clfShg;
 @Column(name="clf_ec")
 private Integer clfEc;
 @Column(name = "updated_date")
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

 public BigInteger getId() {
  return id;
 }

 public void setId(BigInteger id) {
  this.id = id;
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
