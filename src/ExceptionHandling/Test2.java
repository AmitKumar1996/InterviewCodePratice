package ExceptionHandling;

public class Test2 {
	
	public static void doStuf() {
		doMoreStuf();
	}
	public static void doMoreStuf() {
     System.out.println(10/0);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          doStuf();
	}

}