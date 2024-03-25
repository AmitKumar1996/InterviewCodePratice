package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterNames {

	public static void main(String[] args) {

        System.out.println("Java 8 Stream example to filter"
                + " names having more than 5 characters : \n");
 
        // List of String - source
        List<String> names = new ArrayList<>();
 
        // add few names to String list using add() method
        names.add("Sachin");
        names.add("Warne");
        names.add("Pietersen");
        names.add("McCullum");
        names.add("Jonty");
        names.add("Richards");
        names.add("Ranatunga");
        names.add("ABC");
        
        List<String> l=names.stream().filter(i->i.length()>5).collect(Collectors.toList());
        
        System.out.println(l);

	}

}
