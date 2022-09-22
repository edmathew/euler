package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;

import java.util.Arrays;


/**
 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking)
 * to the bottom right corner.
 * <p>
 * How many routes are there through a 20×20 grid?
 */
public class Problem15 implements Problem {

  @Override
  public void execute() {
    System.out.println("Problem 15:\t The number of routes for a 20x20 grid is " + calcRoutes(new int[21][21]) + ".");
  }

  public long calcRoutes(int[][] matrix) {
    if (matrix.length < 2) return 0;

    final long[][] pathCalc = new long[matrix.length][matrix[0].length];

    Arrays.fill(pathCalc[0], 1);

    for (int i = 0; i < matrix.length; i++)
      pathCalc[i][0] = 1;

    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        pathCalc[i][j] = pathCalc[i - 1][j] + pathCalc[i][j - 1];
      }
    }


    return pathCalc[pathCalc.length - 1][pathCalc[0].length - 1];
  }


}
