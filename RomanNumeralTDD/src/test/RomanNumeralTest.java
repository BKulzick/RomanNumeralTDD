package test;

import static org.junit.Assert.*;
import main.NumberToRomanConverter;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {

	NumberToRomanConverter romanNumeral;

	@Before
	public void setUp() {
		romanNumeral = new NumberToRomanConverter();
	}

	@Test
	public void whenGivenOneOutputShouldBeI() {
		assertEquals("I",
				(romanNumeral.convertFromIntegerToRomanNumeral("1")).toString());
	}

	@Test
	public void whenGivenFiveOutputShouldBeV() {
		assertEquals("V", romanNumeral.convertFromIntegerToRomanNumeral("5")
				.toString());
	}

	@Test
	public void whenGivenTenOutputShouldBeX() {
		assertEquals("X", romanNumeral.convertFromIntegerToRomanNumeral("10")
				.toString());

	}

	@Test
	public void whenGivenTwoOutputShouldBeII() {
		assertEquals("II", romanNumeral.convertFromIntegerToRomanNumeral("2")
				.toString());

	}

	@Test
	public void whenGivenThreeOutputShouldBeIII() {
		assertEquals("III", romanNumeral.convertFromIntegerToRomanNumeral("3")
				.toString());

	}

	@Test
	public void whenGivenFourOutputShouldBeIV() {
		assertEquals("IV", romanNumeral.convertFromIntegerToRomanNumeral("4")
				.toString());
	}
	
	@Test
	public void whenGivenNineOutputShouldBeIX() {
		assertEquals("IX", romanNumeral.convertFromIntegerToRomanNumeral("9")
				.toString());
	}
	
	@Test
	public void whenGivenElevenOutputShouldBeXI() {
		assertEquals("XI", romanNumeral.convertFromIntegerToRomanNumeral("11")
				.toString());
	}
	
	@Test
	public void whenGivenSeventeenOutputShouldBeXVII(){
		assertEquals("XVII", romanNumeral.convertFromIntegerToRomanNumeral("17")
				.toString());
	}
	
	@Test
	public void whenGivenTwentyThreeOutputShouldBeXXIII(){
		assertEquals("XXIII", romanNumeral.convertFromIntegerToRomanNumeral("23")
				.toString());
	
	}
	
	@Test
	public void whenGivenThirtyThreeAndSeventyEightOutputShouldBeXXXIIIandLXVIII(){
		assertEquals("XXIII", romanNumeral.convertFromIntegerToRomanNumeral("23")
				.toString());

	}
	
	@Test
	public void whenGivenOneHundredNinetyNineOutputShouldBeCXCIX(){
		assertEquals("CXCIX", romanNumeral.convertFromIntegerToRomanNumeral("199")
				.toString());
	}
	
	@Test
	public void whenGivenNineHundredNinetyNineOutputShouldBeCMXCIX(){
		assertEquals("CMXCIX", romanNumeral.convertFromIntegerToRomanNumeral("999")
				.toString());
	}
	@Test
	public void whenGivenThreeThousdandSixHundredNinetyNineOutputShouldBeMMMDCXCIX(){
		assertEquals("MMMDCXCIX", romanNumeral.convertFromIntegerToRomanNumeral("3699")
				.toString());
	}
}
