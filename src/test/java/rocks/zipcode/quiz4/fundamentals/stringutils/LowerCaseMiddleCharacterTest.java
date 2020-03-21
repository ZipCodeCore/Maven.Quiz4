package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class LowerCaseMiddleCharacterTest {
    @Test
    public void test1() {
        // given
        String input = "A";
        String expected = "a";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "AAA";
        String expected = "AaA";
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String input = "ZPPLE";
        String expected = "ZPpLE";
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "Zaffle Sauces";
        String expected = "Zaffle Sauces";
        test(expected, input);
    }

    public void test(String expected, String input) {
        // when
        String actual = StringUtils.lowerCaseMiddleCharacter(input);

        // then
        Assert.assertEquals(expected, actual);
    }

}
