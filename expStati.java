package AccessModifiers;

//ode that is written inside the static block run once, when the class is getting loaded into the memory.
//To invoke the static block, there is no specific way since the static block gets executed automatically, 
//whenever in the memory the class is loaded. Observe the following illustration.
public class expStati {

	static{
		System.out.println("hello from static");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello from main");
	}

	static{
		System.out.println("hello from static2");
	}
}
