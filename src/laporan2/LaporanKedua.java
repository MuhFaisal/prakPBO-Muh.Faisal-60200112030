package laporan2;

public class LaporanKedua {
	
	static boolean bool;
	static byte by;
	static char ch;
	static double db;
	static float fl;
	static int in;
	static long ln;
	static short sh;
	static String \u0073\u0074\u0072 = "Laporan 2 PBO, Fachri Trinovat 60200112026";

	public static void main(String[] args) {
		
		if (str != null){
			Boolean refbool = new Boolean(true);
			boolean bool = refbool.booleanValue();
			System.out.println("bool = " + bool);
			
			Byte refby = new Byte((byte) 100);
			byte by = refby.byteValue();
			System.out.println("byte = " + by);
			
			Character refch = new Character('f');
			char ch = refch.charValue();
			System.out.println("char = " + ch);
			
			Double refdb = new Double((double)-31194.6138293F);
			double db = refdb.doubleValue();
			System.out.println("double = " + db);
				
			Float reffl = new Float((float)-3601302323.2524542);
			float fl = reffl.floatValue();
			System.out.println("float = " + fl);
			
			Integer refin = new Integer((int) 620211002);
			int in = refin.intValue();
			System.out.println("int = " + in);
			
			Long refln = new Long((long) 602001120);
			long ln = refln.longValue();
			System.out.println("long = " + ln);
			
			Short refsh = new Short((short) 32767);
			short sh = refsh.shortValue();
			System.out.println("short = " + sh);
			System.out.println(str);
			System.out.println("Ini Tidak NULL");
		}
			
		else{
			System.out.println("bool = " + bool);
			System.out.println("byte = " + by);
			System.out.println("char = " + ch);
			System.out.println("double = " + db);
			System.out.println("float = " + fl);
			System.out.println("int = " + in);
			System.out.println("long = " + ln);
			System.out.println("short = " + sh);
			System.out.println(str);
			System.out.println("Ini NULL");
		}

	}

}
