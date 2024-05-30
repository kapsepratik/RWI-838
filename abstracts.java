package abstraction;


	
abstract  class cakeprep{
	abstract void mix();
	 void bake(){
		 System.out.println("cake is being baked");
		}
}
 class eggless extends cakeprep{
	void mix(){
	 System.out.println("mixing without egg");
	}
//	void bake(){
//		 System.out.println("cake is being baked");
//		}
}

 class withegg extends cakeprep{
	void mix(){
		 System.out.println("mixing with egg");
		}
//		void bake(){
//			 System.out.println("cake is being baked");
//			}
}
public class abstracts {
	public static void main(String args[]){
		cakeprep a = new eggless();
		cakeprep b = new withegg();
		a.mix();
		a.bake();	
		b.mix();
		b.bake();	
		}
}
