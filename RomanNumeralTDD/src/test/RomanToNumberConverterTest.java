package test;

import static org.junit.Assert.*;
import main.NumberToRomanConverter;
import main.RomanToNumberConverter;

import org.junit.Before;
import org.junit.Test;

public class RomanToNumberConverterTest {

	RomanToNumberConverter numberConverter;

	@Before
	public void setUp() {
		numberConverter = new RomanToNumberConverter();
	}

	@Test
	public void whenGivenIOutputShouldBeOne() {
		assertEquals(1,
				numberConverter.convertFromRomanNumeralToInt("I"));
	}
	
	@Test
	public void whenGivenIIOutputShouldBeTwo() {
		assertEquals(2,
				numberConverter.convertFromRomanNumeralToInt("II"));
	}
	
	@Test
	public void whenGivenVOutputShouldBeFive() {
		assertEquals(5,
				numberConverter.convertFromRomanNumeralToInt("V"));
	}
	
	@Test
	public void whenGivenIVOutputShouldBeFour() {
		assertEquals(4,
				numberConverter.convertFromRomanNumeralToInt("IV"));
	}
	
	@Test
	public void whenGivenVIOutputShouldBeSix() {
		assertEquals(6,
				numberConverter.convertFromRomanNumeralToInt("VI"));
	}
	
	@Test
	public void whenGivenVIIOutputShouldBeSeven() {
		assertEquals(7,
				numberConverter.convertFromRomanNumeralToInt("VII"));
	}
	
	@Test
	public void whenGivenXOutputShouldBeTen() {
		assertEquals(10,
				numberConverter.convertFromRomanNumeralToInt("X"));
	}
	
	@Test
	public void whenGivenIXOutputShouldBeNine() {
		assertEquals(9,
				numberConverter.convertFromRomanNumeralToInt("IX"));
	}
	
	@Test
	public void whenGivenXIIOutputShouldBeTwelve() {
		assertEquals(12,
				numberConverter.convertFromRomanNumeralToInt("XII"));
	}
	
	
	
}
