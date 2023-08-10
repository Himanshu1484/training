// Java program to pass an
// ArrayList as an argument

import java.util.*;

public class west {

	public static void main(String[] args)
	{
		// Creating an ArrayList Object of Integer type
		ArrayList<Integer> list = new ArrayList<>();

		// Inserting some Integer values in ArrayList
		list.add(3);
		list.add(57);
		list.add(7);

		// list after insertions : [3, 57, 7]
		// Displaying the ArrayList
		System.out.print("ArrayList after insertions: ");
		display(list);

		// Passing the ArrayList as an argument for
		// modification The modifications done to the list
		// inside the function will appear inside the
		// original ArrayList inside main()
		check(list);

	}

	// Function to modify the arrayList
	public static void check(ArrayList<Integer> parameterList)
	{
		parameterList.add(20);
		parameterList.add(98);
	}

	// Function to display the array List
	public static void display(ArrayList<Integer> list)
	{
		System.out.println(list);
	}
}
