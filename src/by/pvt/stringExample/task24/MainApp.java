package by.pvt.stringExample.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {

	public static void main(String[] args) {
		String sentense = "i ate 121 apples, 4 bannanas";
		MainApp ma = new MainApp();
		ma.countNumbersInSentense(sentense);

	}

	public void countNumbersInSentense(String sentense) {
		String newSentense = replaseMarks(sentense);
		newSentense = toLowerCaseS(newSentense);
		String[] words = splitSentense(newSentense);
		countNumbers(words);
	}

	private String replaseMarks(String sentense) {
		return sentense.replaceAll("[-.?!)(,:]", "");
	}

	private String[] splitSentense(String sentense) {
		String[] words = sentense.split(" ");
		return words;
	}

	private String toLowerCaseS(String sentense) {
		return sentense.toLowerCase();
	}

	private void countNumbers(String[] words) {
		int sum = 0;
		Pattern p = Pattern.compile("\\d+");
		for (String word : words) {
			Matcher m = p.matcher(word);
			if (m.find()) {
				int number = Integer.parseInt(word);
				sum += number;
			}
		}
		System.out.println(sum);
	}
}
