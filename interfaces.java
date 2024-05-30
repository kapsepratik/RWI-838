package abstraction;

interface cakeprep2{
	  void mix();
	  void bake();
}
 class eggless2 implements cakeprep2{
	public void mix(){
	 System.out.println("mixing without egg");
	}
	public void bake(){
		 System.out.println("cake is being baked");
	}
}

 class withegg2 implements cakeprep2{
	public void mix(){
		 System.out.println("mixing with egg");
		}
	public void bake(){
			 System.out.println("cake is being baked");
			}
}
public class interfaces {
	public static void main(String args[]){
		cakeprep a = new eggless();
		cakeprep b = new withegg();
		a.mix();
		a.bake();	
		b.mix();
		b.bake();	
		}
}
