package com.huangye.Trainning.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.huangye.Trainning.bean.DeptBean;
import com.huangye.Trainning.bean.UserBean;

public class FastJsonService {

	public static void main(String[] args) {
		UserBean yser = new UserBean(1, "one", "two", "hress");
		String text = JSON.toJSONString(yser);
		System.out.println(text);
		//日期普通
		long millis = 1324138987429L;
		Date date = new Date();
		System.out.println(JSON.toJSONString(date));
		//日期指定格式
		System.out.println(JSON.toJSONString(date, SerializerFeature.WriteDateUseDateFormat));
	
	 	UserBean userBean1 = new UserBean(1, "liubei", "123", "liubei@163.com");  
        UserBean userBean2 = new UserBean(2, "guanyu", "123", "guanyu@163.com");  
        UserBean userBean3 = new UserBean(3, "zhangfei", "123", "zhangfei@163.com");  
        List<UserBean> userBeans = new ArrayList<UserBean>();  
        userBeans.add(userBean1);  
        userBeans.add(userBean2);  
        userBeans.add(userBean3);  
        DeptBean deptBean = new DeptBean(1, "sanguo", userBeans); 
        String userBeansText = JSON.toJSONString(deptBean);
        System.out.println(userBeansText); 
        //{"deptId":1,"deptName":"sanguo",
        //"userBeanList":[{"email":"liubei@163.com","password":"123","userId":1,"userName":"liubei"},
        //{"email":"guanyu@163.com","password":"123","userId":2,"userName":"guanyu"},
        //{"email":"zhangfei@163.com","password":"123","userId":3,"userName":"zhangfei"}]}
        
		
//		UserBean a1 = JSON.parseObject(text, UserBean.class);
//		System.out.println(a1);
//		System.out.println(a1.getEmail());
		
		JSONObject jSONObject = JSON.parseObject(userBeansText);
		JSONArray  jSONArray  = jSONObject.getJSONArray("userBeanList");
		
		System.out.println(jSONObject.get("userBeanList"));
		System.out.println(jSONArray.size());
		System.out.println(jSONArray.toJSONString());
		System.out.println(jSONArray.get(0));
		List<UserBean> listBeans = JSON.parseArray(jSONArray.toString(), UserBean.class);
        // 遍历
//        for(UserBean bean_ : listBeans){
//            // 我这个demo的json数据获得第一层的数据
//            System.out.println(bean_.getEmail());
//            System.out.println(bean_.getUserName());
//            // 我这个demo的json数据获得第二层的数据
//           // System.out.println(bean_.getUserBean().getFollowers_count());
//        }
	}

}
