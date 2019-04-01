package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    ArrayList<String> words;

    public WordCounter(String... strings) {
        words = new ArrayList<>();
        words.addAll(Arrays.asList(strings));
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> answer = new HashMap<>();
        for (String word:words) {
            answer.put(word, getCountOfWord(words,word));
        }
        return answer;
    }

    public Integer getCountOfWord(ArrayList<String> words, String word){
        Integer count = 0;
        for (String curentWord:words) {
            if(curentWord == word){
                count ++;
            }
        }
        return count;
    }
}
