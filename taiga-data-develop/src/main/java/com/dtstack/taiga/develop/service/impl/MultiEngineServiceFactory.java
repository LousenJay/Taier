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

package com.dtstack.taiga.develop.service.impl;

import com.dtstack.taiga.common.enums.EScheduleJobType;
import com.dtstack.taiga.common.enums.MultiEngineType;
import com.dtstack.taiga.common.exception.RdosDefineException;
import com.dtstack.taiga.develop.service.job.IBatchJobExeService;
import com.dtstack.taiga.develop.service.job.IBatchSelectSqlService;
import com.dtstack.taiga.develop.service.job.ITaskService;
import com.dtstack.taiga.develop.service.table.IDataDownloadService;
import com.dtstack.taiga.develop.service.table.ISqlExeService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * 根据对应的引擎类型获取执行实现
 * Date: 2019/5/13
 * Company: www.dtstack.com
 *
 * @author xuchao
 */

@Component
public class MultiEngineServiceFactory {

    @Resource(name = "batchSparkSqlExeService")
    private ISqlExeService batchSparkSqlExeService;

    @Resource(name = "batchHadoopJobExeService")
    private IBatchJobExeService batchHadoopJobExeService;

    @Resource(name = "batchHadoopSelectSqlService")
    private IBatchSelectSqlService batchHadoopSelectSqlService;

    @Resource(name = "hadoopDataDownloadService")
    private IDataDownloadService hadoopDataDownloadService;

    @Resource(name = "batchHadoopTaskService")
    private ITaskService batchHadoopTaskService;

    public ISqlExeService getSqlExeService(Integer taskType) {
        if (EScheduleJobType.SPARK_SQL.getVal().equals(taskType)) {
            return batchSparkSqlExeService;
        }
        throw new RdosDefineException(String.format("not support task type %d now", taskType));
    }

    public IBatchJobExeService getBatchJobExeService(Integer taskType) {
        if (EScheduleJobType.SPARK_SQL.getType().equals(taskType) || EScheduleJobType.SYNC.getType().equals(taskType)) {
            return batchHadoopJobExeService;
        }
        throw new RdosDefineException(String.format("not support engine type %d now", taskType));
    }

    /**
     * 根据任务类型获取sql查询Service
     * @param taskType
     * @return
     */
    public IBatchSelectSqlService getBatchSelectSqlService(Integer taskType) {
        if (EScheduleJobType.SPARK_SQL.getType().equals(taskType)) {
            return batchHadoopSelectSqlService;
        }
        throw new RdosDefineException(String.format("not support engine type %d now", taskType));
    }

    /**
     * 根据任务类型获取下载的Service
     * @param taskType
     * @return
     */
    public IDataDownloadService getDataDownloadService(Integer taskType) {
        if (EScheduleJobType.SPARK_SQL.getType().equals(taskType)) {
            return hadoopDataDownloadService;
        }
        throw new RdosDefineException(String.format("not support engine type %d now", taskType));
    }

    public ITaskService getTaskService(int multiEngineType) {
        if (MultiEngineType.HADOOP.getType() == multiEngineType){
            return batchHadoopTaskService;
        }
        return null;
    }

}
