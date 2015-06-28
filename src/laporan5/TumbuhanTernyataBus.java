package laporan5;

public class TumbuhanTernyataBus {
	
	public void jalan() {
		System.out.println("Jalan 1");
	}
	
	public void jalan(String nama) {
		System.out.println("Jalan 2");
	}
	
	public void jalan(int jumlah) {
		System.out.println("Jalan 3");
	}
	
	public void jalan(long jumlah) {
		System.out.println("Jalan 4");
	}
	
	public String jalan(String nama, int jumlah) {
		return "jalan 5";
	}

	public static void main(String[] args) {
		TumbuhanTernyataBus Bus = new TumbuhanTernyataBus();
		Bus.jalan();
		Bus.jalan("Hino");
		Bus.jalan(11);
		Bus.jalan(7l);
		System.out.println(Bus.jalan("Hino", 11));
	}
}
