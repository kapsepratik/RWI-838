package Exceptions;

class YoungerAge extends RuntimeException{

    YoungerAge(String message) {
	super(message);
}
     
}


public class exception3 {

public static void main(String[] args) {
	int age =32;
	if(age<18) {
		throw new YoungerAge(" vikash you are not eligible  for marriage");
	}
	else {
		System.out.println(" vikash you are eligible for marriage ");
	}

}

}