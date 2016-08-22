/**
 * 
 */
package com.huangye.Trainning.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author huangye
 *
 */
public class MyClass {
	public int count;
	public int countArray;
    public MyClass(int start) {
        count = start;
    }
    public void increase(int step) {
        count = count + step;
    }
    public void increaseArray(int step,int stepq) {
    	countArray = count + step + stepq;
    }
    
    public static void main(String[] agrs){
//    	MyClass myClass = new MyClass(0); //一般做法
//    	myClass.increase(2);
//    	System.out.println("Normal -> " + myClass.count);
    	try {
    		Class<?> classObj = Class.forName("com.huangye.Trainning.reflect.MyClass");
    	    Constructor<?> constructor = classObj.getConstructor(int.class); //获取构造方法
    	    System.out.println(constructor);
    	    MyClass myClassReflect = (MyClass)constructor.newInstance(10); //创建对象
    	    Method method = MyClass.class.getMethod("increase", int.class);  //获取方法
    	    method.invoke(myClassReflect, 5); //调用方法
    	    Field field = MyClass.class.getField("count"); //获取域
    	    System.out.println("Reflect -> " + field.getInt(myClassReflect)); //获取域的值
    	    
    	    Method methodArray =  MyClass.class.getMethod("increaseArray", new Class[]{int.class,int.class});
    	    methodArray.invoke(myClassReflect,new Object[]{10,20});
    	    
    	    Field fieldArray = MyClass.class.getField("countArray"); //获取域
    	    System.out.println("ReflectArray -> " + fieldArray.getInt(myClassReflect)); //获取域的值
    	    
    	} catch (Exception e) { 
    	    e.printStackTrace();
    	} 
    }
}
