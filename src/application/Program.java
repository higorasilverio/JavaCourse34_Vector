package application;

import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		Students[] student = new Students[10];
		
		System.out.print("How many rooms will be rented? ");
		int studentsNumber = scanner.nextInt();
		System.out.println();
		
		for (int i = 1; i <= studentsNumber; i++) {
			System.out.printf("Rent #%d:%n", i);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Room: ");
			int room = scanner.nextInt();
			student[room] = new Students(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				System.out.println(i + ": " + student[i]);
			}
		}
		
		scanner.close();
	}

}
