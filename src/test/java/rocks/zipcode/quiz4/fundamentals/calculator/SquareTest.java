package rocks.zipcode.quiz4.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SquareTest {
    @Test
    public void test1() {
        // given
        test(1.0, 1.0);
    }

    @Test
    public void test2() {
        // given
        test(4.0, 2.0);
    }

    @Test
    public void test3() {
        // given
        test(9.0, 3.0);
    }

    @Test
    public void test4() {
        // given
        test(16.0, 4.0);
    }

    @Test
    public void test5() {
        // given
        test(25.0, 5.0);
    }

    private void test(Double expected, Double input) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.square(input);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
