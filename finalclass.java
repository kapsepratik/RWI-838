package Finals;

//If you make any class as final, you cannot extend it.

public class finalclass {
	
	final class Bike{
		
	}  
	  
	class Honda1 extends Bike{  
		//final class cannot be extended
	  void run(){System.out.println("running safely with 100kmph");}  
	    
	  public static void main(String args[]){  
	  Honda1 honda= new Honda1();  
	  honda.run();  
	  }  
	}  

}//Output:Compile Time Error
