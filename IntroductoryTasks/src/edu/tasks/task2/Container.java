package edu.tasks.task2;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.IntFunction;

public class Container<K extends Number> implements Sequence<K> {
	private final K[] data;
	
	public Container(int size) {
		if(size<=0) throw new IllegalArgumentException("size should be greater than 0");
		data = (K[])new Number[size];
	}
	
	public void initialize(IntFunction<K> initializer) {
		for(int k=0;k<size();k++) {
			data[k] = initializer.apply(k);
		}
	}
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(",","[","]");
		Arrays.stream(data).forEach(item->joiner.add(item.toString()));
		return joiner.toString();
	}

	@Override
	public int size() {
		return data.length;
	}
	
	private void checkIndex(int index) {
		if(index<0 || index>=data.length) throw new IllegalArgumentException(String.format("index should be within [0..%d]", data.length-1));
	}

	@Override
	public K getKey(int index) {
		checkIndex(index);
		return data[index];
	}

	@Override
	public void swap(int from, int to) {
		checkIndex(from);
		checkIndex(to);
		K item = data[from];
		data[from] = data[to];
		data[to] = item;
	}

}
