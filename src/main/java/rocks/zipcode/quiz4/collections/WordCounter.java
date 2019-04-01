package rocks.zipcode.quiz4.collections;



import java.util.HashMap;
import java.util.Map;

public class WordCounter {
   public Map<String,Integer> wordMAp = new HashMap<>();


    public WordCounter(String... strings) {
       String strings1 = strings.toString();
        int counter = 0;
        wordMAp.put(strings1,counter++);
    }

    public Map<String, Integer> getWordCountMap() {

        return wordMAp;
    }
}
