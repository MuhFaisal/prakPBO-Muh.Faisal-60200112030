package laporan8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class CobaThrows {

	public static void metodediCoba() throws FileNotFoundException,
										     ParseException,
											 IOException{
		FileInputStream file = new FileInputStream("E:/praktikum.txt");
		//SimpleDateFormat.getInstance().parse("031194");
		throw new IOException();
	}
		
	public static void metodediCobaKedua() throws IOException {
		try {
			metodediCoba();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		} catch (ParseException e) {
			System.out.println("ParseException terjadi");
		} catch (IOException e) {
			throw e;
		}
	}
	
	public static void metodediCobaKetiga() {
		throw new IndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		try {
			metodediCobaKedua();
		} catch (IOException e) {
			System.out.println("IOException terjadi");
		}
	}
}
