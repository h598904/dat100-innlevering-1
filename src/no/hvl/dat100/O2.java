package no.hvl.dat100;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Skriv inn din inntekt i NOK (heltall):");
            
            if (scanner.hasNextLong()) {
                long income = scanner.nextLong();
                
                if (income < 0) {
                    System.out.println("Inntekt kan ikke være negativ.\n");
                    scanner.nextLine();
                    continue;
                }
                
                double totalTax = 0.0;

                if (income > 208050) { // Trinn 1 Skatt
                    long lowerLimit = 208051;
                    long upperLimit = 292850;
                    double rate = 0.017;
                    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
                    totalTax += taxableAmount * rate;
                }

                if (income > 292850) { // Trinn 2 Skatt
                    long lowerLimit = 292851;
                    long upperLimit = 670000;
                    double rate = 0.04; 
                    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
                    totalTax += taxableAmount * rate;
                }

                if (income > 670000) { // Trinn 3 Skatt
                    long lowerLimit = 670001;
                    long upperLimit = 937900;
                    double rate = 0.136;
                    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
                    totalTax += taxableAmount * rate;
                }

                if (income > 937900) { // Trinn 4 Skatt
                    long lowerLimit = 937901;
                    long upperLimit = 1350000;
                    double rate = 0.166;
                    long taxableAmount = Math.min(income, upperLimit) - lowerLimit + 1;
                    totalTax += taxableAmount * rate;
                }

                if (income > 1350000) { // Trinn 5 Skatt
                    long lowerLimit = 1350001;
                    double rate = 0.176;
                    long taxableAmount = income - lowerLimit + 1;
                    totalTax += taxableAmount * rate;
                }

                String formattedIncome = NumberFormat.getInstance(Locale.US).format(income);
                String formattedTax = String.format("%,.2f", totalTax);

                System.out.println("Inntekt: " + formattedIncome + " kroner");
                System.out.println("Totalskatt som skal betales: " + formattedTax + " kroner\n");
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ugyldig poengsum: \"" + invalidInput + "\" er ikke et tall.\n");
            }

            boolean validResponse = false;
            while (!validResponse) {
                System.out.print("Vil du beregne skatt for en annen inntekt? (ja/nei): ");
                String response = scanner.next().toLowerCase();
                scanner.nextLine(); 
                if (response.equals("ja") || response.equals("j")) {
                    validResponse = true;
                } else if (response.equals("nei") || response.equals("n")) {
                    validResponse = true;
                    continueCalculating = false;
                    System.out.println("Takk for at du brukte Skattekalkulatoren.");
                } else {
                    System.out.println("Ugyldig respons. Vennligst skriv 'ja' eller 'nei'.\n");
                }
            }
        }

        scanner.close();
    }
}
