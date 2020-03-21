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
        for (int i = 0; i < this.strings.length; i++) {

            if (!wordMap.containsKey(strings[i])) {
                temp = 1;
                wordMap.put(strings[i], temp);
            } else {
                temp = wordMap.get(strings[i]);
                temp++;
                wordMap.replace(this.strings[i], temp);
            }
        }

        return wordMap;
    }
}
