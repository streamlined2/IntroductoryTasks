package edu.tasks.task1;

import java.util.function.BiFunction;

public class Matrix <T extends Number & Comparable<? super T>> {
	private int columns;
	private int rows;
	private T[][] data;
	
	public Matrix(int rows, int columns) {
		if(rows<=0) throw new IllegalArgumentException("wrong number of rows");
		if(columns<=0) throw new IllegalArgumentException("wrong number of columns");
		this.rows = rows;
		this.columns = columns;
		data = (T[][])new Number[rows][columns];
	}
	
	public T getMax() {
		T result = data[0][0];
		for(T[] row:data) {
			for(T value:row) {
				if(result.compareTo(value)<0) {
					result = value;
				}
			}
		}
		return result;
	}
	
	public void initialize(BiFunction<Integer, Integer, T> supplier) {
		for(int row = 0; row<data.length; row++) {
			for(int column = 0; column<data[row].length; column++) {
				data[row][column] = supplier.apply(row, column);
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(T[] row:data) {
			for(T value:row) {
				sb.append(String.format("%15.8f", value.doubleValue())).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
