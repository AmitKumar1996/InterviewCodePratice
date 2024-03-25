package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSquareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Java 8 Stream example to Square each numbers : \n");
		 
        // List of Integer - source
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        List<Integer> l=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(l);
	}

}
