package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    ArrayList<String> strings = new ArrayList<>();

    public WordCounter(String... strings) {
        this.strings.addAll(Arrays.asList(strings));
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : strings) {
            if (!newMap.containsKey(s)){
                newMap.put(s, 1);
            }else{
                newMap.put(s, newMap.get(s) + 1);
            }
        }
        return newMap;
    }
}
