package stringTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling {
	static File f = new File("E:\\FileHandling\\Test.txt");
	static DataOutputStream dos;
	static DataInputStream dis;

	public static void fileWriteRead() throws IOException {
		try {
			boolean exists = f.exists();
			FileOutputStream fos = new FileOutputStream(f);
			dos = new DataOutputStream(fos);
			dos.writeUTF("Dummy Content, but writing new sentence \n Hello World, welcome to FILE HADLING..!");

			if (exists) {
				System.out.println("File exists and is updated !");
			} else {
				System.out.println("File is created !");
			}

			FileInputStream fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			String str = dis.readUTF();
			System.out.println("File Content is :- " + str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			dos.close();
			dis.close();
		}
	}

	public static void main(String[] args) throws IOException {
		fileWriteRead();
	}
}
