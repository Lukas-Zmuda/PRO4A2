
public class Pole {

	public static void main(String[] args) {

		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[7];
		
		cisla[0] = 123;
		cisla[1] = cisla[0] + 10;
		cisla[2] = cisla[0] + cisla[1];
		
		System.out.println("3. prvok pola cisla ma hodnotu " + cisla[2]);
		
		for(int i = 0 ; i < 7; i++) {
			System.out.print(cisla[i] + ", ");
		}
		
		String[] mena = {"Peter", "Ivana", "Tomas", "Lukas", "Jan", "Maria", "Martin"};
		int[] vyska = {168, 172, 188, 190, 185, 166, 187};
		
		System.out.println("\nZoznam mien + vyska: ");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i] + ": " + vyska[i] + " cm");
		}
		
		System.out.println("Pocet ludi v zozname: " + mena.length);
		
		for(String m: mena) {
			System.out.print(m + ", ");
		}
		

	}

}
