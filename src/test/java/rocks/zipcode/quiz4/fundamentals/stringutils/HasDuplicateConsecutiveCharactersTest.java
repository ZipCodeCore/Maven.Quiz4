package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class HasDuplicateConsecutiveCharactersTest {
    @Test
    public void test1() {
        String input = "Fappy";
        Assert.assertTrue(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test2() {
        String input = "Cool";
        Assert.assertTrue(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test3() {
        String input = "Aeorge";
        Assert.assertFalse(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test4() {
        String input = "Talse";
        Assert.assertFalse(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }
}
