
public class Cykly2 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i < 11) {
			System.out.print(i + ", ");
			i++;
		}
		
		System.out.println("\n--------");
		
		i = 10;
		do {
			System.out.print(i + ", ");
			i--;
		}while(i > 0);
		
		System.out.println("\n--------");
		
		i = 0;
		while(true) {
			if(i == 10) {
				i += 2;
				continue;
			}
			System.out.print(i + ", ");
			i += 2;
			if(i > 20) {
				break;
			}
		}
		System.out.println("\nProgram pokracuje dalej ...");
	}

}
