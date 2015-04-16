package test;

import static org.junit.Assert.*;
import main.RomanNumeralConverter;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {

	RomanNumeralConverter romanNumeral;
	@Before
	
	public void setUp(){
		romanNumeral= new RomanNumeralConverter();
	}
	
	@Test
	public void whenGivenOneOutputShouldBeI() {
		assertEquals("I", (romanNumeral.convertFromIntToRomanNumeral(1)).toString());
	}
	
	@Test
	public void whenGivenFiveOutputShouldBeV() {
		assertEquals("V", romanNumeral.convertFromIntToRomanNumeral(5).toString());
	}
	
	@Test
	public void whenGivenTenOutputShouldBeX() {
		assertEquals("X", romanNumeral.convertFromIntToRomanNumeral(10).toString());
	
	}
	@Test
	public void whenGivenTwoOutputShouldBeII() {
		assertEquals("II", romanNumeral.convertFromIntToRomanNumeral(2).toString());
	
	}
	
}
