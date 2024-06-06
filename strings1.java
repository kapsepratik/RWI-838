package string;

public class strings1 {
	
public static void main(String args[]) {
	String name="RailWorld India private limited";  
	char ch=name.charAt(14);//returns the char value at the 4th index  
	System.out.println("charactor at given position: "+ch);  
	
	//to count frequency of a character in the given string.
	 int count = 0;  
     for (int i=0; i<=name.length()-1; i++) {  
         if(name.charAt(i) == 'i') {  
             count++;  
         }  
     }  
     System.out.println("Frequency of i is: "+count);  
}
}
