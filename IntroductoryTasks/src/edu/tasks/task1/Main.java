package edu.tasks.task1;

public class Main {
	
	private static final double C = -1.49D;
	private static final double D = 23.4D;
	
	private static Double compute(Integer row, Integer column) {
		double left = Math.sin(Math.sin(C));
		double right = 4*Math.log(Math.log(D))/Math.pow(row+1, column+1);
		return Double.valueOf(Math.sqrt(Math.abs(left-right)));
	}

	public static void main(String[] args) {
		Matrix<Double> m = new Matrix<>(10,15);
		m.initialize(Main::compute);
		System.out.printf("Matrix %n%s",m);
		System.out.printf("Maximum value: %15.8f%n",m.getMax());
	}

}
