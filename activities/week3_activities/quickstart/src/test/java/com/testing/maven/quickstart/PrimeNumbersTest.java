package com.testing.maven.quickstart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumbersTest {
	
	@Test
	void testComputePrimesA() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.computePrimes(0);
		
		assertEquals("[]", primeNumbers.toString());
		// it never enters the while loop

	}
	
	@Test
	void testComputePrimesB() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.computePrimes(7);
		
		assertEquals("[2, 3, 5, 7, 11, 13, 17]", primeNumbers.toString());
		// 9 is not a prime number

	}

	@Test
	void testComputePrimesC() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.computePrimes(8);
		
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
		// it is affected because it doesn't include 19

	}
	
	@Test
	void testComputePrimesE() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.computePrimes(8);
		
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());

	}

}
