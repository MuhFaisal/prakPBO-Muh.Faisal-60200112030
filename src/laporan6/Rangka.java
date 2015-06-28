package laporan6;

public class Rangka {

	private Ban ban;
	public Rangka(){
		ban = new Ban();
		System.out.println("konstruktor rangka");
	}
}

class Ban{
	public Ban(){
		System.out.println("konstruktor ban");
	}
}