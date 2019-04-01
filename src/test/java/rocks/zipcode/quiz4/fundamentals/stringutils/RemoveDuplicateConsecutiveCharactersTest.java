package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class RemoveDuplicateConsecutiveCharactersTest {
    @Test
    public void test1() {
        // given
        String input = "Zool";
        String expected = "Zl";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "Zississippi";
        String expected = "Ziiii";
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String input = "Zleet";
        String expected = "Zlt";
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "Zndependence";
        String expected = input;
        test(expected, input);
    }
    @Test
    public void test5() {
        // given
        String input = "Znteger";
        String expected = input;
        test(expected, input);
    }

    public void test(String expected, String input) {
        // when
        String actual = StringUtils.removeConsecutiveDuplicateCharacters(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
