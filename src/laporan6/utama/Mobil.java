package laporan6.utama;

import laporan6.Rangka;;

public class Mobil {
	private Rangka Rangka;
	private laporan6.Mesin Mesin;
	
	public Mobil(){
		Rangka = new Rangka();
		Mesin = new laporan6.Mesin();
		
	}
	public static void main(String[] args) {
		new Mobil();
	}
}
