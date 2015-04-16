package main;

public class RomanNumeralConverter {

	public StringBuilder convertFromIntToRomanNumeral(int inputNumber) {
		StringBuilder answer = new StringBuilder();

		switch (inputNumber) {

		case 3:
			answer.append("I");
		case 2:
			answer.append("I");
		case 1:
			answer.append("I");
			break;
		case 4:
			answer.append("IV");
			break;
		case 5:
			answer.append("V");
			break;
		case 6:
			answer.append("VI");
			break;
		case 7:
			answer.append("VII");
			break;
		case 8:
			answer.append("VIII");
			break;
		case 9:
			answer.append("IX");
			break;
		
		case 10:
			answer.append("X");
			break;
		}
			
		return answer;

	}
}
