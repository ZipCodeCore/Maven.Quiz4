package rocks.zipcode.quiz4.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordCounter {
//The purpose of this class is to manage a mapping of String to Integer.
//The class should be able to identify the number times a word has occurred in a given String array
//A word is a series of characters delimited by spaces
    private Map<String, Integer> counter;


    private void addToCount(String str) {
        Set<String> key = counter.keySet();
        if (key.contains(str)) {
            counter.put(str, counter.get(str) + 1);
        } else {
            counter.put(str, 1);
        }
    }
        public WordCounter(String... strings) {
            this.counter = new TreeMap<>();
            for (String str : strings) {
                addToCount(str);
            }
    }
        //complete this
    // the map i made will get the the word count
    public Map<String, Integer> getWordCountMap() {
        return this.counter;
    }
}