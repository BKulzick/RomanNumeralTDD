package main;

public class RomanToNumberConverter {

	public int convertFromRomanNumeralToInt(String romanNumeralInput) {

		int answer = 0;
		int inputLength = romanNumeralInput.length();
		char[] inputCharacters = new char[inputLength];
		int[] inputAsIntegers = new int[10];
		inputCharacters = romanNumeralInput.toCharArray();

		for (int i = 0; i < inputCharacters.length; i++) {
			switch (inputCharacters[i]) {
			case 'I':
				inputAsIntegers[i] = 1;
				break;
			case 'V':
				inputAsIntegers[i] = 5;
				break;
			case 'X':
				inputAsIntegers[i] = 10;
				break;
			case 'L':
				inputAsIntegers[i] = 50;
				break;
			case 'C':
				inputAsIntegers[i] = 100;
				break;
			case 'M':
				inputAsIntegers[i] = 1000;
				break;
			}

		}

		for (int i = 0; i < inputCharacters.length; i++) {

			if (inputAsIntegers[i] < inputAsIntegers[i + 1])
				answer -= inputAsIntegers[i];

			else if ((inputAsIntegers[i] >= inputAsIntegers[i + 1])
					&& inputAsIntegers[i] >= inputAsIntegers[i + 2]) {
				answer += inputAsIntegers[i];
			}

		}

		return answer;
	}

}
