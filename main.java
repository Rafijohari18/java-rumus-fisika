import java.util.Scanner;

public class main {
	static int pilihanMenu;
	static String ulangMenu;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		rumus.clear();
		System.out.println("==========================");
		System.out.println("1. GLB");
		System.out.println("2. GLBB");
		System.out.println("3. ARCHIMEDES");
		System.out.println("4. PERIODE GETARAN");
		System.out.println("5. KIRCHOFF");
		System.out.println("6. HUKUM OHM");
		System.out.println("0. Exit");
		System.out.println("==========================");

		do {
			while(true){
				System.out.print("Pilih : ");
				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}

			switch(pilihanMenu){
				case 0:
					rumus.exit();
				break;
				case 1:
					rumus.GLB();
				break;
				case 2:
					rumus.GLBB();
				case 3:
					rumus.ARCHIMEDES();
				break;
				case 4:
					rumus.PERIODEGETARAN();
				case 5:
					rumus.KIRCHOFF();
				case 6:
					rumus.HUKUMOHM();
				default:
					System.out.println("Pilihan tidak ada");
					pilihanMenu=0;
				break;
			}
		} while(pilihanMenu==0);
	}
}