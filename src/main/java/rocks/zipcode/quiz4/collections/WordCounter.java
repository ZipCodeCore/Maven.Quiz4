package rocks.zipcode.quiz4.collections;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> map = new TreeMap<>();
        for(String s : strings){
            if(map.keySet().contains(s)){
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        return map;
    }
}
