
public class Metody {

	public static void main(String[] args) {
		//volanie metody
		vlozCiaru();			
		System.out.println("ahoj");
		vlozCiaru();
		
		vlozCiaru(3);
		
		vlozCiaru("+", 20);
		
		System.out.println("Druha mocnina z 8 je " + druhaMocnina(8));
		int x = druhaMocnina(23);
		String[] mena = {"Peter", "Ivana", "Tomas", "Lukas", "Jan", "Maria", "Martin"};
		String[] priezviska = vytvorPole(7, "nezname");
		
		vypisPole(mena);
		int[] vyska = {168, 172, 188, 190, 185, 166, 187};
		
		vypisPole(vyska);
		
		int[] poleCisla = vytvorPole(12, 10);
		vypisPole(poleCisla);
		
		vypisPole(priezviska);
		
	}
	
	//metoda bez navratovej hodnoty
	static void vlozCiaru() {
		System.out.println("----------");
	}
	
	//metoda bez navratovej hodnoty s jednym parametrom
	static void vlozCiaru(int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	//metoda bez navratovej hodnoty s dvoma parametrami
	static void vlozCiaru(String znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vypisPole(String[] pole) {
		for(String prvok: pole) {
			System.out.print(prvok + ", ");
		}
		System.out.println();
	}
	
	static void vypisPole(int[] pole) {
		for(int prvok: pole) {
			System.out.print(prvok + ", ");
		}
		System.out.println();
	}
	
	//metoda s navratovou hodnotou
	static int druhaMocnina(int zaklad) {
		int vysledok = 0;
		vysledok = zaklad * zaklad;
		return vysledok;
	}
	
	static int[] vytvorPole(int pocetPrvkov, int defaultHodnota) {
		int[] pole = new int[pocetPrvkov];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = defaultHodnota;
		}
		
		return pole;
	}
	
	static String[] vytvorPole(int pocetPrvkov, String defaultHodnota) {
		String[] pole = new String[pocetPrvkov];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = defaultHodnota;
		}
		
		return pole;
	}

}
