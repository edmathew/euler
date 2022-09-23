package com.ejpm.euler.utils.matrix;

import com.ejpm.euler.utils.io.OutputUtils;

import java.util.Arrays;

public class MatrixCalcMaxPathSum {

  public static int calc(final Integer[][] matrix) {
    final Integer[][] sumMatrix = new Integer[matrix.length][matrix[0].length];

    //Init the first row
    sumMatrix[0][0] = matrix[0][0];

    for (int i = 1; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != null) {
          Integer leftParent = j > 0 ? sumMatrix[i - 1][j - 1] : -1;
          Integer rightParent = sumMatrix[i - 1][j] != null ? sumMatrix[i - 1][j] : -1;

          sumMatrix[i][j] = Integer.max(
                  Integer.sum(matrix[i][j], leftParent),
                  Integer.sum(matrix[i][j], rightParent)
          );
        }
      }
    }
    return Arrays.stream(sumMatrix[sumMatrix.length - 1]).mapToInt(v -> v).max().getAsInt();
  }
}
