package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    ArrayList<String> strings;

    public WordCounter(String... strings) {
        this.strings = new ArrayList<>(Arrays.asList(strings));
        System.out.println(strings);
    }

    public Map<String, Integer> getWordCountMap() {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {

            if (map.containsKey(strings.get(i))) {
                map.put(strings.get(i), map.get(strings.get(i)) + 1);


            }else
            map.put(strings.get(i), 1);

        }return map;
    }
}
