package string;

import java.util.Arrays;

class removerepet 
{
    static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it 
            int j;
            for (j = 0; j < i; j++) 
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i) 
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    // Driver code
    public static void main(String[] args)
    {
        char str[] = "RailWorldindia".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}
//public class removerepet {
//	
//public static void main(String args[]) {
//	String name="RailWorld India private limited"; 
//	
//	String updatedval="";
//	//to count frequency of a character in the given string.
//	 int count = 0;  
//     for (int i=0; i<=name.length()-1; i++) {  
//         if(name.charAt(i) != 'i') {  
//        	 updatedval= updatedval+name.charAt(i);
//         }  
//     }  
//     System.out.println("Frequency of i is: "+updatedval); 
//}
//}
