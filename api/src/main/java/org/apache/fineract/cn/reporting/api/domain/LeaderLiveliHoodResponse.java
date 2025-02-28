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

public class LeaderLiveliHoodResponse {

    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String noofshg;
    private String noofleaders;
    private String agriactivity;
    private String hortactivity;
    private String livestockrearing;
    private String fisheryactivity;
    private String ntfpcollection;
    private String manufctrng;
    private String trading;
    private String servics;
    private String customhiringcenter;
    private String aggregation;
    private String others;
    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(String district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getBlock_id() {
        return block_id;
    }

    public void setBlock_id(String block_id) {
        this.block_id = block_id;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getNoofshg() {
        return noofshg;
    }

    public void setNoofshg(String noofshg) {
        this.noofshg = noofshg;
    }

    public String getNoofleaders() {
        return noofleaders;
    }

    public void setNoofleaders(String noofleaders) {
        this.noofleaders = noofleaders;
    }

    public String getAgriactivity() {
        return agriactivity;
    }

    public void setAgriactivity(String agriactivity) {
        this.agriactivity = agriactivity;
    }

    public String getHortactivity() {
        return hortactivity;
    }

    public void setHortactivity(String hortactivity) {
        this.hortactivity = hortactivity;
    }

    public String getLivestockrearing() {
        return livestockrearing;
    }

    public void setLivestockrearing(String livestockrearing) {
        this.livestockrearing = livestockrearing;
    }

    public String getFisheryactivity() {
        return fisheryactivity;
    }

    public void setFisheryactivity(String fisheryactivity) {
        this.fisheryactivity = fisheryactivity;
    }

    public String getNtfpcollection() {
        return ntfpcollection;
    }

    public void setNtfpcollection(String ntfpcollection) {
        this.ntfpcollection = ntfpcollection;
    }

    public String getManufctrng() {
        return manufctrng;
    }

    public void setManufctrng(String manufctrng) {
        this.manufctrng = manufctrng;
    }

    public String getTrading() {
        return trading;
    }

    public void setTrading(String trading) {
        this.trading = trading;
    }

    public String getServics() {
        return servics;
    }

    public void setServics(String servics) {
        this.servics = servics;
    }

    public String getCustomhiringcenter() {
        return customhiringcenter;
    }

    public void setCustomhiringcenter(String customhiringcenter) {
        this.customhiringcenter = customhiringcenter;
    }

    public String getAggregation() {
        return aggregation;
    }

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
