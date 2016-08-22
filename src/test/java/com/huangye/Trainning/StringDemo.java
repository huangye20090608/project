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
public class StringDemo {
	private static ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal<Map<String, String>>() {
		@Override
		protected Map<String, String> initialValue() {
			Map<String, String> kryo = new HashMap<String, String>();
			System.out.println("+++++++");
			StringBuilder localBuilderKey = new StringBuilder();
			localBuilderKey.append(1);
			localBuilderKey.append(3);
			localBuilderKey.append(5);
			localBuilderKey.append(6);
			localBuilderKey.append(7);
			System.out.println("+++++++"+localBuilderKey.toString());
			return kryo;
		}
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "one1");
		map.put("2", "one2");
		map.put("3", "one3");
		map.put("4", "one4");
		map.put("5", "one5");
		threadLocal.set(map);
		Map<String, String> map1 = threadLocal.get();
		for (Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		threadLocal.remove();
		System.out.println("================");
		Map<String, String> map2 = threadLocal.get();
		for (Map.Entry<String, String> entry2 : map2.entrySet()) {
			System.out.println("key = " + entry2.getKey() + ", value = " + entry2.getValue());
		}
	}

}
