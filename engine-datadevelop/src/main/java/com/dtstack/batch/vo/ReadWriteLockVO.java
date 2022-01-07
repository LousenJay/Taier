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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.batch.vo;

import com.dtstack.batch.domain.ReadWriteLock;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class ReadWriteLockVO extends ReadWriteLock {

    private String lastKeepLockUserName;    //上一个持有锁的用户名

    private Integer result = 0;  //检查结果

    private Boolean isGetLock = false;      //是否持有锁

    public static ReadWriteLockVO toVO(ReadWriteLock readWriteLock) {
        ReadWriteLockVO readWriteLockVO = new ReadWriteLockVO();
        BeanUtils.copyProperties(readWriteLock,readWriteLockVO);
        return readWriteLockVO;
    }

    public ReadWriteLockVO() {
    }

    public boolean isGetLock() {
        return isGetLock;
    }

    public void setIsGetLock(boolean getLock) {
        isGetLock = getLock;
    }
}