package rocks.zipcode.quiz4.collections;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    private Map<String, Integer> wordCountMap;

    public WordCounter(String... strings) {
        this.wordCountMap = new TreeMap<>();

        countWords(strings);
    }

    private void countWords(String[] strings) {
        for (String s: strings) {
            wordCountMap.put(s, getNumberOfOccurrences(strings, s));
        }
    }

    private Integer getNumberOfOccurrences(String[] strings, String s) {
        int count = 0;
        for (String word : strings) {
            if (word.equals(s)){
                count++;
            }
        }
        return count;
    }

    public Map<String, Integer> getWordCountMap() {
        return this.wordCountMap;
    }
}
