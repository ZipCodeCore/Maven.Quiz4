package rocks.zipcode.quiz4.collections;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    private Map<String, Integer> mapping;

    public WordCounter(String... strings) {
        mapping = new TreeMap<>();
        initialize(strings);
    }

    private void initialize(String... strings){
        for(String s : strings){
            if(!mapping.containsKey(s)){
                mapping.put(s,1);
            }else{
                Integer newValue = mapping.get(s) + 1;
                mapping.put(s,newValue);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return mapping;
    }
}
