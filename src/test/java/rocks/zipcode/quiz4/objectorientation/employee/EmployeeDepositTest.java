package rocks.zipcode.quiz4.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.BankAccount;
import rocks.zipcode.quiz4.objectorientation.account.Employee;
import rocks.zipcode.quiz4.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
public class EmployeeDepositTest {
    @Test
    public void test1() {
        test(01.0, 101.0);
    }

    @Test
    public void test2() {
        test(01.0, 201.0);
    }

    @Test
    public void test3() {
        test(101.0, 1001.0);
    }

    @Test
    public void test4() {
        test(201.0, 3001.0);
    }

    @Test
    public void test5() {
        test(01.0, 4001.0);
    }


    private void test(Double preDepositBalance, Double amountToDeposit) {
        // given
        Employee employee = new Employee();
        BankAccount bankAccount = employee.getBankAccount();
        Transactable employeeAsTransactable = (Transactable) employee;

        employeeAsTransactable.deposit(preDepositBalance);
        Double expectedEmployeeBalance = preDepositBalance + amountToDeposit;


        // when
        employeeAsTransactable.deposit(amountToDeposit);
        Double actualEmployeeBalance = employeeAsTransactable.getBalance();
        Double actualBankAccountBalance = ((Transactable)bankAccount).getBalance();


        // then
        Assert.assertEquals(expectedEmployeeBalance, actualEmployeeBalance);
        Assert.assertEquals(expectedEmployeeBalance, actualBankAccountBalance);
    }
}
