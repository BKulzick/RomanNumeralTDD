package main;

public class RomanNumeralConverter {

	public StringBuilder convertFromIntToRomanNumeral(String inputNumber) {
		StringBuilder answer = new StringBuilder();
		int inputLength = inputNumber.length();
		char[] inputCharacters = new char[inputLength];
		inputCharacters=inputNumber.toCharArray();
		char tensNumber = '0';
		char onesNumber = '0';
		if (inputLength > 1){
			tensNumber = inputCharacters[inputLength-2];
			onesNumber = inputCharacters[inputLength-1];
		}else{
			onesNumber = inputCharacters[0];
		}
	

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

		return answer;

	}
}
