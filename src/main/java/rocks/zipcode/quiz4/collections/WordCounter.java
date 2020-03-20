package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> map;
    public WordCounter(String... strings) {
        this.map = new HashMap<>();
        for(String each: strings){
            putString(each);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }

    public void putString(String strings){
        if(map.containsKey(strings))
            map.put(strings, map.get(strings)+1);
        else{
            map.put(strings, 1);
        }
    }
}
