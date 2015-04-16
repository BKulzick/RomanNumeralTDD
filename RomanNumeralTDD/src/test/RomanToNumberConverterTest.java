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
}
