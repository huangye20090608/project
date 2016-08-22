/**
 * 
 */
package com.huangye.Trainning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author huangye
 *
 */
public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        Map<String, String> map = new HashMap<String, String>();    
        map.put("A", "ABC");    
        map.put("K", "KK");    
        map.put("L", "LV");    
          
        // 将Map Key 转化为List      
        List<String> mapKeyList = new ArrayList<String>(map.keySet());    
        System.out.println("mapKeyList:"+mapKeyList);  
          
        // 将Map Key 转化为List      
        List<String> mapValuesList = new ArrayList<String>(map.values());    
        System.out.println("mapValuesList:"+mapValuesList);  
        
        Map<String, String> mapSet = new HashMap<String, String>();    
        mapSet.put("A", "ABC");    
        mapSet.put("K", "KK");    
        mapSet.put("L", "LV");    
          
        // 将Map 的键转化为Set      
        Set<String> mapKeySet = mapSet.keySet();    
        System.out.println("mapKeySet:"+mapKeySet);  
          
        // 将Map 的值转化为Set      
        Set<String> mapValuesSet = new HashSet<String>(mapSet.values());    
        System.out.println("mapValuesSet:"+mapValuesSet);  
        
		
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		for (int i = 1; i <= 20; i++) {
			list1.add("" + i);
		}

		List<String> list2 = new ArrayList<String>();
		for (int i = 10; i <= 30; i++) {
			list2.add("" + i);
		}

		Set<String> set = new HashSet<String>();
		set.add("1");
		System.out.println(set.contains("1"));
		set.remove("1");
		System.out.println(set.contains("1"));

	}

}
