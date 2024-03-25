package HashMap;

import java.util.HashMap;
import java.util.Map;

public class NullKey {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Amit", 1);
        hm.put("Raja", 2);
        hm.put(null, 3);
        hm.put(null, 5);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
