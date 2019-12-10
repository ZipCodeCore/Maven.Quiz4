package rocks.zipcode.quiz4.collections;

import java.util.*;

public class WordCounter {
    private final String[] stringArray;

    public WordCounter(String... strings) {
        this.stringArray= strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> map = new HashMap<>();
        List<String> allWords = getAllWords();
        for(String word : allWords) {
            map.put(word, getNumberOfOccurrences(allWords, word));
        }
        return map;
    }

    private Integer getNumberOfOccurrences(List<String> allWords, String wordToCheck) {
        int count = 0;
        for(String word : allWords) {
            if(word.equals(wordToCheck)) {
                count++;
            }
        }
        return count;
    }

    private List<String> getAllWords() {
        List<String> result = new ArrayList<>();
        for(String string : stringArray) {
            String[] words = string.split(" ");
            for(String word : words) {
                result.add(word);
            }
        }
        return result;
    }
}
