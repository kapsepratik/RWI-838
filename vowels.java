package string;

class vowels {
  public static void main(String[] args)
  {
      String input = "1 paralelogram 0";
      String vowel = "aeiouAEIOU";
      String updated="";
      int flag=0;

      // convert String to character array
      // by using toCharArray
      char[] try1 = input.toCharArray();
      char[] try2 = vowel.toCharArray();

      for (int i = 0; i <=try1.length - 1;i++) {
    	  //System.out.print(try1[i]);
    	  for(int j=0;j<=try2.length -1;j++) {
    		  if(try2[j]==try1[i]){
    			 flag=flag+1;
    		  }
    		 }
    	  if(flag==0) {
    	  updated=updated+try1[i];
    	  }
    	  flag=0;
      }
      System.out.println(updated);
  }
}