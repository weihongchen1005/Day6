package Exercise4_5_6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;

public class Exercise {

	public static void main(String[] args) {
		// Exercise 5
		Set<Integer> intTree = new TreeSet<Integer>();
		intTree.add(1);
		intTree.add(2);
		intTree.add(3);
		intTree.add(4);
		intTree.add(5);
		intTree.add(6);
		intTree.add(7);
		intTree.add(8);
		intTree.add(9);
		intTree.add(10);

		System.out.println(intTree);
		System.out.println("#5: Values greater than 7: ");
		for (int x : intTree) {
			if (x > 7) {
				System.out.println(x);
			}
		}

		// Exercise #6
		HashMap<String, Character> nameGender = new HashMap<>();
		nameGender.put("Anna", 'F');
		nameGender.put("Ben", 'M');
		nameGender.put("Cody", 'M');
		nameGender.put("David", 'M');
		System.out.println("#6 " + nameGender.size());

		// Exercise #7
		System.out.println(nameGender);
		System.out.println("#7: " + nameGender.keySet());

		// Exercise #8
		TreeMap<String, Character> language = new TreeMap<String, Character>();
		language.put("English", 'E');
		language.put("Chinese", 'C');
		language.put("Canadian", 'C');

		Comparator comp = language.comparator();
		System.out.println("#8: TreeMap is already sorted, so the value of the comparator is " + comp);

		// #9
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formattedDateTime = date.format(formatter);
		System.out.println("#9: " + formattedDateTime);
		
		// #10
		String regex = "(\\d{2}\\/\\d{2}\\/\\d{4}) (\\d{2}:\\d{2})";
		Matcher matcher = Pattern.compile(regex).matcher(formattedDateTime);
		if (matcher.find()) {
			System.out.printf("Date: %s\n", matcher.group(1));
			System.out.printf("Time: %s\n", matcher.group(2));
		}
	}

}
