package sample;

import java.util.Scanner;

public class samplescanner {

	public static void main(String[] args) {
try (Scanner Scan = new Scanner(System.in)) {
	System.out.println("Enter the Name:");
	String Name=Scan.next();
	System.out.println("Enter the Email:");
	String Email=Scan.next();
	System.out.println("Enter phone Number:");
	String No=Scan.next();
	String mydetails="Name:" + Name + "\nEmail: " + Email + "\nphone Number: " + No;
	
	System.out.println("my Details:\n"+ mydetails);
}
	}
}
