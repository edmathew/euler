package com.ejpm.euler.utils.io;

public class OutputUtils {

  public static <T> void printBiDimensionalMatrix(T [][] matrix) {
    for(int i = 0; i < matrix.length; i ++){
      for(int j = 0; j < matrix[0].length; j ++){
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
