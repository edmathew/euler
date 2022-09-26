package com.ejpm.euler.utils.math.function;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DivisorsGeneratorFunction {

  public static List<Integer> getDivisors(final Integer number) {
    final List<Integer> divisors = new LinkedList<>();
    if (number > 1)
      divisors.add(1);

    for (int i = 2; i <= Math.sqrt(number); i++)
      if (number % i == 0) {
        divisors.add(i);
        if (number / i != i)
          divisors.add(number / i);
      }


    Collections.sort(divisors);
    return divisors;
  }
}
