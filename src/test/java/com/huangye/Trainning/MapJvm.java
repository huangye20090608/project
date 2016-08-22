/**
 * 
 */
package com.huangye.Trainning;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangye
 *
 */
public class MapJvm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1801%300);
		System.out.println(1800%300);
		System.out.println(2300/300);
		System.out.println(1800/300);
		int size = 1801%300==0?1801/300:1801/300+1;
		System.out.println("size:"+size);
				
//		Map<String,String> maps = new HashMap<String,String>();
////		
//		for(int i=0;i<3;i++){
//			mapAd(maps,i+",","one"+i);
//		}
//		
//		for(Map.Entry<String,String> map : maps.entrySet()){
//			System.out.println("map:"+map);
//		}
		
//		String trs = "qwe";
//		stringA(trs);
//		System.out.println("trs:"+trs);
	}
	
//	public static void stringA(String str){
//		str = "123";
//		System.out.println("str:"+str);
//	}
	
	public static void mapAd(Map<String,String> maps,String key,String value){
		maps.put(key,value);
//		for(Map.Entry<String,String> map : maps.entrySet()){
//			System.out.println("map---->:"+map);
//		}
	}

}
