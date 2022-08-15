package com.example;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPower() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result);
	   
	}
	@Test
	void testPower1() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result);
	   
	}
	@Test
	void testPower2() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result);
		//・「practiceJunit」を入力すると、「practice_junit」が取得できる
	   
	}
}









