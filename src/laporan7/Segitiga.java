package laporan7;

public class Segitiga extends Bentuk {

	protected float alas;
	protected float tinggi;
	
	public void Segitiga(){
		alas = 4;
		tinggi = 4;
	}
	@Override
	public float hitungLuas() {
		// TODO Auto-generated method stub
		return (alas*tinggi)/2;
	}

	@Override
	public void tulis() {
		// TODO Auto-generated method stub
		System.out.println("Segitiga");		
	}

}
