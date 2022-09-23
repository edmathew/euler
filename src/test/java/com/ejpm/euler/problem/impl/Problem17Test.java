package com.ejpm.euler.problem.impl;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class Problem17Test {

  private final Problem17 problem = new Problem17();
  private final int input;
  private final int output;

  @Parameters
  public static Collection<Object> data() {
    return Arrays.asList(new Object[][]{{1, 3}, {2, 6}, {3, 11}, {5, 19},
            {20, 112}, {21, 121}, {29, 202}, {30, 208}, {41, 311}, {49, 384},
            {99,854}, {1000, 21124}
    });
  }

  public Problem17Test(int input, int output) {
    this.input = input;
    this.output = output;
  }

  @Test
  public void shouldSumTheNumberOfLettersCorrectly() {
    assertThat(problem.sumWordLettersUntil(input)).isEqualTo(output);
  }

}
