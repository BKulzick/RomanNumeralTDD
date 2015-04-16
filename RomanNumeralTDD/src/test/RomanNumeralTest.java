package test;

import static org.junit.Assert.*;
import main.RomanNumeralConverter;

import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void whenGivenOneOutputShouldBeI() {
		RomanNumeralConverter romanNumeral = new RomanNumeralConverter();
		assertEquals("I", romanNumeral.convertFromIntToRomanNumeral(1));
	}

}
