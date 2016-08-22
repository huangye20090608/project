/**
 * 
 */
package com.huangye.Trainning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author huangye
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String demo = "wo are family!";
		for(int i=0;i<demo.length();i++){
			System.out.println(demo.charAt(i));
		}
		
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder  stringBuilder = new StringBuilder();
		
		String str = "abc";  
        String str1 = "abc";  
        String str2 = new String("abc");  
        System.out.println(str == str1);  
        System.out.println(str1 == "abc");  
        System.out.println(str2 == "abc");  
        System.out.println(str1 == str2);  
        System.out.println(str1.equals(str2));  
        System.out.println(str1 == str2.intern());  
        System.out.println(str2 == str2.intern());  
        System.out.println(str1.hashCode() == str2.hashCode());  
        
        System.out.println("------------------");
        

		System.out.println(new String("abcdefg")); // true
		
		
		System.out.println(new String("").equals("")); // true
		System.out.println(new String().equals("")); // true
		System.out.println("ab" == "ab"); // true
		System.out.println("ab" == new String("ab")); // false
		System.out.println("ab" == String.valueOf("ab")); // true
		System.out.println(new String("ab").equals(new String("ab"))); // true
		System.out.println(new String("ab").intern() == new String("ab").intern()); // true
		
		System.out.println("".intern());
		
		

		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("1-1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		for (String intd : list) {
			// System.out.println(intd);
		}
		Set<String> h = new HashSet<String>(list);
		list.clear();
		list.addAll(h);
		for (String intd : list) {
			// System.out.println(intd);
		}

		// System.out.println(Long.MAX_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		// BigDecimal d1 = new BigDecimal("0.6");
		// BigDecimal d2 = new BigDecimal("0.4");
		// System.out.println(d1);
		// System.out.println(d2);
		// BigDecimal d3 = d1.divide(d2);
		// System.out.println(d3);
		// System.out.println(BigDecimal.ZERO);
	}

}
