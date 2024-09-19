package no.hvl.dat100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        List<String> grades = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            System.out.print("Skriv ditt poengssum" + " (0-100): ");

            if (scanner.hasNextInt()) {
                int score = scanner.nextInt();

                if (score < 0 || score > 100) {
                    System.out.println("Ugyldig. Vennligst skriv tall fra 0-100." + "\n");
                    i--;
                    continue;
                }

                scores.add(score);

                String grade;
                if (score >= 90) {
                    grade = "A";
                } else if (score >= 80) {
                    grade = "B";
                } else if (score >= 60) {
                    grade = "C";
                } else if (score >= 50) {
                    grade = "D";
                } else if (score >= 40) {
                    grade = "E";
                } else {
                    grade = "F";
                }

                grades.add(grade);

                System.out.println("Din karakter for nr. " + i + " er: " + grade + "\n");
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ugyldig: \"" + invalidInput + "\" er ikke et tall.\n");
                i--;
            }
        }

        System.out.println("\n--- Resultat ---");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Poengssum #" + (i + 1) + ": " + scores.get(i) + " => Karakter: " + grades.get(i));
        }

        scanner.close();
    }
}
