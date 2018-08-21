package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.Date;

class DateTest {

	@Test
	void testGetDate() {
		assertEquals("12/December/2018", Date.getDate("12,12,2018"));
		assertEquals("Wrong", Date.getDate("32,01,2018"));
	}

}
