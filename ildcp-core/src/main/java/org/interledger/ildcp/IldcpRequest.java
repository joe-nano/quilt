package org.interledger.ildcp;

/*-
 * ========================LICENSE_START=================================
 * Interledger Dynamic Configuration Protocol Core Libs
 * %%
 * Copyright (C) 2017 - 2018 Hyperledger and its contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

import org.interledger.annotations.Immutable;

import java.time.Instant;

/**
 * A request to an IL-DCP compliant endpoint (empty for now).
 */
public interface IldcpRequest {

  static IldcpRequestBuilder builder() {
    return new IldcpRequestBuilder();
  }

  /**
   * An arbitrary expiration date for this packet, as configured by the sender.
   */
  Instant getExpiresAt();

  @Immutable
  abstract class AbstractIldcpRequest implements IldcpRequest {

  }

}
