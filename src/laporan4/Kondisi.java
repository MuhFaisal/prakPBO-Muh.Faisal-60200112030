package laporan4;

public class Kondisi {

	public static void main(String[] args) {
		int a = 10;
		int b = 45;
		int c = 60;
		char nlhuruf;
		
		if (a > 50) {
			nlhuruf = 'A';
			System.out.println("");
		} else if ((a <= 50 && a >=0)) {
			nlhuruf = 'B';
			System.out.println("-");
		} else if (a == 0) {
			int hasil;
			boolean kondisi = true;
			hasil = kondisi ? b : c;
			
			System.out.println(hasil);
		} else {
			int hari = 1;
			switch (hari) {
			case 1: System.out.println("Senin"); break;
			case 2: System.out.println("Selasa"); break;
			case 3: System.out.println("Rabu"); break;
			case 4: System.out.println("Kamis"); break;
			case 5: System.out.println("Jum'at"); break;
			case 6: System.out.println("Sabtu"); break;
			case 7: System.out.println("Minggu"); break;
			default: System.out.println("Input salah"); break;
			}
		}

	}

}
