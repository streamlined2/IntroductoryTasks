package edu.tasks.task2;

import java.security.SecureRandom;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {
	
	private static SecureRandom randomizer = new SecureRandom();

	Container<Integer> container;

	@BeforeEach
	void setUp() throws Exception {
		container = new Container<Integer>(50);
		container.initialize(k->randomizer.nextInt(100));
	}

	@Test
	void testAscending() {
		new QuickSorter<Integer>(Comparator.naturalOrder()).sort(container);
		Integer key = container.getKey(0);
		for(int k=1;k<container.size();k++) {
			Assert.assertTrue(key.compareTo(container.getKey(k))<=0);
			key = container.getKey(k);
		}
	}

	@Test
	void testDescending() {
		new QuickSorter<Integer>(Comparator.reverseOrder()).sort(container);
		Integer key = container.getKey(0);
		for(int k=1;k<container.size();k++) {
			Assert.assertTrue(key.compareTo(container.getKey(k))>=0);
			key = container.getKey(k);
		}
	}
	
	@Test
	void testWrongSize() {
		Assert.assertThrows(IllegalArgumentException.class, ()->new Container<Integer>(0));
		Assert.assertThrows(IllegalArgumentException.class, ()->new Container<Integer>(-1));
	}

	@Test
	void testWrongIndex() {
		Assert.assertThrows(IllegalArgumentException.class, ()->container.getKey(-1));
		Assert.assertThrows(IllegalArgumentException.class, ()->container.getKey(container.size()));
	}

}
