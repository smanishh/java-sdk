/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.conversation.v1.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * RuntimeLogMessage.
 */
public class RuntimeLogMessage extends GenericModel {

  /** The severity of the message (info, error, or warn). */
  private String level;
  /** The text of the message. */
  private String msg;

  /**
   * Gets the level.
   *
   * @return the level
   */
  public String getLevel() {
    return level;
  }

  /**
   * Gets the msg.
   *
   * @return the msg
   */
  public String getMsg() {
    return msg;
  }

  /**
   * Sets the level.
   *
   * @param level the new level
   */
  public void setLevel(final String level) {
    this.level = level;
  }

  /**
   * Sets the msg.
   *
   * @param msg the new msg
   */
  public void setMsg(final String msg) {
    this.msg = msg;
  }
}
