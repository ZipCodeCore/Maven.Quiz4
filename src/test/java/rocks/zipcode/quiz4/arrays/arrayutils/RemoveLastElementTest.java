package rocks.zipcode.quiz4.arrays.arrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.arrays.ArrayUtils;

/**
 * @author leon on 02/01/2019.
 */
public class RemoveLastElementTest {
    @Test
    public void test1() {
        // given
        String[] expected = {"Get", "Quick"};
        String[] input = {"Get", "Quick", "Brown"};
        test(expected, input);

    }

    @Test
    public void test2() {
        // given
        String[] expected = {"This", "Quick", "Brown", "Fox"};
        String[] input = {"This", "Quick", "Brown", "Fox", "Jumps"};
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String[] expected = {"Off", "Quick", "Brown", "Fox", "Jumps", "Over"};
        String[] input = {"Off", "Quick", "Brown", "Fox", "Jumps", "Over", "The"};
        test(expected, input);
    }


    @Test
    public void test4() {
        // given
        String[] expected = {"My", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy"};
        String[] input = {"My", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"};
        test(expected, input);
    }

    private void test(String[] expected, String[] input) {
        // when
        String[] actual = ArrayUtils.removeLastElement(input);

        //then
        Assert.assertArrayEquals(expected, actual);
    }
}
