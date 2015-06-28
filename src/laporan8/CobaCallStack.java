package laporan8;

public class CobaCallStack {
	
	public void metodePertama() {
		int c[] = new int[3];
		System.out.println("Akses elemen keempat : " + c[4]);
		
		System.out.println("Tidak tercetak!!");
	}
	
	public void metodeKedua() {
		try {
			metodePertama();
			System.out.println("Tidak tercetak!!!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException terjadi");
		}
		System.out.println("Setelah eksepsi");
	}

	public static void main(String[] args) {
		new CobaCallStack().metodeKedua();
	}

}
