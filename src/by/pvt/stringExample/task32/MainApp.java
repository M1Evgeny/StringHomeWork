package by.pvt.stringExample.task32;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {

	public static void main(String[] args) {
		String sentense = "I do not I do not i do not ";
		String word = "i";
		System.out.println(sentense + " " + word);
		MainApp ma = new MainApp();
		ma.countWordFrequencyInSentense(sentense, word);

	}

	public void countWordFrequencyInSentense(String sentense, String word) {
		String newSentense = replaseMarks(sentense);
		newSentense = toLowerCaseS(newSentense);
		String[] words = splitSentense(newSentense);
		countWordFrequency(words, word);
	}

	private void countWordFrequency(String[] words, String word) {
		Pattern p = Pattern.compile(word);
		int count = 0;
		for (String s : words) {
			Matcher m = p.matcher(s);
			while (m.find()) {
				count++;
			}
		}
		System.out.println(word + " " + count);
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
}
