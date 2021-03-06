/**
 * 
 */
package com.huangye.Trainning.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

/**
 * @author huangye
 *
 */
public class ClassForName {
	/**
	 * 
	 * 构造方法
	 * 
	 */

	public ClassForName() {

		String classInfo = JOptionPane.showInputDialog(null, "输入类全路径");// 要求用户输入类的全路径

		try {

			Class<?> cla = Class.forName(classInfo);// 根据类的全路径进行类加载，返回该类的Class对象

			Method[] method1 = cla.getDeclaredMethods();// 利用得到的Class对象的自审，返回方法对象集合
			Method[] method = cla.getMethods();// 利用得到的Class对象的自审，返回方法对象集合

			System.out.println("forName:" + cla);

			for (Method me : method) {// 遍历该类方法的集合

				System.out.println("方法有:" + me.toString());// 打印方法信息

			}

			System.out.println("*****************************************************");

			Field[] field = cla.getDeclaredFields();// 利用得到的Class对象的自审，返回属性对象集合

			for (Field me : field) { // 遍历该类属性的集合

				System.out.println("属性有:" + me.toString());// 打印属性信息

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		new ClassForName();

	}
}
