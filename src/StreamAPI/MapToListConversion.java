package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListConversion {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("apple", 5, "banana", 6, "orange", 6);

        // Convert Map to List of keys
        List<String> keysList = map.keySet().stream()
                                        .collect(Collectors.toList());

        // Convert Map to List of values
        List<Integer> valuesList = map.values().stream()
                                              .collect(Collectors.toList());

        System.out.println("Map: " + map);
        System.out.println("Keys List: " + keysList);
        System.out.println("Values List: " + valuesList);
    }
}
