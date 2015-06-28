package laporan7;

import laporan7.Bentuk;
import laporan7.SegitigaSamaKaki;
import laporan7.SegitigaSamaSisi;
import laporan7.BujurSangkar;

public class CobaBentuk {
	public static void cetakBangun(Bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[] args) {
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}
}
