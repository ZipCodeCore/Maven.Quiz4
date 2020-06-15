package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    HashMap<String,Integer> result = new HashMap<>();

    public WordCounter(String... strings) {
        for (String item : strings){
            if(result.containsKey(item)){

                Integer count = result.get(item);
                result.put(item,count+1);

            }else{
                result.put(item,1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return result;
    }
}
