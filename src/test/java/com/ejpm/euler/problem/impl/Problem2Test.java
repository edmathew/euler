package com.ejpm.euler.problem.impl;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Problem2Test {

  private Problem2 problem;

  @Before
  public void setUp() {
    problem = new Problem2();
  }

  @Test
  public void theSumOfAll3and5MultipliesUnder10Is23() {
    assertThat(problem.sumFibonnaciEvenTerms(40)).isEqualTo(new BigInteger("44"));
  }

  @Test
  public void theSumOfAll3and5MultipliesUnder4MilionIs23() {
    assertThat(problem.sumFibonnaciEvenTerms(4000000)).isEqualTo(new BigInteger("4613732"));
  }

}
