package com.example.singlemode;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程下五中单利模式的调用效率
 * 
 *@author 北飞的候鸟
 */
@SuppressWarnings("all")
public class Client3 {

	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();
		int  threadNum = 10;
		
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

		for (int i = 0; i < threadNum; i++) {
			
			new Thread(new Runnable() {
			
				@Override
				public void run() {

					for (int i = 0; i < 10000000; i++) {
						Object o = SingletonDemo4.getInstance();
						//Object o = SingletonDemo5.INSTANCE;
						//Object o = SingletonDemo2.getSyncInstance();
					}

					countDownLatch.countDown();
				}
			
			}).start();
			
		}

		countDownLatch.await();

		long end = System.currentTimeMillis();
		System.out.println("time" + (end - start));
	}
}
