package string;

import java.util.Scanner;

class reverseStr {
    public static void main (String[] args) {
       
        String str= "1 paralelogram 0", nwstr="",nwstr2="";
        char ch,ch2;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string :");
      String  str2= sc.next();
      
      System.out.print("Original word: ");
      System.out.println(str); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nwstr= ch+nwstr; //adds each character in front of the existing string
      }
      for (int i=0; i<str2.length(); i++)
      {
        ch2= str2.charAt(i); //charAT() extracts each character
        nwstr2= ch2+nwstr2; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nwstr);
      System.out.println("Reversed word from user input: "+ nwstr2);
      
      
    }
}
//------------------------------------------------------------------------------
// another approach 

//class ReverseString {
//    public static void main(String[] args)
//    {
//        String input = "1 paralelogram 0";
// 
//        // convert String to character array
//        // by using toCharArray
//        char[] try1 = input.toCharArray();
// 
//        for (int i = try1.length - 1; i >= 0; i--)
//            System.out.print(try1[i]);
//    }
//}