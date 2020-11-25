import java.util.Scanner;

public class U_aritmetickyPriemer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Program na vypocet aritmetickeho priemeru ----");
		System.out.println("Zadaj pocet cisel: ");
		int pocet = sc.nextInt();
		double cislo = 0, suma = 0;
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo: ");
			cislo = sc.nextDouble();
			suma += cislo;
		}
		
		System.out.println("Aritmeticky priemer: " + (suma / pocet));

	}

}
