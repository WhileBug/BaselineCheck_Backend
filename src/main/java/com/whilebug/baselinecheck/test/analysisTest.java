package com.whilebug.baselinecheck.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.channels.ScatteringByteChannel;
import java.util.HashMap;
import java.util.Map;

public class analysisTest {
    public Map<String, Object> getAnalysisResult(String hostId, String taskId) {

        String path = "jsonDatabase/host_"+hostId+"_task_"+taskId+".json";
        Map<String, Object> map = new HashMap<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String str;
            String analysisResult=null;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
                if (analysisResult==null){
                    analysisResult=str;
                }else {
                    analysisResult += str;
                }
            }
            map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "更新成功");
            map.put("analysisResult", analysisResult);
        }catch (Exception e){
            map.put("code", 201);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "更新失败");
            e.printStackTrace();
        }


        return map;
    }
}
