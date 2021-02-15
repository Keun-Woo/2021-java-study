package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Finally {
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("d:/file.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try (FileOutputStream fos = new FileOutputStream("d:/file.txt")) {
			String str = "아무내용이나 그거자리렂ㅇ리ㅓ";

			byte[] bytes = str.getBytes();

			for (int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}