package com.huangye.Trainning.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huangye.Trainning.bean.Json;
import com.huangye.Trainning.bean.UserBean;

import java.lang.reflect.Type;
import net.sf.json.groovy.GJson;

public class GsonService {
	
	public static void main(String[] agrs){
		Map<String, String> colours = new HashMap<String, String>();
        colours.put("BLACK", "#000000");
        colours.put("RED", "#FF0000");
        colours.put("GREEN", "#008000");
        colours.put("BLUE", "#0000FF");
        colours.put("YELLOW", "#FFFF00");
        colours.put("WHITE", "#FFFFFF");
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        //
        // Convert a Map into JSON string.
        //
        Gson gson = new Gson();
        String json = gson.toJson(colours);
        
        
        System.out.println("json = " + json);
        
        Map<String, String> map123 = gson.fromJson(json, type);
        System.out.println("map123 = " + map123);
        //
        // Convert JSON string back to Map.
        //
        
        Map<String, String> map = gson.fromJson(json, type);
        for (String key : map.keySet()) {
            System.out.println("map.get = " + map.get(key));
        }
        
        String jsonString = "{\"name\":\"Duke\",\"address\":\"Menlo Park\",\"dateOfBirth\":\"Feb 1, 2000 12:00:00 AM\"}";//JSON格式的数据
        String qwe = "{\"name\":\"123\",\"age\":\"123\"}";
        UserBean student = gson.fromJson(json, UserBean.class);//指定了要还原的class，保存在gson中。
	}
}
