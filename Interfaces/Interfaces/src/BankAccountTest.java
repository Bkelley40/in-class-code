import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void test() {
		BankAccount a = new BankAccount(12, "checking", "123.05");
		assertEquals("$123.05", a.getBalance());
	}

}
