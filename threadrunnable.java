package multithreading;


	class threadrunnable implements Runnable{  
		public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			threadrunnable m1=new threadrunnable();  
		Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		 }  
		}  