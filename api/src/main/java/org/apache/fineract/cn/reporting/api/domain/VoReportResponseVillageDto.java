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

public class VoReportResponseVillageDto {
    String bookKeeperName;
    Long numberOfVoUpdated;
    Long numberOfVoMapped;

    public String getBookKeeperName() {
        return bookKeeperName;
    }

    public void setBookKeeperName(String bookKeeperName) {
        this.bookKeeperName = bookKeeperName;
    }

    public Long getNumberOfVoUpdated() {
        return numberOfVoUpdated;
    }

    public void setNumberOfVoUpdated(Long numberOfVoUpdated) {
        this.numberOfVoUpdated = numberOfVoUpdated;
    }

    public Long getNumberOfVoMapped() {
        return numberOfVoMapped;
    }

    public void setNumberOfVoMapped(Long numberOfVoMapped) {
        this.numberOfVoMapped = numberOfVoMapped;
    }
}
