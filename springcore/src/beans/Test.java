package beans;

public class Test {
	
	public Test(){//constructor
		System.out.println("Test constructor");
	}
	
	/*singleton-only single object per request, other method uses reference of 
	 * first object
	 * 
	 * prototype-for every request one object is created
	 */
	public void hello(){
		
		System.out.println("Hello World");

	}
	
	public void hello1(){
		System.out.println("hello");
	}

}
