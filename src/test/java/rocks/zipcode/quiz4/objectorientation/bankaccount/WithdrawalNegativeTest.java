package rocks.zipcode.quiz4.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.BankAccount;
import rocks.zipcode.quiz4.objectorientation.account.Transactable;

/**
 * @author leon on 30/12/2018.
 */
@SuppressWarnings("all")
public class WithdrawalNegativeTest {

    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        test(01.0, 11.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        test(101.0, 501.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        test(101.0, -501.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        test(001.0, -501.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test5() {
        test(001.0, 1.00);
    }

    private void test(Double initialBalance, Double withdrawalAmount) {
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
