package no.hvl.dat100;

import java.util.Scanner;


public class O2 {
	public static void main( String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Skriv inn din årsinntekt i NOK (heltall):");		
	long income = scanner.nextLong();
	double totalTax = 0.0;
	
	
	if (income > 208050) { // Trinn 1 Skatt
	    // Skatt for 208,051 – 292,850 NOK
	    long lowerLimit = 208051;
	    long upperLimit = 292850;
	    double rate = 0.017; // 1.7%
	    
	    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
	    totalTax += taxableAmount * rate;
	}

	if (income > 292850) { // Trinn 2 Skatt
		// Skatt for 292,851 – 670,000 NOK
	    long lowerLimit = 292851;
	    long upperLimit = 670000;
	    double rate = 0.04; // 4.0%
	    
	    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
	    totalTax += taxableAmount * rate;
	}

	if (income > 670000) { // Trinn 3 Skatt
		// Skatt for 670,001 – 937,900 NOK
	    long lowerLimit = 670001;
	    long upperLimit = 937900;
	    double rate = 0.136; // 13.6%
	    
	    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
	    totalTax += taxableAmount * rate;
	}

	if (income > 937900) { // Trinn 4 Skatt
		// Skatt for 937,901 – 1,350,000 NOK
	    long lowerLimit = 937901;
	    long upperLimit = 1350000;
	    double rate = 0.166; // 16.6%
	    
	    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
	    totalTax += taxableAmount * rate;
	}

	if (income > 1350000) { // Trinn 5 Skatt
		// Skatt for 1,350,001  NOK og oppover
	    long lowerLimit = 1350001;
	    double rate = 0.176; // 17.6%
	    
	    long taxableAmount = income - lowerLimit + 1;
	    totalTax += taxableAmount * rate;
	}

	System.out.printf("Totalskatt som må betales: %.2f kroner%n", totalTax);


	scanner.close();
 }
}