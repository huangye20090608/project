/**
 * 
 */
package com.huangye.Trainning.bigDecaimal;

import java.math.BigDecimal;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;

/**
 * @author huangye
 *
 */
public class BigDecimalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bigDecamal= new BigDecimal("1.1231231231231231321234");
		System.out.println(bigDecamal);
		System.out.println(bigDecamal.toString());
		Double doubleD= new Double("1.1231231231231231321234");
		System.out.println(doubleD);
		BigDecimal bigDecamal1= new BigDecimal(12.123123);
		System.out.println(bigDecamal1);
		BigDecimal bigDecamal12= new BigDecimal(new Double(12.123123));
		System.out.println(bigDecamal12.doubleValue());
		
		System.out.println(round(4.015));
		FelEngine fel = new FelEngineImpl();
		String maxExpression = "";
		maxExpression = bigDecamal.toString()+"+10";
		System.out.println("maxExpression:"+maxExpression);
		Object minResult = fel.eval("12.123456789123456789+12.123456789123456789");
		System.out.println("minResult:"+minResult);
		System.out.println("BigDecimal:"+new BigDecimal(minResult.toString()));
	}
	
	public static  double round(double value){
	      return Math.round( value * 100 ) / 100.0;
	}

}
