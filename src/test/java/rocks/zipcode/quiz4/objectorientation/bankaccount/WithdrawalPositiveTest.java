package rocks.zipcode.quiz4.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.BankAccount;
import rocks.zipcode.quiz4.objectorientation.account.Transactable;

/**
 * @author leon on 02/01/2019.
 */
@SuppressWarnings("all")
public class WithdrawalPositiveTest {
    @Test
    public void test1() {
        test(1001.0, 801.0);
    }

    @Test
    public void test2() {
        test(1501.0, 701.0);
    }


    @Test
    public void test3() {
        test(1501.0, 1501.0);
    }

    @Test
    public void test4() {
        test(1501.0, 1001.0);
    }

    @Test
    public void test5() {
        test(1501.0, 501.0);
    }

    public void test(Double initialBalance, Double withdrawalAmount) {
        // given
        Double expected = initialBalance - withdrawalAmount;
        BankAccount bankAccount = new BankAccount();
        Transactable transactable = (Transactable)bankAccount;
        bankAccount.setBalance(initialBalance);

        // when
        transactable.withdrawal(withdrawalAmount);
        Double actual = transactable.getBalance();

        // then
        Assert.assertEquals(expected, actual);
    }
}
