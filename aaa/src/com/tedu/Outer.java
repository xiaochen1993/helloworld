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
				System.out.println("匿名内部类");
			};

		}.start();

	}

	static class Inner {

		int i;
       public static void bb() {
    	   System.out.println(333);
       }
		public void aa() {
			System.out.println("静态内部类");

		}

	}

	class Inner2 {
		int i;

		public void aa() {
			System.out.println("成员内部类");
			new Outer().c = 8;
		}
	}

}
