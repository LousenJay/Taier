package com.dtstack.rdos.engine.execution.base.enumeration;

/**
 * 
 * Reason: TODO ADD REASON(可选)
 * Date: 2017年03月03日 下午1:25:18
 * Company: www.dtstack.com
 * @author sishu.yss
 *
 */
public enum EJobType{
	
    SQL(0),
    MR(1),
    SYNC(2);//数据同步任务
    
    private int type;
    
    EJobType(int type){
    	this.type = type;
    }
    
    public static EJobType getEJobType(int type){
    	EJobType[] eJobTypes = EJobType.values();
    	for(EJobType eJobType:eJobTypes){
    		if(eJobType.type == type){
    			return eJobType;
    		}
    	}
    	return null;
    }
    
    public int getType(){
    	return this.type;
    }
}