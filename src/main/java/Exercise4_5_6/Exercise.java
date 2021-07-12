package Exercise4_5_6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
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
		Matcher match = Pattern.compile(regex).matcher(formattedDateTime);
		if (match.find()) {
			System.out.printf("Date: %s\n", match.group(1));
			System.out.printf("Time: %s\n", match.group(2));
		}
		
		// #11
		Calendar calendar = Calendar.getInstance();
		System.out.printf("Year: %d\n" + "Month: %d\n" + "Day: %d\n" + "Hour: %d\n" + "Minute: %d\n",
				calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH),
				calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));

		// #12
		
		System.out.println("\nExercise #12");
		calendar = new GregorianCalendar(2021, 0, 1);
		System.out.printf(
				"Max year value: %d\n" + "Max month value: %d\n" + "Max week value: %d\n" + "Max date value: %d\n",
				calendar.getActualMaximum(Calendar.YEAR), calendar.getActualMaximum(Calendar.MONTH),
				calendar.getActualMaximum(Calendar.WEEK_OF_YEAR), calendar.getActualMaximum(Calendar.DATE));
		
		// #13
		Calendar yearCalendar= new GregorianCalendar(2021,1,1);
		System.out.printf("# of days in Feburary 2021: %d\n", yearCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		yearCalendar= new GregorianCalendar(2020,1,1);
		System.out.printf("# of days in Feburary 2020: %d\n", yearCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// #14
		System.out.printf("Number of days in March 2021: %d\n", UserMainCode.getNumberOfDays(2021, 2));
		
		//# 15
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
		ArrayList<Integer> ret = UserMainCode.sortMergedArrayList(a, b);
		System.out.println(ret);
	}

}
