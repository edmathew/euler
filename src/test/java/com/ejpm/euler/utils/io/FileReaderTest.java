package com.ejpm.euler.utils.io;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FileReaderTest {

  private final static String FILE_NAME = "p018_sample.txt";

  @Test
  public void shouldReadAMatrixSuccessfully() {
    final Integer[][] matrix = FileReaderUtils.readMatrixFromFile(FILE_NAME);
    assertThat(matrix.length).isEqualTo(4);
    assertThat(matrix[0].length).isEqualTo(4);
    assertThat(matrix[0][0]).isEqualTo(3);
    assertThat(matrix[3]).isEqualTo(new Integer[]{new Integer("8"), new Integer("5"), new Integer("9"), new Integer("3")});
  }

}