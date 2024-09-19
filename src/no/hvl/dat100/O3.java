package no.hvl.dat100;
import java.util.Scanner;
import java.math.BigInteger;

public class O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        boolean continueCalculating = true; 

        while (continueCalculating) {
            System.out.print("Skriv inn et positivt heltall (n > 0) for at vi skal beregne verdien n!: ");
            if (scanner.hasNextLong()) { 
                long n = scanner.nextLong();
                scanner.nextLine(); 

                if (n <= 0) {
                    System.out.println("Ugyldig data! Vennligst skriv inn heltall som er mer enn 0.");
                } else {
                    BigInteger factorial = BigInteger.ONE;

                    for (long i = 1; i <= n; i++) {
                        factorial = factorial.multiply(BigInteger.valueOf(i));
                    }

                    System.out.println(n + "! = " + factorial);
                }
            } else {
                String invalidInput = scanner.next();
                scanner.nextLine();
                System.out.println("Ugyldig data: \"" + invalidInput + "\" er ikke et gyldig heltall.");
            }
            
            boolean validResponse = false;
            while (!validResponse) {
                System.out.print("Vil du beregne factorial for et annet tall? (ja/nei): ");
                String response = scanner.nextLine().trim().toLowerCase();

                if (response.equals("ja") || response.equals("j")) {
                    validResponse = true;
                } else if (response.equals("nei") || response.equals("n")) {
                    validResponse = true;
                    continueCalculating = false; 
                    System.out.println("Takk for at du brukte Fakultet kalkulatoren.");
                } else {
                    System.out.println("Ugyldig respons. Vennligst skriv 'ja' eller 'nei'.\n");
                }
            }
        }

        scanner.close(); 
    }
}
