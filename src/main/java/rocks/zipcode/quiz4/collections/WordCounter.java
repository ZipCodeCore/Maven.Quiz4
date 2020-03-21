package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {


    String[] strings = new String[]{};

    public WordCounter(String... strings) {


      this.strings=strings;

    }

    public Map<String, Integer> getWordCountMap()

    {


        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {

            if (!map.containsKey(s)) {  // first time we've seen this string
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }

}
