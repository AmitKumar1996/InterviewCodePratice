package ExceptionHandling;

public class Test1 {
	
	public static void doStuf() {
		doMoreStuf();
	}
	public static void doMoreStuf() {
     System.out.println("Hello");
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          doStuf();
	}

}
