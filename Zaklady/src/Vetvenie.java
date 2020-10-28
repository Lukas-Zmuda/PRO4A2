
public class Vetvenie {

	public static void main(String[] args) {
		
		int a = 1;
		
		//neuplne vetvenie
		
		if(a > 0) {
			System.out.println("a je kladne");
		}
		
		//uplne vetvenie
		if(a % 2 == 0) {
			System.out.println("a je parne");
		}else {
			System.out.println("a je neparne");
		}
		
		int skore = 72;
//		if(skore <= 100 && skore > 90) {
//			System.out.println("Tvoja znamka je 1");
//		}
//		if(skore <= 90 && skore > 80) {
//			System.out.println("Tvoja znamka je 2");
//		}
		//.....
		
		if(skore > 90) {
			System.out.println("Tvoja znamka je 1");
		}else if(skore > 80) {
			System.out.println("Tvoja znamka je 2");
		}else if(skore > 70) {
			System.out.println("Tvoja znamka je 3");
		}else if(skore > 60) {
			System.out.println("Tvoja znamka je 4");
		}else {
			System.out.println("Tvoja znamka je 5");
		}
		
		int denVTyzdni = 4;
		switch(denVTyzdni) {
		case 1:
			System.out.println("Pondelok");
			break;
		case 2:
			System.out.println("Utorok");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("Stvrtok");
			break;
		case 5:
			System.out.println("Piatok");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Nedela");
			break;
		default:
			System.out.println("Nespravny den v tyzdni");
				
		}
		
		System.out.println("Program pokracuje dalej ...");

	}

}
