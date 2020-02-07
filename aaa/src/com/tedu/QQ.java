package com.tedu;

public class QQ {
   private static QQ q=new QQ();
   private static int j=1;
   
   public static void main(String[] args) {
	    new Thread() {
	    	@Override
	    	public void run() {
	    		
	    		// TODO Auto-generated method stub
	    		while(j<50) {
	    			
                   synchronized (q) {
					for (int i = 0; i < 5; i++) {
						System.out.println("线程1--"+j++);
					}
					
					q.notifyAll();
					try {
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	    			
	    		}
	    	}
	    	
	    }.start();
	    
	    
	    new Thread() {
	    	@Override
	    	public void run() {
	    		
	    		// TODO Auto-generated method stub
	    		while(j<50) {
	    			
                   synchronized (q) {
					for (int i = 0; i < 5; i++) {
						System.out.println("线程2--"+j++);
					}
					
					q.notifyAll();
					try {
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	    			
	    		}
	    	}
	    	
	    }.start();
}
   
   
   
}
