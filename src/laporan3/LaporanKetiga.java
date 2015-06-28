package laporan3;

public class LaporanKetiga {
	
public static double nilai = 3;
public static double hasil;

	public static void main(String[] args) {
		
		System.out.println("Bagian Satu, Aritmatika");
		hasil = nilai - 0.5;
		System.out.println("hasil untuk + adalah " + hasil);
		hasil = nilai + 1.25;
		System.out.println("hasil untuk - adalah " + hasil);
		hasil = nilai * 3.75;
		System.out.println("hasil untuk * adalah " + hasil);
		hasil = nilai / 2.5;
		System.out.println("hasil untuk / adalah " + hasil);
		hasil = nilai % 1.5;
		System.out.println("hasil untuk % adalah " + hasil);
		hasil = nilai += 5.5;
		System.out.println("hasil untuk += adalah " + hasil);
		hasil = nilai -= 6.5;
		System.out.println("hasil untuk -= adalah " + hasil);
		hasil = nilai *= 7.5;
		System.out.println("hasil untuk *= adalah " + hasil);
		
		System.out.println("\nBagian Dua, concat");
		String string1 = "Mari kita coba ";
		String string2 = "menggunakan Concat pada laporan ini ";
		String string3 = string1 + string2;
		System.out.println(string3 + "dan voila...");
		String string4 = "dan dicoba lagi ";
		String string5 = "lalu...";
		String string6 = string1 + string4 + string5;
		System.out.println(string6 + "VOILA!!!");

		System.out.println("\nBagian Tiga, Unary");
		hasil = nilai +1; //hasil dihitung dari operator mod di bagian satu
		hasil = nilai--;
		System.out.println(hasil);
		hasil = nilai++;
		System.out.println(hasil);
		hasil = -nilai;
		System.out.println(hasil);
		
		System.out.println("\nBagian Empat, Prepost Demo");
		int a = 1;
		a++;
		System.out.println(a);   //2
		++a;				   
		System.out.println(a);   //3
		System.out.println(++a); //4
		System.out.println(a++); //4
		System.out.println(a);	 //5
		a--;
		System.out.println("\n" + a);   //4
		--a;				   
		System.out.println(a);   //3
		System.out.println(--a); //4
		System.out.println(a--); //2
		System.out.println(a);	 //1
		
		System.out.println("\nBagian Lima, Perbandingan dan Kondisional");
		int angka1 = -1;
		int angka2 = -10;
		if (angka1 == angka2);
		System.out.println("nilai1 == nilai2");
		if (angka1 != angka2);
		System.out.println("nilai1 != nilai2");
		if (angka1 >= angka2);
		System.out.println("nilai1 >= nilai2");
		if (angka1 <= angka2);
		System.out.println("nilai1 == nilai2");
		
		if ((angka1 == -1) && (angka2 == -10));
		System.out.println("nilai dari -1 AND -10 adalah -1");
		if ((angka1 == -1) && (angka2 == -10));
		System.out.println("nilai dari -1 OR -10 adalah -10");
		
		System.out.println("\nBagian Enam, Operator BitWise");
		byte angka3 = -127;
		byte angka4= 28;
		System.out.println(~angka3);
		System.out.println(~angka4);
		
		System.out.println(angka3 & 5);
		System.out.println(angka4 | 6);
		System.out.println(angka3 ^ 7);
		
		System.out.println(angka3>>2);
		System.out.println(angka3<<8);
		System.out.println(angka3>>>9);
		System.out.println(angka3>>>4);
		
		
	}

}
