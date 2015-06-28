package laporan7;

public class BujurSangkar extends Bentuk {

	private float sisi;
	public void BujurSangkar(){
		sisi = 5;
	}
	@Override
	public float hitungLuas() {
		// TODO Auto-generated method stub
		return sisi*sisi;
	}

	@Override
	public void tulis() {
		// TODO Auto-generated method stub
		System.out.println("Bujur Sangkar");
	}
}
