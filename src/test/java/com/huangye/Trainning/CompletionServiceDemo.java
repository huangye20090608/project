/**
 * 
 */
package com.huangye.Trainning;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author huangye
 *
 */
public class CompletionServiceDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args){
		System.out.println( 1001/4);
		System.out.println(999%4);
		// TODO Auto-generated method stub
		// 多线程执行
//		ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//		try {
//			CompletionService<Integer> completionServcie = new ExecutorCompletionService<Integer>(pool);
//		} catch (Exception e) {
//			// TODO: handle exception
//			pool.shutdown();
//		}
		//		for (int i = 1; i <= 3; i++) {
//			completionServcie.submit(getTask(i));
//		}
//		int sum = 0;
//		for (int j = 1; j <= 3; j++) {
//			// 检索并移除表示下一个已完成任务的 Future，如果目前不存在这样的任务，则等待。
//			Future<Integer> future = completionServcie.take();
//			sum += future.get();
//		}
//		System.out.println("总数为：" + sum);
		//pool.shutdown();
	}
	
	// 得到一个任务
	public static Callable<Integer> getTask(final Integer wer) {
		final Random rand = new Random();
		Callable<Integer> task = new Callable<Integer>() {
			public Integer call() throws Exception {
				int i = rand.nextInt(10);
				int j = rand.nextInt(10);
				int sum = wer.intValue() * wer.intValue();
				System.out.println(sum);
				return sum;
			}
		};
		return task;
	}



}
