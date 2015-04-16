package main;

public class RomanNumeralConverter {

	public String convertFromIntToRomanNumeral(int inputNumber) {
		if (inputNumber == 1)
			return "I";
		if (inputNumber == 5)
			return "V";
		
		return null;
	}

}
