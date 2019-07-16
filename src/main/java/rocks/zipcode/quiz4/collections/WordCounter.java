package rocks.zipcode.quiz4.collections;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    Map<String, Integer> map = new TreeMap();
    private String[] strings;
    private int count;
    private String[] strArray;
    private String word;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        return null;
    }
}
