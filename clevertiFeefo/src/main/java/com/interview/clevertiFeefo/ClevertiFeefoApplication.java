package com.interview.clevertiFeefo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClevertiFeefoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClevertiFeefoApplication.class, args);

		StringNormalizer stringNormalizer = new StringNormalizer();
		System.out.println("Java Engineer - " + stringNormalizer.normalizeWords("Java Engineer"));
		System.out.println("C# Engineer - " + stringNormalizer.normalizeWords("C# Engineer"));
		System.out.println("Accountant - " + stringNormalizer.normalizeWords("Accountant"));
		System.out.println("Chief Accountant - " + stringNormalizer.normalizeWords("Chief Accountant"));
		System.out.println("Architect - " + stringNormalizer.normalizeWords("Architect"));
		System.out.println("Senior Architect - " + stringNormalizer.normalizeWords("Senior Architect"));
		System.out.println("Quantity Surveyor - " + stringNormalizer.normalizeWords("Quantity Surveyor"));
		System.out.println("Senior Quantity Surveyor - " + stringNormalizer.normalizeWords("Senior Quantity Surveyor"));

	}

}
