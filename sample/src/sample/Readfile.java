package sample;

import java.io.File;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) {
	try {
		File myFile=new File("C:/Users/Sachin/OneDrive/Desktop/sachi/sachi.java");
		Scanner reader=new Scanner(myFile);
		while(reader.hasNextLine()) {
			String line=reader.nextLine();
			System.out.println(line);
		}
		reader.close();}
catch(Exception e) {
	System.out.println("file not found");
}
	finally {
		System.out.println("file exicted");
	}
}}
