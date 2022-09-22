package com.ejpm.euler.problem.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Problem15Test {

  private final Problem15 problem = new Problem15();

  @Test
  public void shouldReturnZeroForAnEmptyMatrix() {
    assertThat(problem.calcRoutes(new int[0][0])).isEqualTo(0);
  }

  @Test
  public void shouldReturnZeroForForAn1x1Matrix() {
    assertThat(problem.calcRoutes(new int[1][1])).isEqualTo(0);
  }

  @Test
  public void shouldReturnTwoForA2x2Matrix() {
    assertThat(problem.calcRoutes(new int[2][2])).isEqualTo(2);
  }

  @Test
  public void shouldReturnSixForA3x3Matrix() {
    assertThat(problem.calcRoutes(new int[3][3])).isEqualTo(6);
  }

  @Test
  public void shouldCalcCorrectlyForA20x20Matrix() {
    assertThat(problem.calcRoutes(new int[21][21])).isEqualTo(137846528820L);
  }

}
