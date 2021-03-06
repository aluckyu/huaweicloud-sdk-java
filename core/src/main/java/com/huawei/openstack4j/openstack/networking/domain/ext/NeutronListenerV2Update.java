/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
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
/******************************************************************************* 	                                                                                 
 *  Huawei has modified this source file.
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.                                         
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
 * *******************************************************************************/

package com.huawei.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.network.ext.ListenerV2Update;
import com.huawei.openstack4j.model.network.ext.builder.ListenerV2UpdateBuilder;
import com.google.common.base.MoreObjects;

/**
 * Entity for updating lbaas v2 listener
 * @author emjburns
 */
@JsonRootName("listener")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronListenerV2Update implements ListenerV2Update {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    @JsonProperty("admin_state_up")
    private Boolean adminStateUp;

    /**
     * The maximum number of connections allowed for the listener. Default is -1, meaning no limit.
     */
    @JsonProperty("connection_limit")
    private Integer connectionLimit;

    /**
     * 监听器使用的服务器证书的Id
     */
    @JsonProperty("default_tls_container_ref")
    private String defaultTlsContainerRef;

    /**
     * 监听器使用的CA证书的ID
     */
    @JsonProperty("client_ca_tls_container_ref")
    private String clientTlsContainerRef;
    

    @JsonProperty("default_pool_id")
    private String defaultPoolId;
    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerV2UpdateBuilder toBuilder(){
        return new ListenerV2UpdateConcreteBuilder(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean isAdminStateUp(){
        return adminStateUp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription(){
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getConnectionLimit(){
        return connectionLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDefaultTlsContainerRef(){
        return defaultTlsContainerRef;
    }

    @Override
    public String getClientTlsContainerRef() {
        return clientTlsContainerRef;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("adminStateUp", adminStateUp)
                .add("description", description)
                .add("name", name)
                .add("defaultPoolId", defaultPoolId)
                .add("connectionLimit", connectionLimit)
                .add("defaultTlsContainerRef", defaultTlsContainerRef)
                .add("clientTlsContainerRef", clientTlsContainerRef)
                .toString();
    }

    public static class ListenerV2UpdateConcreteBuilder implements ListenerV2UpdateBuilder {
        private NeutronListenerV2Update m;

        public ListenerV2UpdateConcreteBuilder(){
            this(new NeutronListenerV2Update());
        }

        public ListenerV2UpdateConcreteBuilder(NeutronListenerV2Update m){
            this.m = m;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2Update build(){
            return m;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder from(ListenerV2Update in){
            m = (NeutronListenerV2Update) in;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder name(String name){
            m.name = name;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder description(String description){
            m.description = description;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder adminStateUp(Boolean adminStateUp){
            m.adminStateUp = adminStateUp;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder connectionLimit(Integer connectionLimit){
            m.connectionLimit = connectionLimit;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder defaultTlsContainerRef(String defaultTlsContainerRef){
            m.defaultTlsContainerRef = defaultTlsContainerRef;
            return this;
        }

        @Override
        public ListenerV2UpdateBuilder clientTlsContainerRef(String clientTlsContainerRef) {
            m.clientTlsContainerRef = clientTlsContainerRef;
            return this;
        }

        @Override
		public ListenerV2UpdateBuilder defaultPoolId(String defaultPoolId) {
			  m.defaultPoolId = defaultPoolId;
	          return this;
		}
    }

    public static ListenerV2UpdateBuilder builder() {
        return new ListenerV2UpdateConcreteBuilder();
    }

	@Override
	public String getDefaultPoolId() {
		return defaultPoolId;
	}

}
