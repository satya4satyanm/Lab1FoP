package com.gl.services;

import java.util.Arrays;
import com.gl.model.Employee;
import java.util.Collections;
import java.util.List;

public class CredentialService {

	public static final String generateEmail(String firstName, String lastName, String department) {
		department = department.replace(" ", "_");
		return firstName + "_" + lastName + "@" + department + ".company.com";
	}

	public static final String generatePassword(int strongNess) {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String special = "!@#$%^&*()_-+=<>";

		String password = "";

		password += getRandomChars(caps, strongNess);
		password += getRandomChars(small, strongNess);
		password += getRandomChars(numbers, strongNess);
		password += getRandomChars(special, strongNess);

		List<String> chars = Arrays.asList(password.split(""));
		Collections.shuffle(chars);

		password = String.join("", chars);
		return password;
	}

	private static String getRandomChars(String str, int len) {

		String chars = "";

		for (int i = 0; i < len; i++) {
			int rnd = (int) Math.floor(Math.random() * str.length());
			chars += str.charAt(rnd);
		}

		return chars;

	}

	public static String showCredentials(Employee emp) {

		String details = "Dear " + emp.getFirstName();
		details += ", Your generated credentials are as follows.\nEmail --> " + emp.getEmail();
		details += "\nPassword --> " + emp.getPassword();

		return details;
	}

}
