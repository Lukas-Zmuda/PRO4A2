import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner vstup;
		
		vstup = new Scanner(System.in);
		
		String meno = "";
		System.out.println("Zadaj meno: ");
		
		meno = vstup.nextLine();
		System.out.println("Ahoj " + meno + "!");
		
		System.out.println("Zadaj rok narodenia: ");
		
		int rok = 0;
		rok = vstup.nextInt();
		System.out.println("Mas " + (2020 - rok) + " rokov.");
		
		double d = vstup.nextDouble();
		System.out.println(d);

	}

}
