package laporan7.Interface.extend;

import laporan7.Interface.BentukKeliling;
import laporan7.Interface.BentukLuas;

public class CobaInterface {
	public static double hitungLuasBentuk(BentukLuas b){
		return b.hitungLuas();
	}
	public static double hitungLuasKeliling(BentukKeliling b){
		return b.hitungKeliling();
	}
	public static void main(String args[]){
		BentukInterface bentuk = new Lingkaran(3.0);
		System.out.println(hitungLuasBentuk((BentukLuas) bentuk));
		System.out.println(hitungLuasKeliling((BentukKeliling) bentuk));
	}
}
