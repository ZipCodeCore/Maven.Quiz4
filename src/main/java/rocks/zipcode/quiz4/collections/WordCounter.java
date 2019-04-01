package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    private Map<String, Integer> map = new HashMap<>();
    private  String[] strArr = new String[5];

        public WordCounter(String... strings) {
            this.strArr=strings;
        }


    public Map<String, Integer> getWordCountMap() {
        int count=0;
        for (int i=0; i<strArr.length;i++) {

            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                     count = count+1; // get word count
                    map.put(strArr[i], count+1); // override word count
                } else {
                    map.put(strArr[i], 1); // initial word count to 1
                }
                continue;
            }
            continue;
        }
        return map;
        }

        public String[] getStrArr () {
            return strArr;
        }

        public void setStrArr (String[]strArr){
            this.strArr = strArr;
        }
    }