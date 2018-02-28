package by.pvt.stringExample.task7;

public class MainApp {

	public static void main(String[] args) {
		MainApp ma = new MainApp();
		String sentense = "i1 love.---, to3876 danse!";
		System.out.println(sentense);
		String test = ma.replaseMarks(sentense);
		System.out.println(test);

	}

	public String replaseMarks(String sentense) {
		return sentense.replaceAll("[-.?!)(,:]", "").replaceAll("[0123456789]", "");
	}
}
