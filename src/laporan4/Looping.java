package laporan4;

public class Looping {

	public static void main(String[] args) {
		int nilai = 1;
		char mainkanloop;
		mainkanloop = 'A';
		
		if (mainkanloop == 'W') {
			while (nilai < 20) {
				System.out.println("Loop While: " + nilai);
				nilai ++;}
		} else if (mainkanloop == 'D') {
			do {
				System.out.println("Loop DoWhile: " + nilai);
				nilai++;
			} while (nilai <= 20);
		} else if (mainkanloop == 'F') {
			for (nilai = 1; nilai < 20; nilai++) {
				System.out.println("Loop for 1 : " + nilai);
			}
			for (int nilai2 = 1; nilai2 >= -5; nilai2--) {
				System.out.println("Loop for 2: " + nilai2);
			}
			for (int nilai3 = 12,nilai4 = 2; nilai3 >= -5 & nilai4 <= 12; nilai3--,nilai4++) {
				System.out.println("Loop for 3 : " + nilai3 + " " + nilai4);
			}
		} else {
			int[] prima = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29};
			for (int item : prima) {
				System.out.println("Bilangan Prima : " + item);
			}
		}
	}
	
}
