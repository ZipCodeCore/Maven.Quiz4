package rocks.zipcode.quiz4.fundamentals.calculator;
import org.junit.*;
import rocks.zipcode.quiz4.fundamentals.Calculator;

public class SquareRootTest {

    @Test
    public void test1() {
        // given
        test(1.0, 1.0);
    }

    @Test
    public void test2() {
        // given
        test(2.0, 4.0);
    }

    @Test
    public void test3() {
        // given
        test(3.0, 9.0);
    }

    @Test
    public void test4() {
        // given
        test(4.0, 16.0);
    }

    @Test
    public void test5() {
        // given
        test(5.0, 25.0);
    }

    private void test(Double expected, Double input) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.squareRoot(input);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
