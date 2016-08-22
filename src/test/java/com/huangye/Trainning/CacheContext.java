/**
 * 
 */
package com.huangye.Trainning;

import java.util.Map;

/**
 * @author huangye
 *
 */
public class CacheContext<T> {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "asc";
		
		System.out.println(str.split(",")[1]);
		// TODO Auto-generated method stub

	}
	/*private Map<String, T> cache = Maps.newConcurrentMap();

	public T get(String key) {
		return cache.get(key);
	}

	public void addOrUpdateCache(String key, T value) {
		cache.put(key, value);
	}

	// 根据 key 来删除缓存中的一条记录
	public void evictCache(String key) {
		if (cache.containsKey(key)) {
			cache.remove(key);
		}
	}

	// 清空缓存中的所有记录
	public void evictCache() {
		cache.clear();
	}*/



}
