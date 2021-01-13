import java.util.Scanner;

public class U_aritmetickyPriemer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//neznamy pocet cisel, nacitavanie je ukoncene ak uzivatel zada 0
		System.out.println("---- Program na vypocet aritmetickeho priemeru ----");
		int pocet = 0;
		double cislo = -1, suma = 0;
		while(cislo != 0) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextDouble();
			if(cislo != 0) {
				pocet++;
			}
			suma += cislo;
		}		
		System.out.println("Aritmeticky priemer: " + (suma / pocet));
	}
}