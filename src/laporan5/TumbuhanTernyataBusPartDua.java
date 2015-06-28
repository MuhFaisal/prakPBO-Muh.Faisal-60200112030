package laporan5;

public class TumbuhanTernyataBusPartDua {
	
	private String namaBus;
	private int panjangBus;
	
	private TumbuhanTernyataBusPartDua() {
		namaBus = "Hino";
		panjangBus = 5;
	}
	
	private TumbuhanTernyataBusPartDua(String nama, int panjang) {
		namaBus = nama;
		panjangBus = panjang;
	}
	
	public void cetakBus() {
		System.out.println(namaBus + " " + panjangBus);
	}

	public static void main(String[] args) {
		TumbuhanTernyataBusPartDua Bus = new TumbuhanTernyataBusPartDua();
		Bus.cetakBus();
		Bus = new TumbuhanTernyataBusPartDua();
		Bus.cetakBus();
	}

}
