package no.hvl.dat100;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class O1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> scores = new ArrayList<>();
		List<String> grades = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
		System.out.print("Skriv inn ditt poengsum: ");
		
		if (scanner.hasNextInt()) {
		int score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("Ugyldig poengsum. Tast inn 0-100" + "\n");
			i--;
			continue;
		}
		
		scores.add(score);
		
		String grade;
		
		if (score >= 90) {
			grade = "A";
			} else if (score >= 80 && score <= 89) { 
			grade = "B";	
			} else if (score >=70 && score <= 79) {
			grade = "C";
			} else if (score >= 60 && score <= 69) {
			grade = "D";
			} else if (score >= 50 && score <= 59) {
			grade = "E";
			} else {
			grade = "F";
			}
		
		grades.add(grade);
		
		System.out.println("Karakteren for din poengsum er: " + grade + "\n");
		} else {
			String invalidInput = scanner.next();
			System.out.println("Ugyldig poengsum: \"" + invalidInput + "\" er ikke et tall. \nVennligst"
					+ " tast inn et gyldig nummer fra 1-100." + "\n");
		    i--;
		}
		
	}

}
	}
