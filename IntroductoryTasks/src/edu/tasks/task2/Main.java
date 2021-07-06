package edu.tasks.task2;

import java.security.SecureRandom;
import java.util.Comparator;

public class Main {
	private static SecureRandom randomizer = new SecureRandom();

	public static void main(String[] args) {
		Container<Integer> intContainer = new Container(20);
		intContainer.initialize(k->randomizer.nextInt(50));
		System.out.printf("Original unsorted container:%n%s%n", intContainer);
		new QuickSorter<Integer>(Comparator.naturalOrder()).sort(intContainer);
		System.out.printf("Ordered in ascending order:%n%s%n", intContainer);
		new QuickSorter<Integer>(Comparator.reverseOrder()).sort(intContainer);
		System.out.printf("Ordered in descending order:%n%s%n", intContainer);
	}

}
