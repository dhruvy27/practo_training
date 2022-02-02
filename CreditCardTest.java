package practo;

import  static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class CreditCardTest {

	@Test
	void testlen() {
		CreditCard test1 = new CreditCard();
		String expected = "Invalid card no. length";
		String actual = test1.CreditCardValidation("12345678901a34s",433);
		assertEquals(expected,actual);
	}
	
	@Test
	void testchar() {
		CreditCard test1 = new CreditCard();
		String expected = "Invalid card no. characters";
		String actual = test1.CreditCardValidation("12345678",433);
		assertEquals(expected,actual);
	}
	
	@Test
	void testcvv() {
		CreditCard test1 = new CreditCard();
		String expected = "invalid cvv";
		String actual = test1.CreditCardValidation("1234567890123456",436754);
		assertEquals(expected,actual);
	}
	@Test
	void testcardnum() {
		CreditCard test1 = new CreditCard();
		String expected = "Invalid Card";
		String actual = test1.CreditCardValidation("1234567890123456",436);
		assertEquals(expected,actual);
	}
	
	@Test
	void testvalidcardnum() {
		CreditCard test1 = new CreditCard();
		String expected = "Valid Card";
		String actual = test1.CreditCardValidation("5061706060933089",436);
		assertEquals(expected,actual);
	}

}
