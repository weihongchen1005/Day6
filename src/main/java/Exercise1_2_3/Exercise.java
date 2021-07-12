package Exercise1_2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
class Color {
	private String color;

	public Color(String color) {
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return (this.color);
	}
}

public class Exercise {

	public static void main(String[] args) {
		Color black = new Color("Black");
		Color white = new Color("white");
		Color red = new Color("Red");

		Color green = new Color("green");
		Color purple = new Color("purple");
		Color pink = new Color("pink");
		
		ArrayList<Color> colors = new ArrayList<Color>();
		ArrayList<Color> colors2 = new ArrayList<Color>();
		colors.add(red);
		colors.add(white);
		colors.add(black);
		
		colors2.add(green);
		colors2.add(purple);
		colors2.add(pink);
		colors2.add(white);
		colors2.add(black);
		
		// print out collections
		System.out.println(colors);

		// iterate
		for (Color n : colors) {
			System.out.println(n.getColor());
		}

		// reverse
		Collections.reverse(colors);
		System.out.println(colors);
		
		//same elements in a set;
		colors2.retainAll(colors);
		System.out.println("Same elements: " + colors2);
		
	}

}
