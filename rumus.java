import java.util.Scanner;

public class rumus {
	static int pilihanMenu;
	static String ulangMenu;
	static main m = new main();
	static Scanner input = new Scanner(System.in);


	public static void GLB(){
		float kecepatan, waktu, jarak;
		clear();
		System.out.println("=====================================");
		System.out.println("Gerak Lurus Beraturan");
		System.out.println("GLB (Gerak Lurus Beraturan) merupakan gerak dengan kecepatan konstan atau dapat dikatakan juga gerak tanpa adanya percepatan");
		System.out.println("=====================================");
		System.out.println("1. Mencari kelajuan (m/s)");
		System.out.println("2. Mencari waktu (s)");
		System.out.println("3. Mencari jarak (m)");
		System.out.println("0. Exit");
		System.out.println("=====================================");

		do{
			while(true){
				System.out.print("Pilih : ");

				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();
			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari kelajuan");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan jarak : ");

					if(input.hasNextFloat()){
						jarak = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");

					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(jarak*waktu)+"m/s");
			}
			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari waktu");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kelajuan : ");

					if(input.hasNextFloat()){
						kecepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan jarak : ");

					if(input.hasNextFloat()){
						jarak = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan/jarak)+"s");
			}
			else if(pilihanMenu==3){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari jarak");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kelajuan : ");

					if(input.hasNextFloat()){
						kecepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");

					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan/waktu)+"m");
			}
			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}
		}while(pilihanMenu==0);

		System.out.print("Ulangi perhitungan (Y/T) : ");
		while(true){
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				GLB();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main.main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void GLBB(){
		float kecepatan_awal, percepatan, waktu;
		clear();

		System.out.println("=====================================");
		System.out.println("GLBB");
		System.out.println("Gerak Lurus Berubah Beraturan");
		System.out.println("GLBB (Gerak Lurus Berubah Beraturan) merupakan gerak dengan percepatan konstan atau dapat dikatakan juga gerak dengan kecepatan yang berubah terhadap waktu tertentu");
		System.out.println("=====================================");
		System.out.println("1. Mencari kecepatan akhir (m/s)");
		System.out.println("2. Mencari jarak (m)");
		System.out.println("0. Exit");
		System.out.println("=====================================");

		do{
			while(true){
				System.out.print("Pilih : ");

				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();
			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari kecepatan akhir :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan awal : ");

					if(input.hasNextFloat()){
						kecepatan_awal = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan percepatan : ");

					if(input.hasNextFloat()){
						percepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");

					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan_awal+(percepatan*waktu))+"m/s");
			}

			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari jarak :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan awal : ");

					if(input.hasNextFloat()){
						kecepatan_awal = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");

					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan percepatan : ");

					if(input.hasNextFloat()){
						percepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+((kecepatan_awal*waktu)+(1/2*percepatan*waktu*waktu))+"m");
			}

			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}

		}while(pilihanMenu==0);

		System.out.print("Ulangi perhitungan (Y/T) : ");
		while(true){
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				GLBB();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main.main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void ARCHIMEDES(){
		clear();
		System.out.println("=====================================");
		System.out.println("GAYA ARCHIMEDES");
		System.out.println("Hukum Archimedes adalah hukum yang menyatakan bahwa setiap benda yang sebagian atau seluruhnya terendam dalam zat cair, atau sebagian zat cair, mempunyai gaya dorong ke atas pada benda tersebut, atau yang sering disebut gaya apung");
		System.out.println("=====================================");
		System.out.println("*Rumus : Massa * Gravitasi * Volume");
		System.out.println("=====================================");

		System.out.print("MASUKAN Massa(kg/m) : ");
		float pf = input.nextFloat();
		System.out.print("MASUKAN Gravitasi(N/kg) : ");
		int g = input.nextInt();
		System.out.print("MASUKAN Volume Benda Tercelup(m):");
		int Vf = input.nextInt();
		System.out.println(" HASILNYA ADALAH = " + pf*g*Vf);

		System.out.print("Ulangi perhitungan (Y/T) : ");
		while(true){
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				ARCHIMEDES();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main.main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}
	public static void PERIODEGETARAN(){
		float waktu;
		int jumlah;

		clear();
		System.out.println("=====================================");
		System.out.println("PERIODE GETARAN");
		System.out.println("periode getaran adalah waktu yang diperlukan suatu benda untuk melakukan satu kali getaran");
		System.out.println("=====================================");
		System.out.println("*Rumus : Waktu / Getaran");
		System.out.println("=====================================");

		System.out.print("MASUKAN WAKTU GETARAN (s): ");
		waktu = input.nextFloat();
		System.out.print("MASUKAN JUMLAH GETARAN: ");
		jumlah = input.nextInt();
		System.out.println("HASILNYA ADALAH ="+waktu/jumlah);

		System.out.print("Ulangi perhitungan (Y/T) : ");
		while(true){
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				PERIODEGETARAN();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main.main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}
	public static void KIRCHOFF(){

	}
	public static void HUKUMOHM(){
		float V, I;
		clear();
		System.out.println("=====================================");
		System.out.println("Hukum OHM");
		System.out.println("Hukum OHM adalah suatu pernyataan bahwa besar tegangan listrik pada sebuah penghantar berbanding lurus dengan arus listrik yang mengaliri penghantar");
		System.out.println("=====================================");
		System.out.println("*Rumus HUKUM OHM Adalah : R=V/I");
		System.out.println("Mencari Hambatan Listrik (R). Dengan Memasukan Beda Potensial (V) dan Kuat Arus Listrik (I)");
		System.out.println("=====================================");
		System.out.print("Masukan Beda Potensial[ V ] = ");
		V = input.nextFloat();
		System.out.print("Masukan  Arus Listrik [ I ] = ");
		I = input.nextFloat();
		double R=0;
		R = V/I;
		System.out.println("Diketahui : ");
		System.out.println("Beda Potensial [V] Adalah "+V);
		System.out.println("Kuat Arus Listrik [I] Adalah "+I);
		System.out.println("Maka, R = V/I Adalah "+R);
		System.out.println("-------------------------------------------------------------------------------------------");

		System.out.print("Ada Sebuah Studi Kasus.. "
		+ "\nJika Anda Mau Menghitung Tekan [1] atau Tekan [2] Untuk Ke Menu Sebelumnya : ");

		int pilihmenu = input.nextInt();
		if (pilihmenu == 1) {
			System.out.println("[ Study Kasus (1) ]");
			System.out.println("-------------------");
			System.out.println("Mencari, Hambatan Listrik (R) dengan Beda Potensial 12 Volt dan Kuat Arus Listrik 2 A. Berapa Hambatan Listrik yan didapat");
			System.out.print("Masukan [ V ] = ");
			float V1 = input.nextFloat();
			System.out.print("Masukan [ I ] = ");
			float I1 = input.nextFloat();
			double R1 = 0;
			R1 = (V1/I1);
			System.out.println("Maka, Hambatan Listrik yang diperoleh adalah "+R1);
			System.out.println("-------------------------------------------------");
		}
		else if (pilihmenu==2) {
			System.out.println("Silahkan Pilih Menu Yang Lain.. Terima Kasih");
			System.out.println("-------------------------------------------------------------------------------------------");
		}
	}
	public static void clear(){
		System.out.print("\033[2J\033[1;1H");
	}

	public static void exit(){
		System.exit(0);
	}

}