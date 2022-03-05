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
package eu.frenchxcore.messages.ibc.types.core.channel.v1;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * State defines if a channel is in one of the following states: CLOSED, INIT,
 * TRYOPEN, OPEN or UNINITIALIZED.
 */
public enum State {
    /**
     * Default State
     */
    STATE_UNINITIALIZED_UNSPECIFIED(0, "UNINITIALIZED"),

    /**
     * A channel has just started the opening handshake.
     */
    STATE_INIT(1, "INIT"),

    /**
     * A channel has acknowledged the handshake step on the counterparty chain.
     */
    STATE_TRYOPEN(2, "TRYOPEN"),

    /** 
     * A channel has completed the handshake. Open channels are ready to send and receive packets.
     */
    STATE_OPEN(3, "OPEN"),

    /**
     * A channel has been closed and can no longer be used to send or receive packets.
     */
    STATE_CLOSED(4, "CLOSED");

    public final int iVal;
    public final String sVal;
    
    @JsonValue
    public final String sName;
    
    State(int iVal, String sVal) {
        this.iVal = iVal;
        this.sVal = sVal;
        this.sName = this.name();
    }
}
