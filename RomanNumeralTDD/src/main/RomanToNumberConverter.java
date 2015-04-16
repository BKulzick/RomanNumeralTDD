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
			}

		}

		for (int i = 0; i < inputCharacters.length; i++) {

			if (inputAsIntegers[i] < inputAsIntegers[i + 1])
				answer -= inputAsIntegers[i];
			else if (inputAsIntegers[i] == inputAsIntegers[i + 1])
				answer += inputAsIntegers[i];
			else if (inputAsIntegers[i] > inputAsIntegers[i + 1]) {
				answer += inputAsIntegers[i];
			}
		}

		return answer;
	}

}
