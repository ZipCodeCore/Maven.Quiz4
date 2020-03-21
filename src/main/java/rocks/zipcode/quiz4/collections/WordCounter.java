package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> map = new HashMap<>();
    public WordCounter(String... strings) {
        for(String str : strings){
            if(map.get(str) != null){
                Integer value = map.get(str);
                value++;
                map.replace(str, value);
            }else{
                map.put(str, 1);
            }
        }
    }
    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}