package rocks.zipcode.quiz4.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.Employee;
import rocks.zipcode.quiz4.objectorientation.account.Worker;

/**
 * @author leon on 30/12/2018.
 */
public class IncreaseHoursWorkedTest {

    @Test
    public void test1() {
        // given
        test(01.0, 11.0);
    }

    @Test
    public void test2() {
        // given
        test(01.0, 51.0);
    }


    @Test
    public void test4() {
        // given
        test(11.0, 101.0);
    }


    @Test
    public void test5() {
        // given
        test(21.0, 21.0);
    }


    private void test(Double numberOfHoursWorkedSoFar, Double numberOfHoursToWork) {
        // given
        Employee employee = new Employee();
        Worker employeeAsWorker = (Worker) employee;

        employeeAsWorker.increaseHoursWorked(numberOfHoursWorkedSoFar);
        Double expected = numberOfHoursWorkedSoFar + numberOfHoursToWork;


        // when
        employeeAsWorker.increaseHoursWorked(numberOfHoursToWork);
        Double actual = employeeAsWorker.getHoursWorked();


        // then
        Assert.assertEquals(expected, actual);
    }
}
