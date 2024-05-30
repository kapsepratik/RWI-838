package methodOverriding;

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle{  
//defining a method  
void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class Bike2 extends Vehicle{  
//defining the same method as in the parent class  
void run(){System.out.println("Bike is running safely");}  
}
class meth1{
public static void main(String args[]){  
Bike2 obj = new Bike2();//creating object  
Vehicle v=new Vehicle();
obj.run();//calling method  
v.run();
}  
}  