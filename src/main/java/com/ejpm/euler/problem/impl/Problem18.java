package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
import com.ejpm.euler.utils.io.FileReaderUtils;
import com.ejpm.euler.utils.matrix.MatrixCalcMaxPathSum;


/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * <p>
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * <p>
 * That is, 3 + 7 + 4 + 9 = 23.
 * Find the maximum total from top to bottom of the triangle
 **/
public class Problem18 implements Problem {

  @Override
  public void execute() {
    System.out.println("Problem 18:\tThe maximum total from top to the bottom is " + MatrixCalcMaxPathSum.calc(FileReaderUtils.readMatrixFromFile("p018.txt")));
  }
}
