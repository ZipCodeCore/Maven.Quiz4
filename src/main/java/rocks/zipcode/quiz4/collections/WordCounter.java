package rocks.zipcode.quiz4.collections;

import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {

    List<String> strArr = new ArrayList<>();

    public WordCounter(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            this.strArr.add(strings[i]);
        }

    }

    public Map<String, Integer> getWordCountMap() {

        Map<String, Integer> countMap = new HashMap<>();
      //  countMap = this.strArr.stream().collect(Collectors.groupingBy(x->x),Collectors.counting());
        for(String string: this.strArr){
            if(countMap.containsKey(string)){
                countMap.put(string,countMap.get(string) + 1);
            }
            else {
                countMap.put(string,1);
            }
        }

        return countMap;
    }
}
