package test;

import static org.junit.Assert.*;
import main.RomanNumeralConverter;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {

	RomanNumeralConverter romanNumeral;

	@Before
	public void setUp() {
		romanNumeral = new RomanNumeralConverter();
	}

	@Test
	public void whenGivenOneOutputShouldBeI() {
		assertEquals("I",
				(romanNumeral.convertFromIntToRomanNumeral("1")).toString());
	}

	@Test
	public void whenGivenFiveOutputShouldBeV() {
		assertEquals("V", romanNumeral.convertFromIntToRomanNumeral("5")
				.toString());
	}

	@Test
	public void whenGivenTenOutputShouldBeX() {
		assertEquals("X", romanNumeral.convertFromIntToRomanNumeral("10")
				.toString());

	}

	@Test
	public void whenGivenTwoOutputShouldBeII() {
		assertEquals("II", romanNumeral.convertFromIntToRomanNumeral("2")
				.toString());

	}

	@Test
	public void whenGivenThreeOutputShouldBeIII() {
		assertEquals("III", romanNumeral.convertFromIntToRomanNumeral("3")
				.toString());

	}

	@Test
	public void whenGivenFourOutputShouldBeIV() {
		assertEquals("IV", romanNumeral.convertFromIntToRomanNumeral("4")
				.toString());
	}
	
	@Test
	public void whenGivenNineOutputShouldBeIX() {
		assertEquals("IX", romanNumeral.convertFromIntToRomanNumeral("9")
				.toString());
	}
	
	@Test
	public void whenGivenElevenOutputShouldBeXI() {
		assertEquals("XI", romanNumeral.convertFromIntToRomanNumeral("11")
				.toString());
	}
	
	@Test
	public void whenGivenSeventeenOutputShouldBeXVII(){
		assertEquals("XVII", romanNumeral.convertFromIntToRomanNumeral("17")
				.toString());
	}
	
	@Test
	public void whenGivenTwentyThreeOutputShouldBeXXIII(){
		assertEquals("XXIII", romanNumeral.convertFromIntToRomanNumeral("23")
				.toString());
	
	}
	
	@Test
	public void whenGivenThirtyThreeAndSeventyEightOutputShouldBeXXXIIIandLXVIII(){
		assertEquals("XXIII", romanNumeral.convertFromIntToRomanNumeral("23")
				.toString());

	}
	
	@Test
	public void whenGivenOneHundredNinetyNineOutputShouldBeCXCIX(){
		assertEquals("CXCIX", romanNumeral.convertFromIntToRomanNumeral("199")
				.toString());
	}
	
	@Test
	public void whenGivenNineHundredNinetyNineOutputShouldBeCMXCIX(){
		assertEquals("CMXCIX", romanNumeral.convertFromIntToRomanNumeral("999")
				.toString());
	}
	@Test
	public void whenGivenThreeThousdandSixHundredNinetyNineOutputShouldBeMMMDCXCIX(){
		assertEquals("MMMDCXCIX", romanNumeral.convertFromIntToRomanNumeral("3699")
				.toString());
	}
}
