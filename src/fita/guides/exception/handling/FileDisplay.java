package fita.guides.exception.handling;

import java.io.*;

public class FileDisplay {
	// The compiler forces us to address the potential FileNotFoundException from FileReader
	public static void main(String[] args) {
	
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	public static void openFile() throws FileNotFoundException {
		FileReader file = new FileReader("D:\\Backup\\Admin_New\\config.txt"); // System Directory Path.
	}
}
