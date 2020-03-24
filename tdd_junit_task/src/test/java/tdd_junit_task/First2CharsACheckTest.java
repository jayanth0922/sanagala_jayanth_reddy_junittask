package tdd_junit_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class First2CharsACheckTest {
	First2CharsACheck check;
	@BeforeEach
	void setUp() {
		check=new First2CharsACheck();
	}
	@Test
	void testEmptyChar() {
		
		String result=check.check2Chars("");
		assertEquals("", result);
	}
	@Test
	void test1charwithA() {
		
		String result=check.check2Chars("A");
		assertEquals("", result);
	}
	@Test
	void test1charwithoutA() {
		
		String result=check.check2Chars("B");
		assertEquals("B", result);
	}
	@Test
	void test2Chars() {
		
		String result=check.check2Chars("AB");
		assertEquals("B", result);
	}
	@Test
	void test3chars() {
		
		String result=check.check2Chars("AAB");
		assertEquals("B", result);
	}
	@Test
	void test4chars() {
	
		String result=check.check2Chars("BACD");
		assertEquals("BCD", result);
	}
	@Test
	void test5chars() {
		
		String result=check.check2Chars("BBBAA");
		assertEquals("BBBAA", result);
	}
	@Test
	void testNchars() {
		
		String result=check.check2Chars("AAAAAAAAAAAA");
		assertEquals("AAAAAAAAAA", result);
	}
}
