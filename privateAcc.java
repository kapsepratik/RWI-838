package AccessModifiers;
//Private: The access level of a private modifier is only within the class. 
//It cannot be accessed from outside the class.
//If you make any class constructor private,
//you cannot create the instance of that class from outside the class.

class A{  
    private int data=40;  
    //private void msg() 
    //private A();//private constructor  
      void msg(){
        System.out.println("Hello java");
    }  
}
    
     public class privateAcc{  
      public static void main(String args[]){  
    	 System.out.println("main is running ");
        A obj=new A();  
      // System.out.println(obj.data);//Compile Time Error  
        obj.msg();//Compile Time Error  if msg will be private
        }  
     }  


