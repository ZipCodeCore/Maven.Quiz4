package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordCounter {

    String[] stringArray;

    public WordCounter(String... strings) {
        this.stringArray = strings;
    }

    public Map<String, Integer> getWordCountMap() {

        Map<String, Integer> map = new HashMap<>();
//
//        for(String s : stringArray){
//            if(map.keySet().contains(s)){
//                map.put(s, map.get(s)+1);
//            } else {
//                map.put(s,1);
//            }
//        }
        for(String s : stringArray){
            map.compute(s, (k,v) -> (v == null) ? 1 : v+1);
        }
        return map;

    }
}
