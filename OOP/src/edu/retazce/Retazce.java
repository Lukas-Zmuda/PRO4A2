package edu.retazce;

public class Retazce {

	public static void main(String[] args) {

		int a = 12;
		
		String meno = "    Lukas";
		String meno2 = new String("LUKAS");
		
		String meno3 = "Lukas";
		String meno4 = new String("Lukas");
		
		System.out.println(meno == meno3);
		System.out.println(meno2 == meno4);
		
		System.out.println("Porovnanie cez ==: " + (meno == meno2));
		
		System.out.println("Porovnanie cez equals: " + meno.equals(meno2));
		
		System.out.println("Pocet znakov meno: " + meno.length());
		System.out.println(meno2);
		System.out.println("-----");
		System.out.println(meno.equalsIgnoreCase(meno2));
		System.out.println(meno.equals(meno2));
		
		System.out.println("Meno zacina na pismeno: " + meno.charAt(0));
		System.out.println("Meno konci na pismeno: " + meno.charAt(meno.length() - 1));
		
		System.out.println(meno.substring(2));
		System.out.println(meno.substring(1, 4));
		System.out.println(meno);
		
		System.out.println(meno.indexOf('k'));
		
		String celeMeno = "Lukas Zmuda";
		System.out.println("Priezvisko: " + celeMeno.substring(celeMeno.indexOf(' ') + 1));
		
		String menaZiaci = "Adrian,Benjamin,Peter,Jakub,Michal,Tomas,Eduard";
		String[] ziaciPole = menaZiaci.split(",");
		for(String m: ziaciPole) {
			System.out.println(m);
		}
		System.out.println("-------");
		
		for(int i = ziaciPole.length - 1; i >= 0; i--) {
			System.out.println(ziaciPole[i]);
		}
		
		System.out.println(celeMeno.replace('a', '@'));
		System.out.println(celeMeno);
		
		System.out.println(celeMeno.toUpperCase());
		System.out.println(celeMeno.toLowerCase());
		
		System.out.println(meno.equalsIgnoreCase(meno2));
		System.out.println(meno.trim());
		
		System.out.println(meno.trim().equalsIgnoreCase(meno2));
		

	}

}
