package com.dtstack.rdos.engine.entrance.db.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Reason:
 * Date: 2017/3/7
 * Company: www.dtstack.com
 * @ahthor xuchao
 */
public interface RdosServerLogMapper {

    int insertSvrLog(@Param("taskId") String taskId, @Param("logInfo") String logInfo);
}