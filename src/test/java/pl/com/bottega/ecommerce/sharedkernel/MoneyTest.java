package pl.com.bottega.ecommerce.sharedkernel;

import org.junit.Test;

import java.util.Currency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MoneyTest {

    @Test
    public void testMultiplyBy_PositiveValue_SameCurrency() throws Exception {
        Money money = new Money(100, Currency.getInstance("PLN"));

        Money money2 = money.multiplyBy(5);

        assertThat(money2.getCurrency(), equalTo(money.getCurrency()));
        assertThat(money2, equalTo(new Money(500, money.getCurrency())));
    }
}