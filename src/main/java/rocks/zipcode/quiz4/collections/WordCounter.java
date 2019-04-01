package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer>map = new HashMap<String, Integer>();
    private String[] strings;
    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        for(String newString: strings){
            if(map.containsKey(newString)){
                map.put(newString, map.get(newString) +1);
            }else{
                map.put(newString,1);
            }

        }
        return map;
    }
}
