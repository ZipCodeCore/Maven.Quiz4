package rocks.zipcode.quiz4.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.BankAccount;
import rocks.zipcode.quiz4.objectorientation.account.Transactable;

/**
 * @author leon on 02/01/2019.
 */
@SuppressWarnings("all")
public class DepositPositiveTest {
    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        test(1001.0, -11.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        test(101.0, -501.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        test(551.0, -5001.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        test(781.0, -901.0);
    }

    public void test(Double initialBalance, Double depositAmount) {
        // given
        Double expected = initialBalance + depositAmount;
        BankAccount bankAccount = new BankAccount();
        Transactable transactable = (Transactable)bankAccount;
        bankAccount.setBalance(initialBalance);

        // when
        transactable.deposit(depositAmount);
        Double actual = transactable.getBalance();

        // then
        Assert.assertEquals(expected, actual);
    }
}
