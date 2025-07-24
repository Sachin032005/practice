package sample;

import java.io.*;
import java.util.Scanner;

public class Writefile {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	try {
		FileWriter mywriter=new FileWriter("C:/Users/Sachin/OneDrive/Desktop/newdemo.txt");
		System.out.println("write the content");
		String words=scan.nextLine();
		mywriter.write(words);
		mywriter.close();
       System.out.println("successfully wrote to the file");
	}
catch(IOException e) {
	System.out.println("file not found");
}
	finally {
		System.out.println("file exicted");
	}
}}
