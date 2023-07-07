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

import java.math.BigInteger;

public class ResponseMissionUnitLevel {

    private String state;

    private String district;

    private String block;

    private Integer stateId;

    private Integer districtId;

    private Integer blockId;

    private BigInteger stateAdmin;

    private BigInteger stateManager;

    private BigInteger stateThematicUser;

    private BigInteger districtCount;

    private BigInteger districtAdmin;

    private BigInteger districtManager;

    private BigInteger districtThematicUser;

    private BigInteger blockCount;

    private BigInteger blockAdmin;

    private BigInteger blockManager;

    private BigInteger blockThematicUser;
    private String updatedDate;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
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

    public BigInteger getStateAdmin() {
        return stateAdmin;
    }

    public void setStateAdmin(BigInteger stateAdmin) {
        this.stateAdmin = stateAdmin;
    }

    public BigInteger getStateManager() {
        return stateManager;
    }

    public void setStateManager(BigInteger stateManager) {
        this.stateManager = stateManager;
    }

    public BigInteger getStateThematicUser() {
        return stateThematicUser;
    }

    public void setStateThematicUser(BigInteger stateThematicUser) {
        this.stateThematicUser = stateThematicUser;
    }

    public BigInteger getDistrictCount() {
        return districtCount;
    }

    public void setDistrictCount(BigInteger districtCount) {
        this.districtCount = districtCount;
    }

    public BigInteger getDistrictAdmin() {
        return districtAdmin;
    }

    public void setDistrictAdmin(BigInteger districtAdmin) {
        this.districtAdmin = districtAdmin;
    }

    public BigInteger getDistrictManager() {
        return districtManager;
    }

    public void setDistrictManager(BigInteger districtManager) {
        this.districtManager = districtManager;
    }

    public BigInteger getDistrictThematicUser() {
        return districtThematicUser;
    }

    public void setDistrictThematicUser(BigInteger districtThematicUser) {
        this.districtThematicUser = districtThematicUser;
    }

    public BigInteger getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(BigInteger blockCount) {
        this.blockCount = blockCount;
    }

    public BigInteger getBlockAdmin() {
        return blockAdmin;
    }

    public void setBlockAdmin(BigInteger blockAdmin) {
        this.blockAdmin = blockAdmin;
    }

    public BigInteger getBlockManager() {
        return blockManager;
    }

    public void setBlockManager(BigInteger blockManager) {
        this.blockManager = blockManager;
    }

    public BigInteger getBlockThematicUser() {
        return blockThematicUser;
    }

    public void setBlockThematicUser(BigInteger blockThematicUser) {
        this.blockThematicUser = blockThematicUser;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}
