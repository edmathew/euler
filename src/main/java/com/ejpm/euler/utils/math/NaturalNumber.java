package com.ejpm.euler.utils.math;

import com.ejpm.euler.utils.math.function.DivisorsGeneratorFunction;

import java.util.List;

public class NaturalNumber {

  private final Integer number;

  public NaturalNumber(final Integer number) {
    this.number = number;
  }

  public List<Integer> getDivisors() {
    return DivisorsGeneratorFunction.getDivisors(number);
  }
}
