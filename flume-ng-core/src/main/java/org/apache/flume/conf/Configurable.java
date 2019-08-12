/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.flume.conf;

import org.apache.flume.Context;
import org.apache.flume.annotations.InterfaceAudience;
import org.apache.flume.annotations.InterfaceStability;

/**
 * Any class marked as Configurable may have a context including its
 * sub-configuration passed to it, requesting it configure itself.
 * 任何标记为可配置的类都可能有一个上下文，包括传递给它的子配置，并请求它配置自己。
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public interface Configurable {
  /**
   * Request the implementing class to (re)configure itself.
   * When configuration parameters are changed, they must be
   * reflected by the component asap.
   * There are no thread safety guarantees on when configure might be called.
   * @param context
   */
  public void configure(Context context);

}
