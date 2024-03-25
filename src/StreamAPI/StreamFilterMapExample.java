package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("To Upper Case names having length more than 5 : \n");
		 
	        // List of String - source
	        List<String> names = new ArrayList<>();
	 
	        // add few names to String list using add() method
	        names.add("Sachin");
	        names.add("Warne");
	        names.add("Pietersen");
	        names.add("McCullum");
	        names.add("Jonty");
	        names.add("aichards");
	        names.add("Aanatunga");
	        
	        
	        List<String> l=names.stream().filter(i->i.length()>5).map(s->s.toUpperCase()).collect(Collectors.toList());
	        System.err.println(l);
	        List<String> str=names.stream().
	        		filter(i -> i.startsWith("A")|| i.startsWith("a")).
	        		map(x->x.startsWith("A") ? x.replaceFirst("A", "y"):x.replaceFirst("a", "z")).collect(Collectors.toList());
	        
	        System.out.println(str);
	        
	        
	        

	}

}
