package main;

public class NumberToRomanConverter {

	private static StringBuilder answer;
	
	public static StringBuilder convertFromIntegerToRomanNumeral(String inputNumber) {
		answer= new StringBuilder();
		int inputLength = inputNumber.length();
		
		char[] inputCharacters =convertStringInputToCharArray(inputNumber, inputLength);
		
		thousandsConverter(inputCharacters[inputLength-4]);
		hundredconverter(inputCharacters[inputLength-3]);
		tensconverter(inputCharacters[inputLength-2]);
		onesConverter(inputCharacters[inputLength-1]);
		
		return answer;

	}

	private static char[] convertStringInputToCharArray(String inputNumber, int inputLength) {
		
		char[] inputCharacters = new char[inputLength];
		inputCharacters = inputNumber.toCharArray();
		
		return inputCharacters;
	}
	
	private static void thousandsConverter(char thousandsNumber) {
		switch (thousandsNumber) {

		case '1':
			answer.append("M");
			break;
		case '2':
			answer.append("MM");
			break;
		case '3':
			answer.append("MMM");
			break;
			// Stops at 3999 due to change in notation above 4000.
		}

	}

	private static void onesConverter(char onesNumber) {
		switch (onesNumber) {

		case '3':
			answer.append("III");
			break;
		case '2':
			answer.append("II");
			break;
		case '1':
			answer.append("I");
			break;
		case '4':
			answer.append("IV");
			break;
		case '5':
			answer.append("V");
			break;
		case '6':
			answer.append("VI");
			break;
		case '7':
			answer.append("VII");
			break;
		case '8':
			answer.append("VIII");
			break;
		case '9':
			answer.append("IX");
			break;

		}

	}

	private static void tensconverter(char tensNumber) {
		switch (tensNumber) {

		case '9':
			answer.append("XC");
			break;

		case '8':
			answer.append("LXXX");
			break;

		case '7':
			answer.append("LXX");
			break;

		case '6':
			answer.append("LX");
			break;

		case '5':
			answer.append("L");
			break;

		case '4':
			answer.append("XL");
			break;

		case '3':
			answer.append("XXX");
			break;

		case '2':
			answer.append("XX");
			break;

		case '1':
			answer.append("X");
			break;
		}
	}

	private static void hundredconverter(char hundredsNumber) {
		switch (hundredsNumber) {
		case '9':
			answer.append("CM");
			break;

		case '8':
			answer.append("DCCC");
			break;

		case '7':
			answer.append("DCC");
			break;

		case '6':
			answer.append("DC");
			break;

		case '5':
			answer.append("D");
			break;

		case '4':
			answer.append("CD");
			break;

		case '3':
			answer.append("CCC");
			break;

		case '2':
			answer.append("CC");
			break;

		case '1':
			answer.append("C");
			break;

		}
	}
}
