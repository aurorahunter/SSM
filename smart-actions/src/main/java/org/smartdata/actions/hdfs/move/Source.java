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
package org.smartdata.actions.hdfs.move;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;

/** A node that can be the sources of a block move */
public class Source extends StorageGroup {

  /**
   * Source blocks point to the objects in {@link org.apache.hadoop.hdfs.server.balancer.Dispatcher#globalBlocks}
   * because we want to keep one copy of a block and be aware that the
   * locations are changing over time.
   */
  //private final List<DBlock> srcBlocks = new ArrayList<DBlock>();

  public Source(StorageType storageType, DatanodeInfo dn) {
    super(dn, storageType);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}