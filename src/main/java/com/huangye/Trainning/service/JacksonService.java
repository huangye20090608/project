package com.huangye.Trainning.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.type.TypeReference;

import com.huangye.Trainning.bean.DeptBean;
import com.huangye.Trainning.bean.UserBean;

public class JacksonService {

	public static void main(String[] args) {
		 	UserBean userBean1 = new UserBean(1, "liubei", "123", "liubei@163.com");  
	        UserBean userBean2 = new UserBean(2, "guanyu", "123", "guanyu@163.com");  
	        UserBean userBean3 = new UserBean(3, "zhangfei", "123", "zhangfei@163.com");  
	        List<UserBean> userBeans = new ArrayList<UserBean>();  
	        userBeans.add(userBean1);  
	        userBeans.add(userBean2);  
	        userBeans.add(userBean3);  
	        DeptBean deptBean = new DeptBean(1, "sanguo", userBeans);  
	        
	        //对象转json  
	        String userBeanToJson = JacksonUtil.toJSon(userBean1);  
	        String deptBeanToJson = JacksonUtil.toJSon(deptBean);  
	          
	        System.out.println("deptBean to json:" + deptBeanToJson);  
	        System.out.println("userBean to json:" + userBeanToJson);  
	          
	        //json转字符串  
	        UserBean jsonToUserBean = JacksonUtil.readValue(userBeanToJson, UserBean.class);  
	        DeptBean jsonToDeptBean = JacksonUtil.readValue(deptBeanToJson, DeptBean.class);  
	          
	        System.out.println("json to DeptBean" + jsonToDeptBean.toString());  
	        System.out.println("json to UserBean" + jsonToUserBean.toString());  
	          
	        //List 转json字符串  
	        String listToJson = JacksonUtil.toJSon(userBeans);  
	        System.out.println("list to json:" + listToJson);  
	        //数组json转 List  
	        List<UserBean> jsonToUserBeans = JacksonUtil.readValue(listToJson, new TypeReference<List<UserBean>>() {  
	        });  
	        String userBeanString = "";  
	        for (UserBean userBean : jsonToUserBeans) {  
	            userBeanString += userBean.toString() + "\n";  
	        }  
	        System.out.println("json to userBeans:" + userBeanString);  
	        
	        Map<String,String> map = new HashMap<String,String>();
	        map.put("1", "one");
	        map.put("2", "two");
	        map.put("3", "three");
	        System.out.println(JacksonUtil.toJSon(map));
	        System.out.println( JacksonUtil.readValue(JacksonUtil.toJSon(map),new TypeReference<Map<String,String>>(){}) );
	    }  
}
