package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    Map<String, Integer> spiceMap;

    public WordCounter(String... strings) {
        spiceMap = new HashMap<>();

        for(String s : strings)
            if(spiceMap.containsKey(s)){
                spiceMap.replace(s, spiceMap.get(s) + 1);
            }else
                spiceMap.put(s, 1);
    }

    public Map<String, Integer> getWordCountMap() {
        return spiceMap;
    }
}
