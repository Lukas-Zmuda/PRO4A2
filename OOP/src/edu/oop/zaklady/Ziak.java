package edu.oop.zaklady;

class Ziak {
	
	//instancne premenne
	String meno;
	String priezvisko;
	String trieda;
	
	//konstruktory
	Ziak(){
		meno = "nezname";
		priezvisko = "nezname";
		trieda = "nepriradena";
	}
	
	Ziak(String m, String p, String t){
		meno = m;
		priezvisko = p;
		trieda = t;
	}
	
	//metody (schopnosti objektu)
	void celeMeno() {
		System.out.println(meno + " " + priezvisko);
	}
	
	void info() {
		System.out.print("Meno a priezvisko: ");
		celeMeno();
		System.out.println("Trieda: " + trieda);
	}
	
	void zmenTriedu(String novaTrieda) {
		trieda = novaTrieda;
	}
}
