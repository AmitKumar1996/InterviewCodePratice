package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange");
      //  list.add("Mango");

        // Convert List to Map with each string as key and its length as value
        Map<String, Integer> map = list.stream()
                                      .collect(Collectors.toMap(s -> s, s -> s.length()));

        System.err.println("List: " + list);
        System.out.println("Map: " + map);
    }
}









//---------------------------------------------------------------------------------------------------------------------------------
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class ListToMapConversion {
//  public static void main(String[] args) {
//      List<String> list = List.of("apple", "banana", "orange");
//
//      // Convert List to Map with each string as key and its length as value
//      Map<String, Integer> map = list.stream()
//                                    .collect(Collectors.toMap(s -> s, String::length));
//
//      System.out.println("List: " + list);
//      System.out.println("Map: " + map);
//  }
//}
//
