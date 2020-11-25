
public class Cykly {

	public static void main(String[] args) {
		
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + ",");
		}
		System.out.println();
		for(int i = 0; i < 21; i += 2) {
			System.out.print(i + ",");
		}
		System.out.println();
		for(int i = 1; i < 1025; i *= 2) {
			System.out.print(i + ",");
		}
		System.out.println();
		//1:10
		//2:9
		//3:8
		//...
		//10:1
		for(int i = 1, j = 10; i < 11; i++, j--) {
			System.out.println(i + ":" + j);
		}
			
		System.out.println("\nAko sa mas?");

	}

}
