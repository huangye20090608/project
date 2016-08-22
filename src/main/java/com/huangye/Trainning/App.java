package com.huangye.Trainning;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			
			if(i==2){
				//return;
				//break;
			}
			System.out.println("Exception");
		}
//		try {
//			Integer inwe = updateCustomizedSku("str");
//			System.out.println("inwe:" + inwe);//1
//		} catch (RuntimeException e) {
//			System.out.println("RuntimeException");//2
//		}catch (Exception e) {
//			System.out.println("Exception");//3
//		}
//		System.out.println("qweqwe");//4
	}

	public static Integer updateCustomizedSku(String str) throws Exception {
		Integer updateSkuId = 0;
		if (true) {
			throw new RuntimeException("更新定制商品sku失败");
		}
		System.out.println("更新定制商品sku失败 12312");//5
		updateSkuId = 2;
		return updateSkuId;
	}
}
