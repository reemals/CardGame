import java.util.Scanner;

public class CardTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Card a = new Card();
		a.shuffle();
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println(name + ", choose a card in your mind and remember it.");
		System.out.println(a.toString());
		
		System.out.println("Hit enter to start");
		String ne = input.nextLine();
		
		System.out.println("1.Which column?");
		a.cardS(input.nextInt());
		System.out.println(a.toString());
		
		System.out.println("2.Which column?");
		a.cardS(input.nextInt());
		System.out.println(a.toString());
		
		System.out.println("3.Which column?");
		System.out.println(a.getAn(input.nextInt()));
	}

}
