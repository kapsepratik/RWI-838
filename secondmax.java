package Arrys;

public class secondmax {

	public static void main(String[] args) {
		int a[]= {2,4,3,5,4,5,1,23,4,78,78,6499,6498};
		int max1,max2;
		
		max1=max2=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i] != max1){
				max2=a[i];
			}
		}
      System.out.print(max2);
	}

}