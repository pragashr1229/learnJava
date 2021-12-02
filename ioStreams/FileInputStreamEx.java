package com.java.ioStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String args[]) throws IOException {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("jtp.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fin.close();
		}
	}
}
