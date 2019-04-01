package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    List<String> myWordList;
    public WordCounter(String... strings) {
        myWordList = new ArrayList<String>();
        for(String str: strings)
        myWordList.add(str);
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> words = new HashMap<>();
        for(String str:myWordList){
            if(words.containsKey(str)){
                words.put(str, 1+words.get(str));
            }
            else{
                words.put(str,1);
            }
        }
        return words;
    }
}
