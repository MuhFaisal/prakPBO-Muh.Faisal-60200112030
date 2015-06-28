package laporan5;

public class RumusBulatan {
	
	public double PHI = 3.14;
	private double jarijari;
	
	public RumusBulatan(){
		
	}
	
	public double getjarijari() {
		return jarijari;
	}
	
	public void setjarijari(double r) {
		jarijari = r;
	}
	
	public void sethitungLuas(double r, double PHI, double hitungLuas) {
		r = 3;
		hitungLuas = PHI*r*r;
		return;
	}
	
	public void sethitungKeliling(double r, double PHI, double hitungKeliling) {
		r = 3;
		hitungKeliling = (PHI*r) + (PHI*r);
		return;
	}

	public static void main(String[] args) {

	}

}
