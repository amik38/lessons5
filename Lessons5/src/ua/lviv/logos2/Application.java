package ua.lviv.logos2;

public class Application {
	public static void main(String[] args) {
		String ansver = (int)(Math.random() * 10) % 2 == 0 ? "Orel" : "Reshka";
		System.out.println(ansver);
	}
}

