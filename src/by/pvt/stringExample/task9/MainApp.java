package by.pvt.stringExample.task9;

public class MainApp {

	public static void main(String[] args) {
		MainApp ma = new MainApp();
		String sentense = "i -love ...love,! to eat() i do i ";
		System.out.println(sentense);
		ma.counter(sentense);
	}

	public void counter(String sentense) {
		String newSentense = replaseMarks(sentense);
		newSentense = toLowerCaseS(newSentense);
		String[] words = splitSentense(newSentense);
		countWordsFrequency(words);
	}

	private String[] splitSentense(String sentense) {
		String[] words = sentense.split(" ");
		return words;
	}

	private String replaseMarks(String sentense) {
		return sentense.replaceAll("[-.?!)(,:]", "");
	}

	private void countWordsFrequency(String[] words) {
		int count = 1;
		for (int j = 0; j < words.length; j++) {
			for (int i = j + 1; i < words.length; i++) {
				if (words[j] != null && words[i] != null) {
					if (words[j].equals(words[i])) {
						words[i] = null;
						count++;
					}
				}
			}
			if (words[j] != null) {
				System.out.println(words[j] + " - " + count);
			}
			count = 1;
		}
	}

	private String toLowerCaseS(String sentense) {
		return sentense.toLowerCase();
	}
}
