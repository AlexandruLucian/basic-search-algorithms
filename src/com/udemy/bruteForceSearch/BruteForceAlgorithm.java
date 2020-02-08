package com.udemy.bruteForceSearch;

public class BruteForceAlgorithm {

	private static final double START_X = -1;

	private static final double END_X = 2;

	public double f(double x) {
		return -1 * (x - 1) * (x - 1) + 2;
	}

	public void bruteForceSearch() {

		double startingPointX = START_X;
		double max = f(startingPointX);
		double dx = 0.01;

		for (double i = startingPointX; i < END_X; i += dx) {
			if (f(i) > max) {
				max = f(1);
			}
		}
		System.out.println("The maximum value si f(x) = " + max);
	}
}
