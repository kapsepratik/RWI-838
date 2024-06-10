package Exceptions;

public class exception1 {
	
		  public static void main(String args[]){  
		   try{  
		      //code that may raise exception
			   int data1=5;
			   System.out.println(data1);
			  // int data2=100/0;
			  // System.out.println(data2);
		      int data3=6;
		      String s=null;  
		     // System.out.println(s.length());//NullPointerException  
		      String s2="abc";  
		      int i=Integer.parseInt(s2);//NumberFormatException  
		      int a[]=new int[5];  
		      a[10]=50; //ArrayIndexOutOfBoundsException  
		      System.out.println(data3);
		   }
		   //catch(ArithmeticException e)
		   //{System.out.println(e);}  
		   
		 catch(Exception e)
		   {
			 System.out.println(e);
			 System.out.println("catch block");
	}  
		   
		   System.out.println("rest of the code...");  
		  }  
		}  