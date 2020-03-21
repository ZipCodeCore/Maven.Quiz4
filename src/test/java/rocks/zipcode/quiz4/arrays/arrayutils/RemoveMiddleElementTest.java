package rocks.zipcode.quiz4.arrays.arrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.arrays.ArrayUtils;

public class RemoveMiddleElementTest {
    @Test
    public void test1() {
        // given
        String[] expected = {"Get", "This"};
        String[] input = {"Get", "Quick", "This"};
        test(expected, input);

    }

    @Test
    public void test2() {
        // given
        String[] expected = {"Get", "This", "Off", "My"};
        String[] input = {"Get", "This", "Brown", "Off", "My"};
        test(expected, input);
    }

    @Test
    public void test3() {
        // given
        String[] expected = {"Get", "This", "Off", "Fox", "My", "Plate"};
        String[] input = {"Get", "This", "Off", "Fox", "Of", "My", "Plate"};
        test(expected, input);
    }


    @Test
    public void test4() {
        // given
        String[] expected = {"Get", "This", "Off", "Of", "My", "Damn", "Errand", "List"};
        String[] input = {"Get", "This", "Off", "Of", "Jumps", "My", "Damn", "Errand", "List"};
        test(expected, input);
    }

    private void test(String[] expected, String[] input) {
        // when
        String[] actual = ArrayUtils.removeMiddleElement(input);

        //then
        Assert.assertArrayEquals(expected, actual);
    }
}
