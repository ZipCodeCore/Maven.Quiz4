package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.lang.String;

public class WordCounter {
    private Map<String, Integer> wordyWords;
    private String[] stuff;

    public WordCounter(String... strings) {
        this.stuff = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        ArrayList<String> someWords = (ArrayList<String>) Arrays.asList(this.stuff);
        Integer counter = 0;
        while (someWords.size() != 1) {
            for (int i = 0; i < someWords.size() - 1; i++) {
                for (int j = i + 1; i < someWords.size(); j++) {
                    if (someWords.get(j) == someWords.get(i)) {
                        counter++;
                    }
                    this.wordyWords.put(someWords.get(j), counter);
                }
            }
            this.wordyWords.put(someWords.get(0), 1);
        }
        return wordyWords;
    }

}
