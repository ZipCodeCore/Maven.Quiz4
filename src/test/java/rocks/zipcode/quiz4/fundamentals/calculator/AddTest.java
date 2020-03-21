package rocks.zipcode.quiz4.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class AddTest {
    @Test
    public void test1() {
        // given
        test(100.0, 50.0, 50.0);
    }

    @Test
    public void test2() {
        // given
        test(150.0, 50.0, 150.0);
    }

    @Test
    public void test3() {
        // given
        test(50.0, 25.0, 25.0);
    }

    @Test
    public void test4() {
        // given
        test(75.0, 25.0, 50.0);
    }

    @Test
    public void test5() {
        // given
        test(25.0, 12.5, 12.5);
    }

    private void test(Double expected, Double input1, Double input2) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.add(input1, input2);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
