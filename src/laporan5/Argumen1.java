package laporan5;

public class Argumen1 {
	
	public static void passingPrimitif(int i) {
		i = 5;
	}
	
	public static void passingObject(Titik t) {
		t.x = 7;
		t.y = 9;
	}

	public static void main(String[] args) {
		int i = 5;
		passingPrimitif(i);
		System.out.println(i);
		
		Titik t = new Titik();
		passingObject(t);
		System.out.println(t);

	}

}

class Titik {
	public int x;
	public int y;
	
	public Titik() {
		x = 0;
		y = 0;
	}
}