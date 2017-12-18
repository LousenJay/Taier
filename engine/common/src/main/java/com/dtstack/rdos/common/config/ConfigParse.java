package com.dtstack.rdos.common.config;

import java.util.Map;
import java.util.List;
/**
 * Created by sishu.yss on 2017/12/18.
 */
public class ConfigParse {

    private static Map<String,Object> configs = null;

    public static void setConfigs(Map<String,Object> config){
        if(ConfigParse.configs==null){
            ConfigParse.configs = config;
        }
    }


    public static int getSlots(){
        Object slots = configs.get("slots");
        return slots==null?10:Integer.parseInt(slots.toString());
    }


    public  static String getLocalAddress(){
        Object localAddress = configs.get("localAddress");
        return (String)localAddress;
    }

    public static String getNodeZkAddress(){
        Object nodeZkAddress = configs.get("nodeZkAddress");
        return (String)nodeZkAddress;
    }


    public static int getEventLoopPoolSize(){
        Object eventLoopPoolSize = configs.get("eventLoopPoolSize");
        return eventLoopPoolSize == null?2 * Runtime.getRuntime().availableProcessors():Integer.parseInt(eventLoopPoolSize.toString());
    }

    public static int getInstances(){
        Object instances = configs.get("instances");
        return instances == null?2 * Runtime.getRuntime().availableProcessors():Integer.parseInt(instances.toString());
    }

    public static int getWorkerPoolSize(){
        Object workerPoolSize = configs.get("workerPoolSize");
        return workerPoolSize == null?1000:Integer.parseInt(workerPoolSize.toString());
    }

    public static List<Map<String,Object>> getEngineTypeList(){
        return (List<Map<String, Object>>) configs.get("engineTypes");
    }

}
