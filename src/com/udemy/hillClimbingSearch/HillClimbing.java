package com.udemy.hillClimbingSearch;

public class HillClimbing {

	private static final double STARTING_INTERVAL = -2;
	private static final double END_INTERVAL = 2;

	private double f(double x) {
		return -(x - 1) * (x - 1) + 2;
	}

	public void hillClimbingSearch() {

		double dx = 0.01;
		double actualPointX = STARTING_INTERVAL;
		double max = f(actualPointX);

		while (f(actualPointX + dx) > max) {
			max = f(actualPointX + dx);
			actualPointX = actualPointX + dx;
			System.out.println("x = " + max + " f(x) = " + actualPointX);
		}
		System.out.println("Max with hill climbing is : " + max);
	}
}
