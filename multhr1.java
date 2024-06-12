package multithreading;

class multhr2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(i+"thread 2 is running ");
		}
	}
}
class multhr1 extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
multhr1 t1=new multhr1();  
multhr2 t2=new multhr2();
t1.start();  
t2.start();
 }  
}  