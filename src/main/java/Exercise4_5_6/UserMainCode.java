package Exercise4_5_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.YearMonth;
import java.util.Collections;

public class UserMainCode {
	static int getNumberOfDays(int year, int month) {
		YearMonth daysInMonth = YearMonth.of(year, month + 1);
		return daysInMonth.lengthOfMonth();
	}

	static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(a);
		newList.addAll(b);
		Collections.sort(newList);
		ArrayList<Integer> returnList = new ArrayList<Integer>(
				Arrays.asList(newList.get(2), newList.get(6), newList.get(8)));
		return returnList;
	}
}
