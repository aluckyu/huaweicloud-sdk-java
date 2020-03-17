/*******************************************************************************
 * 	Copyright 2020 Huawei Technologies Co.,Ltd.
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.huawei.openstack4j.openstack.iam.domain.agencyResource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("agency")
public class AgencyResp implements ModelEntity {
    private static final long serialVersionUID = 1L;

    /**
     * the create time
     */
    @JsonProperty("create_time")
    private String createTime;

    /**
     * the description of agency
     */
    private String description;

    /**
     * the id of domain
     */
    @JsonProperty("domain_id")
    private String domainId;

    /**
     * the duration
     */
    private String duration;

    /**
     * the expire time
     */
    @JsonProperty("expire_time")
    private String expireTime;

    /**
     * the name
     */
    private String name;

    /**
     * the turst domain id
     */
    @JsonProperty("trust_domain_id")
    private String trustDomainId;

    /**
     * the turst domain name
     */
    @JsonProperty("trust_domain_name")
    private String trustDomainName;

    /**
     * the agency id
     */
    private String id;

}
