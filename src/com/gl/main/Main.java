package com.gl.main;

import java.util.HashMap;
import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.services.CredentialService;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, String> departments = new HashMap<Integer, String>();
		departments.put(1, "Technical");
		departments.put(2, "Admin");
		departments.put(3, "Human Resource");
		departments.put(4, "Legal");

		Scanner s = new Scanner(System.in);
		System.out.println("Firstname Please: ");
		String firstName = s.next();

		System.out.println("lastname Please: ");
		String lastName = s.next();

		System.out.println("Dept Please: \n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		int dept = s.nextInt();

		System.out.println(
				"How strong you need the password: \nEnter 2 for Strong, \nEnter 3 for Stronger, \nEnter 4 for Strongest.");
		int passwordStrength = s.nextInt();

		Employee emp;

		if (dept == 1 || dept == 2 || dept == 3 || dept == 4) {
			emp = new Employee(firstName, lastName, departments.get(dept), passwordStrength);
			System.out.println("=================================");
			System.out.println(CredentialService.showCredentials(emp));
			System.out.println("=================================");
		} else {
			System.out.println("Invalid department.");
		}
		s.close();
	}

}
