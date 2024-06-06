package Arrys;

public class arrpalindrome {
	
	    public void isPalindrome(int arr[]) {
	        int n = arr.length;
	        int i,check=0;
	        for ( i = 0; i < n / 2; i++) {
	            if (arr[i] != arr[n - i - 1]) {
	            	check++;
	            	 break;
	            }
	          }
	        if(check==0) {
	        System.out.println("arry is Palindrome");
	        }
	        else {
	        	System.out.println("arr is not palindrome");
	        }
	    }

	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 2, 1};
	        int[] array2 = {1, 2, 3, 4, 5};


	        arrpalindrome a=new arrpalindrome();
	       // arrpalindrome b=new arrpalindrome();
	        a.isPalindrome(array1);
	        a.isPalindrome(array2);
	    }
	}


