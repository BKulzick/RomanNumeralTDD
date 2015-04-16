package main;

public class RomanNumeralConverter {

	public StringBuilder convertFromIntToRomanNumeral(int inputNumber) {
		StringBuilder answer = new StringBuilder();
		if (inputNumber < 4){
			for (int i = 1; i <= inputNumber; i++) {
				answer.append("I");
			} 
			return answer;
		}	
		else if (inputNumber == 5)
			return answer.append("V");
		else if (inputNumber == 10)
			return answer.append("X");
		
		
		return null;
	}

}
