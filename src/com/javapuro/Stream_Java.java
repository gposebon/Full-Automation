package com.javapuro;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Stream_Java {

	@Test
	public void countNames() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Guillermo");
		names.add("Morella");
		names.add("Matilda");
		names.add("Jorgelina");
		names.add("Pepito");
		names.add("Moises");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if (name.startsWith("M")) {
				count++;
			}
		}

		System.out.println(count + " Names whit 'M'");

	}

	@Test
	public void streamNames() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Guillermo");
		names.add("Morella");
		names.add("Matilda");
		names.add("Jorgelina");
		names.add("Pepito");
		names.add("Moises");

		Long count2 = names.stream().filter(name -> name.startsWith("G")).count();
		System.out.println(count2 + " Names whit 'G'");

		long d = Stream.of("Guillermo", "Morella", "Matilda", "Jorgelina", "Pepito", "Moises").filter(name -> {
			name.startsWith("M");
			return true;
		}).count();

		System.out.println(d + " nombres con M");

		names.stream().filter(name -> name.length() > 7).forEach(name -> System.out.println(name));
		names.stream().filter(name -> name.length() > 7).limit(1).forEach(name -> System.out.println(name));
	}

}
