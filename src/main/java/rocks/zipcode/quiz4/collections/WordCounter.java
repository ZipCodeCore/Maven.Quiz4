package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> hm = new HashMap<String, Integer>();


    public WordCounter(String... strings) {
        for (String i : strings) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
    }

    public Map<String, Integer> getWordCountMap() {

        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }

        return hm;
    }
}
