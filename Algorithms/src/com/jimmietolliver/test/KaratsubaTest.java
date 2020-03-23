/**
 * 
 */
package com.jimmietolliver.test;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import com.jimmietolliver.divideandconquer.Karatsuba;

/**
 * @author Jimmie Tolliver
 *
 */
public class KaratsubaTest {

	@Test
	public void test() {
		BigInteger x = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
		BigInteger y = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
		
		Karatsuba k = new Karatsuba();
		
		BigInteger result = k.karatsuba(x, y);
		
		
		assertEquals(y.multiply(x), result);
	}

}
