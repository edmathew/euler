package com.ejpm.euler.utils.math.function;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(Parameterized.class)
public class DivisorsGeneratorFunctionTest {

  private Integer input;
  private List<Integer> output;

  public DivisorsGeneratorFunctionTest(Integer input, List<Integer> output) {
    this.input = input;
    this.output = output;
  }

  @Test
  public void shouldCalcTheCorrectDivisors() {
    assertThat(DivisorsGeneratorFunction.getDivisors(input)).isEqualTo(output);
  }

  @Parameterized.Parameters
  public static Collection<Object> data() {
    return org.assertj.core.util.Arrays.asList(new Object[][]{
            {1, Arrays.asList(new Integer[]{})},
            {2, Arrays.asList(new Integer[]{1})},
            {3, Arrays.asList(new Integer[]{1})},
            {4, Arrays.asList(new Integer[]{1, 2})},
            {6, Arrays.asList(new Integer[]{1, 2, 3})},
            {220, Arrays.asList(new Integer[]{1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110})},
            {284, Arrays.asList(new Integer[]{1, 2, 4, 71, 142})},
    });
  }

}