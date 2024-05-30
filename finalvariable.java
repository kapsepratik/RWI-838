package Finals;

//If you make any variable as final, you cannot change the value of final variable(It will be constant).

public class finalvariable {
	 final int speedlimit=90;//final variable  
	 void run(){  
	  speedlimit=400; // value can not be changed of final variable once it is assigned 
	  
	 }  
	 public static void main(String args[]){  
		 finalvariable obj=new  finalvariable();  
	 obj.run();  
	 }  
	}//end of class  //Output:Compile Time Error