package by.pvt.stringExample.task2;

public class MainApp {

	public static void main(String[] args) {
		String test = "In Java we trust!";
		MainApp ma = new MainApp();
		ma.printCharAndNumber(test);

	}

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public void printCharAndNumber(String sentense) {
		char[] letters = getCharArray(sentense);
		getCharArrayInfo(letters);
		getAlphabetNumber(letters);
	}

	private char[] getCharArray(String sentense) {
		sentense = sentense.toLowerCase();
		char[] words = sentense.toCharArray();
		return words;
	}

	private void getCharArrayInfo(char[] array) {
		for (char c : array) {
			if (c == ' ') {
				System.out.print("");
			} else {
				System.out.print(c + "  ");
			}
		}
		System.out.println();
	}

	private void getAlphabetNumber(char[] array) {
		for (char c : array) {
			if (c == ' ') {
				System.out.print("");
			} else {
				int i = alphabet.lastIndexOf(c);
				i += 1;
				System.out.print(i + "  ");
			}
		}
	}
}
