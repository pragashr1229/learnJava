package com.java.ioStreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout = new FileOutputStream("jtp.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "BufferedOutputStream Examples ";
		byte b[] = s.getBytes();
		try {
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("success");
	}
}
