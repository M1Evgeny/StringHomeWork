package by.pvt.stringExample.task1;

public class MainApp {

	public static void main(String[] args) {
		MainApp mp = new MainApp();
		String sentense = "In Java we trust! In Java we trust! In Java we trust!";
		System.out.println(sentense);
		String test = mp.changeCharInSentense(sentense, 1, 's');
		System.out.println(test);
	}

	public String changeCharInSentense(String sentense, int offSet, char newChar) {
		String[] words = splitSentense(sentense);
		String[] newWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			newWords[i] = changeChar(words[i], offSet, newChar);
		}
		String newSentense = createSentense(newWords);
		return newSentense;
	}

	private String[] splitSentense(String sentense) {
		String[] words = sentense.split(" ");
		return words;
	}

	public String changeChar(String word, int offSet, char newChar) {
		String newWord = word;
		if (offSet > 0 && offSet <= word.length()) {
			StringBuilder sb = new StringBuilder(word);
			sb.setCharAt(offSet, newChar);
			newWord = sb.toString();
		}
		return newWord;
	}

	private String createSentense(String[] words) {
		StringBuilder sb = new StringBuilder();
		String newSentense = null;
		for (String word : words) {
			sb.append(word);
			sb.append(" ");
		}
		newSentense = sb.toString();
		return newSentense;
	}

}
