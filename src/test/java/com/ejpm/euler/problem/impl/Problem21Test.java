package com.ejpm.euler.problem.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem21Test {

  private final Problem21 problem = new Problem21();

  @Test
  public void shouldSumTheNumberOfLettersCorrectly() {
    assertThat(problem.calcAmicableSum(10000)).isEqualTo(31626);
  }

}
