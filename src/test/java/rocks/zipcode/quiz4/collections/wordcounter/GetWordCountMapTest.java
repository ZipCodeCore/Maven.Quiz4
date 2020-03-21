package rocks.zipcode.quiz4.collections.wordcounter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.Map;

public class GetWordCountMapTest {
    @Test
    public void test1() {
        // given
        WordCounter wordCounter = new WordCounter("Get");
        Integer expected = 1;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actual = map.get("Get");

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        WordCounter wordCounter = new WordCounter("Get", "This");
        Integer expected = 2;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actual = map.get("Get");

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        WordCounter wordCounter = new WordCounter("Get", "Get", "This");
        Integer expectedHey = 2;
        Integer expectedHello = 1;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actualHey = map.get("Get");
        Integer actualHello = map.get("This");

        // then
        Assert.assertEquals(expectedHey, actualHey);
        Assert.assertEquals(expectedHello, actualHello);
    }


    @Test
    public void test4() {
        // given
        WordCounter wordCounter = new WordCounter("Get", "Get", "This", "This", "This");
        Integer expectedHey = 2;
        Integer expectedHello = 3;

        // when
        Map<String, Integer> map = wordCounter.getWordCountMap();
        Integer actualHey = map.get("Get");
        Integer actualHello = map.get("This");

        // then
        Assert.assertEquals(expectedHey, actualHey);
        Assert.assertEquals(expectedHello, actualHello);
    }
}
