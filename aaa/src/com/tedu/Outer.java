package com.tedu;

import java.util.Map;

public class Outer {

	private int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Inner.bb();
		new Outer().new Inner2().aa();
		new Thread() {
			public void run() {
				System.out.println("�����ڲ���");
			};

		}.start();

	}

	static class Inner {

		int i;
       public static void bb() {
    	   System.out.println(333);
       }
		public void aa() {
			System.out.println("��̬�ڲ���");

		}

	}

	class Inner2 {
		int i;

		public void aa() {
			System.out.println("��Ա�ڲ���");
			new Outer().c = 8;
		}
	}

}
