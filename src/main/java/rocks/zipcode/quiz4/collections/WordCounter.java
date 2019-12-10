package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String,Integer> map = new HashMap<>();

        for(String s : strings) {
            Integer count = 0;
            for (int i = 0; i < strings.length; i++) {
                if(strings[i].equals(s)) {
                    count++;
                }
            }
            map.put(s,count);
        }
        return map;
    }
}
