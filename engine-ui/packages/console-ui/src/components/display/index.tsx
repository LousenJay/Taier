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

import * as React from 'react'

import { TASK_TYPE, TASK_STATUS } from '../../consts/comm'

export function taskTypeText (type: any) {
    switch (type) {
        case TASK_TYPE.MR:
            return 'Spark';
        case TASK_TYPE.SYNC:
            return '数据同步';
        case TASK_TYPE.VIRTUAL_NODE:
            return '虚节点';
        case TASK_TYPE.PYTHON_23:
            return 'Python';
        case TASK_TYPE.PYTHON:
            return 'PySpark';
        case TASK_TYPE.R:
            return 'R';
        case TASK_TYPE.SQL:
            return 'SparkSQL';
        case TASK_TYPE.SHELL:
            return 'Shell';
        case TASK_TYPE.DEEP_LEARNING:
            return '深度学习';
        case TASK_TYPE.ML:
            return '机器学习';
        case TASK_TYPE.HAHDOOPMR:
            return 'HadoopMR';
        case TASK_TYPE.WORKFLOW:
            return '工作流';
        case TASK_TYPE.CARBONSQL:
            return 'CarbonSQL';
        case TASK_TYPE.NOTEBOOK:
            return 'Notebook';
        case TASK_TYPE.EXPERIMENT:
            return '算法实验';
        case TASK_TYPE.LIBRASQL:
            return 'LibraSQL';
        case TASK_TYPE.IMPALA_SQL:
            return 'ImpalaSQL';
        case TASK_TYPE.CUBE_KYLIN:
            return 'Cube_Kylin';
        case TASK_TYPE.HIVESQL:
            return 'HiveSQL';
        case TASK_TYPE.TI_DB_SQL:
            return 'TiDBSQL';
        case TASK_TYPE.ORACLE_SQL:
            return 'OracleSQL';
        case TASK_TYPE.GREEN_PLUM_SQL:
            return 'GreenPlumSQL';
        default:
            return '未知';
    }
}

export function taskStatusText (type: any) {
    switch (type) {
        case TASK_STATUS.WAIT_SUBMIT:
            return '等待提交';
        case TASK_STATUS.CREATED:
            return '数据同步';
        case TASK_STATUS.INVOKED:
            return '已调度';
        case TASK_STATUS.DEPLOYING:
            return '部署中';
        case TASK_STATUS.RUNNING:
        case TASK_STATUS.TASK_STATUS_NOT_FOUND:
            return '运行中';
        case TASK_STATUS.FINISHED:
            return '成功';
        case TASK_STATUS.STOPED:
            return '取消';
        case TASK_STATUS.STOPING:
            return '取消中';
        case TASK_STATUS.RUN_FAILED:
            return '运行失败';
        case TASK_STATUS.SUBMIT_FAILED:
            return '提交失败';
        case TASK_STATUS.PARENT_FAILD:
            return '上游失败';
        case TASK_STATUS.SUBMITTING:
            return '提交中';
        case TASK_STATUS.RESTARTING:
            return '重启中';
        case TASK_STATUS.SET_SUCCESS:
            return '设置成功';
        case TASK_STATUS.WAIT_RUN:
            return '等待运行';
        case TASK_STATUS.WAIT_COMPUTE:
            return '等待计算';
        case TASK_STATUS.FROZEN:
            return '冻结';
        default:
            return '异常';
    }
}

export function IndexType (props: any) {
    switch (props.value) {
        case 1:
            return <span>原子指标</span>;
        case 2:
        default:
            return <span>修饰词</span>;
    }
}

export function TableNameCheck (props: any) {
    switch (props.value) {
        case 1:
            return <span>分层不合理</span>;
        case 2:
            return <span>分层不合理</span>;
        case 3:
            return <span>引用标识不合理</span>;
        case 4:
            return <span>引用不合理</span>;
        default:
            return <span></span>;
    }
}

export function FieldNameCheck (props: any) {
    switch (props.value) {
        case 1:
            return <span>字段名称不合理</span>;
        case 2:
            return <span>字段类型不合理</span>;
        case 3:
            return <span>字段描述不合理</span>;
        default:
            return <span></span>;
    }
}