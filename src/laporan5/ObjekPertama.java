package laporan5;

public class ObjekPertama {
	
	public String namaProduk;
	public String pabrikan;
	public int panjang;
	public float berat;
	
	public void cetak() {
		System.out.println(namaProduk + "," + pabrikan + "," + 
		panjang + "," + berat);
	}

	public static void main(String[] args) {
		 ObjekPertama Mobil = new ObjekPertama();
		 ObjekPertama MobilDua = new ObjekPertama();
		 
		 ObjekKedua Motor = new ObjekKedua();
		 ObjekKedua MotorDua = new ObjekKedua();
		 
		 if (Mobil instanceof ObjekPertama) {
			 System.out.println("Mobil adalah instance dari kelas " 
		 + "ObjekPertama"); 
			 
			 Mobil.namaProduk = "Nissan Skyline GT-R";
			 Mobil.pabrikan = "Jepang";
			 Mobil.panjang = 2000;
			 Mobil.berat = 1034.5f;
			 Mobil.cetak();
		 }
		  
		 if (MobilDua instanceof ObjekPertama) {
			 System.out.println("\nMobilDua adalah instance dari kelas " 
		 + "ObjekPertama");
			
			 MobilDua.namaProduk = "Ford Mustang GT";
			 MobilDua.pabrikan = "Amerika";
			 MobilDua.panjang = 1800;
			 MobilDua.berat = 1500.25f;
			 MobilDua.cetak();
		 }
		 
		 if (Motor instanceof ObjekKedua) {
			 System.out.println("\nMotor adalah instance dari kelas" 
		+ "ObjekKedua");
			 
			 Motor.nama = "Honda Blade";
			 ObjekKedua.tambahMotor();
			 System.out.println(ObjekKedua.JUMLAH_MOTOR);
			 System.out.println(Motor.JUMLAH_MOTOR);
		 }
		 
		 if (MotorDua instanceof ObjekKedua) {
			 System.out.println("\nMotorDua adalah instance dari kelas" 
		+ "ObjekKedua");
			 
			 MotorDua.nama = "Yamaha JupiterZ1";
			 ObjekKedua.tambahMotor();
			 System.out.println(ObjekKedua.JUMLAH_MOTOR);
			 System.out.println(MotorDua.JUMLAH_MOTOR);
		 }
		 
	}

}

class ObjekKedua {
	public static int JUMLAH_MOTOR = 0;
	public String nama;
	
	public static void tambahMotor() {
		JUMLAH_MOTOR++;
	}
}