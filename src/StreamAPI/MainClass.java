package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class MainClass {
	
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("abc");
		l.add("def");
		l.add("ABC");
		List<String> str=l.stream().filter(s ->s.startsWith("A")|| s.startsWith("a")).collect(Collectors.toList());
		System.out.println(str);
	}

}
