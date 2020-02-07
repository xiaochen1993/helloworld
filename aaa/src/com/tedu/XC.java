package com.tedu;

public class XC {

	private static XC xc=new XC();
	private static int j=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个类，继承Thread类，重写run方法
		//创建一个类，实现Runnable接口，重写run方法
          // new Thread(对象).start()
       //匿名内部类
		new Thread() {
			
			@Override
			public void run() {
				Thread.currentThread().getName();
				
				while(j<50) {
					synchronized (xc) {
						for (int i = 0; i < 5; i++) {
							System.out.println("线程1--"+j++);
						}
						xc.notifyAll();   //唤醒其他线程执行打印功能
						try {
							xc.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}      //使当前线程进入休眠状态
					}
					
					
				}
				
			}
		}.start();
		
		
new Thread() {
			
			@Override
			public void run() {
				while(j<50) {
					synchronized (xc) {
						for (int i = 0; i < 5; i++) {
							System.out.println("线程2--"+j++);
						}
						xc.notifyAll();   //唤醒其他线程执行打印功能
						try {
							xc.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}      //使当前线程进入休眠状态
					}
					
					
				}
				
			}
		}.start();
	}

}
