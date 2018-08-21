package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.CUI;

class CUITest {

	@Test
	void testValidateUser() {
		assertEquals(true, CUI.validateUser("user", "pass"));
		assertEquals(false, CUI.validateUser("user", "word"));
	}

}
