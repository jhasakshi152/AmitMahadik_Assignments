package com.Question4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class LifeCycleAnnotationTest {
	static LifeCycleAnnotation Calculator;
	@BeforeAll
	static void setup(){
		System.out.println("@BeforeAll executed");
		Calculator =new LifeCycleAnnotation();
	}

	@BeforeEach
	void setupThis(){
		System.out.println("@BeforeEach executed");
		
	}

	@Test
    void testadd()
	{
		System.out.println("EXECUTED 1st");
		assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    void testdivide()
   {
		System.out.println("EXECUTED 2nd");
		assertEquals( 6 , Calculator.divide(12, 2));
    }

	@AfterEach
	void tearThis(){
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear(){
		System.out.println("@AfterAll executed");
	}

}
