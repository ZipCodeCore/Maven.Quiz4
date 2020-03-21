package rocks.zipcode.quiz4.collections;

import java.util.*;

public class WordCounter {

    String stringg = "";

    public WordCounter(String... strings) {
        for(String s : strings){
            this.stringg += s + " ";
        }


    }

    public Map<String, Integer> getWordCountMap() {

        String[] array = stringg.split(" ");

        Map<String, Integer> words = new TreeMap<>();

        Arrays.stream(array).forEach(string -> words.put(string, words.get(string) != null ? words.get(string)+1 : 1));


        return words;

    }
}
