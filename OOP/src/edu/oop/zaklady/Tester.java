package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Ziak z1;
		//inicializacia objektu v pamati
		z1 = new Ziak();
		//System.out.println(z1);
		
		Ziak z2 = new Ziak();
		
		z1.meno = "Fero";
		z1.priezvisko = "Mrkva";
		z1.trieda = "1.A";
		
		System.out.println("Priezvisko z1: " + z1.priezvisko);
		
		z1.celeMeno();
		z2.celeMeno();
		z1.info();
		z2.info();
		
		z2.meno = "Jan";
		z2.priezvisko = "Hrasko";
		z2.trieda = "2.B";
		z2.info();
		
		Ziak z3 = new Ziak();
		z3.info();
		
		Ziak z4 = new Ziak("Ivan", "Hrozny", "3.F");
		z4.info();
		
		
	}
}
