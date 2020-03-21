package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class CapitalizeMiddleCharacterTest {
    @Test
    public void test1() {
        // given
        String input = "a";
        String expected = "A";
        test(expected, input);
    }

    @Test
    public void test2() {
        // given
        String input = "aaa";
        String expected = "aAa";
        test(expected, input);
    }

    private void test(String expected, String input) {
        // when
        String actual = StringUtils.capitalizeMiddleCharacter(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
