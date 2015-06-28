package laporan8;

public class CobaFinally {

	public static void metodeCoba1() {
		int d[] = new int[8];
		try {
			System.out.println("Akses elemen kesepuluh : " + d[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException terjadi");
		} finally {
			d[0] = 1;
			System.out.println("Nilai elemen pertama : " + d[0]);
		}
	}
	
	public static void main(String[] args) {
		metodeCoba1();

	}

}
