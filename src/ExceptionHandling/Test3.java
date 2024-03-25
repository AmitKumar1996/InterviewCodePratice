package ExceptionHandling;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.getCause());
//			System.out.println(e.getClass());
//			System.out.println(e.getStackTrace());
//			System.out.println(e.getSuppressed());
			
		}

	}

}
