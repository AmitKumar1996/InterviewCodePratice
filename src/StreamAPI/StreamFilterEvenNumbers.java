package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEvenNumbers {
	
	 public static void main(String[] args) {
		 
	        System.out.println("Java 8 Stream example to filter only even number : \n");
	 
	        // List of Integer - source
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	        
	  
	        
	        List<Integer> l=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
	        
	        System.out.println(l);
	        
	        
	        
	        
	        // print to console using Java 8 forEach
	       // filterEvenNumbers.forEach(i -> System.out.println(i));
	        
	        
	        
	        
	 }

}
