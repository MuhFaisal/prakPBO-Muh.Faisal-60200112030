package laporan5;

public class Argumen2 {
	
	public static void argumenArray(int[] args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	
	public static void argumenSembarang(int... args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}

	public static void main(String[] args) {
		int i[] = {11,22,33};
		argumenArray(i);
		argumenSembarang(i);
	}

}
