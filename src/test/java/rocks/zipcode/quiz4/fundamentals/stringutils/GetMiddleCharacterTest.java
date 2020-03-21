package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class GetMiddleCharacterTest {
    @Test
    public void test1() {
        // given
        String input = "jerkk";
        Character expected = 'r';
        test(expected, input);
    }


    @Test
    public void test2() {
        // given
        String input = "color";
        Character expected = 'l';
        test(expected, input);
    }


    @Test
    public void test3() {
        // given
        String input = "bark!";
        Character expected = 'r';
        test(expected, input);
    }

    @Test
    public void test4() {
        // given
        String input = "park!";
        Character expected = 'r';
        test(expected, input);
    }

    private void test(Character expected, String input) {
        // when
        Character actual = StringUtils.getMiddleCharacter(input);

        // then
        Assert.assertEquals(expected, actual);
    }

}
