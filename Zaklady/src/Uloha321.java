import java.util.Scanner;

public class Uloha321 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int rok = 0, den = 0, mesiac = 0;
		
		//TODO osetrit vstup - zaporne cislo
		System.out.println("Zadaj rok: ");
		rok = sc.nextInt();
		
		//TODO osetrit vstup - zaporne cislo, januar = 13, februar = 14
		System.out.println("Zadaj mesiac: ");
		mesiac = sc.nextInt();
		
		double vypocet = (26 * (mesiac + 1)) / 10.0;
		System.out.println((int)vypocet);

	}

}
