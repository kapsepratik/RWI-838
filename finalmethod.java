package Finals;

//If you make any method as final, you cannot override it.

public class finalmethod {
	
		// final void run(){System.out.println("running");}  
}
     public class Bike{
	final void run(){System.out.println("running");}  
     }
		     
		class Honda extends Bike{
		   ///void run(){System.out.println("running safely with 100kmph");}  
		    // can not be override 
		   public static void main(String args[]){  
		  /// Honda honda= new Honda();  
		   //honda.run(); 
			  new Honda.run(); 
		  
		   }  
		}  //Output:Compile Time Error
