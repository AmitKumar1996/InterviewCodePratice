package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException n){
			System.out.println(n.getMessage());
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}

		
	


	}

}
