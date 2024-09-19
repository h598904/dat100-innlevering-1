package no.hvl.dat100;

import java.util.Scanner;

public class O2 {
	public void main( String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Skriv inn din årsinntekt i NOK (heltall).");		
	long income = scanner.nextLong();


	scanner.close();
 }
}