package com.tedu;

public class XC {

	private static XC xc=new XC();
	private static int j=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���࣬�̳�Thread�࣬��дrun����
		//����һ���࣬ʵ��Runnable�ӿڣ���дrun����
          // new Thread(����).start()
       //�����ڲ���
		new Thread() {
			
			@Override
			public void run() {
				Thread.currentThread().getName();
				
				while(j<50) {
					synchronized (xc) {
						for (int i = 0; i < 5; i++) {
							System.out.println("�߳�1--"+j++);
						}
						xc.notifyAll();   //���������߳�ִ�д�ӡ����
						try {
							xc.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}      //ʹ��ǰ�߳̽�������״̬
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
							System.out.println("�߳�2--"+j++);
						}
						xc.notifyAll();   //���������߳�ִ�д�ӡ����
						try {
							xc.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}      //ʹ��ǰ�߳̽�������״̬
					}
					
					
				}
				
			}
		}.start();
	}

}
