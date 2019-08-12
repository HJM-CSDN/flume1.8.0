/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flume;

/**
 * TODO ChannelFullException : channel满了的时候抛出此异常，可能原因是sink消费太慢，
 * TODO source生产太快，另外也可能是由于channel太小。
 */
public class ChannelFullException extends ChannelException {

  private static final long serialVersionUID = -8098141359417449525L;

  /**
   * @param message the exception message
   */
  public ChannelFullException(String message) {
    super(message);
  }

  /**
   * @param ex the causal exception
   */
  public ChannelFullException(Throwable ex) {
    super(ex);
  }

  /**
   * @param message the exception message
   * @param ex the causal exception
   */
  public ChannelFullException(String message, Throwable ex) {
    super(message, ex);
  }

}
