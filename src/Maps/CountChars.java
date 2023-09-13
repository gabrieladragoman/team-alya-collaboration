package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountChars {

    public static void main(String[] args) {

        Map<Character, Integer> counter = new LinkedHashMap<>();

        String str = "mississippi";

        for (char each : str.toCharArray()) {
            if(!counter.containsKey(each)){
                counter.put(each, 0);
            }
            counter.put(each, counter.get(each) + 1);
        }

        System.out.println(counter);
    }
}
