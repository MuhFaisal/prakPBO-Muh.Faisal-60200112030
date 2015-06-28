package laporan8;

public class CobaRuntimeException {

	public static void main(String[] args) {
		try {
			int b[] = new int [4];
			System.out.println("Akses elemen ketujuh : " + b[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException terjadi");
		}
		System.out.println("Keluar Blok Ekspresi");

	}

}
