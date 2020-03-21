package rocks.zipcode.quiz4.objectorientation.account;

import org.junit.Assert;
import org.junit.Test;

public class AccountSetIdTest {

    private void test(Long expectedId) {
        // given
        Account account = new Account();

        // when
        account.setId(expectedId);

        // then
        Assert.assertEquals(expectedId, account.getId());
    }

    @Test
    public void test1() {
        test(10L);
    }

    @Test
    public void test2() {
        test(110L);
    }

    @Test
    public void test3() {
        test(Long.MAX_VALUE-1);
    }

    @Test
    public void test4() {
        test(Long.MIN_VALUE+1);
    }
}
