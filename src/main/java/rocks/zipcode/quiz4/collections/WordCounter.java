package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    private String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }


    public Map<String, Integer> getWordCountMap() {
        int counter = 0;
        int temp = 1;
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < this.strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (wordMap.get(strings[j]).equals(null)) {
                    wordMap.put(strings[j], 1);
                }
                else {
                    temp = wordMap.get(strings[j]);
                    temp++;
                    wordMap.put(this.strings[i], temp);
            }
            }
        }
        return wordMap;
    }
}
