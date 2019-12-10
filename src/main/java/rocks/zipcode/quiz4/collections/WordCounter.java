package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    Map<String,Integer> words = new HashMap<>();
    Integer counter;

    public WordCounter(String... strings) {

        for (String each : strings){
            counter = words.get(each);
            if (counter == null){
                counter = 1;
            } else counter ++;

            words.put(each,counter);
        }

    }

    public Map<String, Integer> getWordCountMap() {
        return words;
    }
}
