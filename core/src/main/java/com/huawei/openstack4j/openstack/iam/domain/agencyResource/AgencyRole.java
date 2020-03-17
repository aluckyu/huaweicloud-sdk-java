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
import com.huawei.openstack4j.model.ModelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgencyRole implements ModelEntity {
    private static final long serialVersionUID = 1L;

    /**
     * the catalog
     */
    private String catalog;

    /**
     * the time role is created
     */
    @JsonProperty("created_time")
    private String createdTime;

    /**
     * the description of role
     */
    @JsonProperty("description")
    private String description;

    /**
     * the Chinese description of the role
     */
    @JsonProperty("description_cn")
    private String descriptionCn;

    /**
     * the display name of the role
     */
    @JsonProperty("display_name")
    private String displayName;

    /**
     * the domain id
     */
    @JsonProperty("domain_id")
    private String domainId;

    /**
     * the flag
     */
    private String flag;

    /**
     * the id
     */
    private String id;

    /**
     * the links
     */
    private Map<String, String> links;

    /**
     * the name
     */
    private String name;

    /**
     * the policy
     */
    private Policy policy;


    /**
     * the type of the role
     */
    private String type;

    /**
     * the updated time
     */
    private String updatedTime;
}
