package main;

public class RomanNumeralConverter {

	public StringBuilder convertFromIntToRomanNumeral(int inputNumber) {
		StringBuilder answer = new StringBuilder();
		if (inputNumber < 4) {
			for (int i = 1; i <= inputNumber; i++) {
				answer.append("I");
			}
		}else if (inputNumber == 4){
			answer.append("IV");
		}else if (inputNumber == 5){
			 answer.append("V");
		}else if (inputNumber == 10){
			answer.append("X");
		}
		return answer;
	

}
	}
