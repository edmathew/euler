package com.ejpm.euler.utils.matrix;

import com.ejpm.euler.utils.io.FileReaderUtils;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCalcMaxPathSumTest {

  @Test
  public void calcMaxPathForSmallMatrix() {
    final Integer[][] matrix = FileReaderUtils.readMatrixFromFile("p018_sample.txt");
    assertThat(MatrixCalcMaxPathSum.calc(matrix)).isEqualTo(23);
  }

  @Test
  public void calcMaxPathForMediumMatrix() {
    final Integer[][] matrix = FileReaderUtils.readMatrixFromFile("p018.txt");
    assertThat(MatrixCalcMaxPathSum.calc(matrix)).isEqualTo(1074);
  }

  @Test
  public void calcMaxPathForBigMatrix() {
    final Integer[][] matrix = FileReaderUtils.readMatrixFromFile("p067_triangle.txt");
    assertThat(MatrixCalcMaxPathSum.calc(matrix)).isEqualTo(7273);
  }


}