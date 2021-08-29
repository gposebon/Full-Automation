package com.javapuro;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Map_Java {

	@Test
	public void mapTest() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Guillermo");
		names.add("Morella");
		names.add("Matilda");
		names.add("Jorgelina");
		names.add("Pepito");
		names.add("Moises");

		//Stream.of("Guillermo", "Morella", "Matilda", "Jorgelina", "Pepito", "Moises").filter(name -> name.endsWith("a"))
		//		.map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		
		List<String> names1 = Arrays.asList("Guillermo","Morella","Matilda","Jorgelina","Pepito","Moises");
		
		names1.stream().filter(name1 -> name1.startsWith("M")).sorted().map(name1 -> name1.toUpperCase())
		.forEach(name1 -> System.out.println(name1));
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		
		boolean flag = newStream.anyMatch(name -> name.equalsIgnoreCase("Pepito"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect() {
		
		List<String> ls = Stream.of("Guillermo", "Morella", "Matilda", "Jorgelina", "Pepito", "Moises").filter(name -> name.endsWith("a"))
				.map(name -> name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(5,4,2,2,1,6,7,3);
		values.stream().distinct().forEach(value -> System.out.println(value));
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(6));
		
		
	}

}
