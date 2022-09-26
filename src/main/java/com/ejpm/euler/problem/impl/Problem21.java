package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
import com.ejpm.euler.utils.io.FileReaderUtils;
import com.ejpm.euler.utils.math.NaturalNumber;
import com.ejpm.euler.utils.matrix.MatrixCalcMaxPathSum;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * <p>
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * <p>
 * Evaluate the sum of all the amicable numbers under 10000.
 **/
public class Problem21 implements Problem {

  @Override
  public void execute() {
    System.out.println("Problem 21:\tThe sum of all the amicable numbers under 10000 is " + calcAmicableSum(10000));
  }

  public int calcAmicableSum(int limit) {
    int[] divisorsSumMatrix = new int[limit + 1];
    for (int i = 1; i <= limit; i++)
      divisorsSumMatrix[i] = new NaturalNumber(i).getDivisors().stream().mapToInt(Integer::intValue).sum();

    final Map<Integer, Integer> pairs = new HashMap<>();

    for (int i = 1; i < limit; i++) {
      if (divisorsSumMatrix[i] < limit)
        if (i != divisorsSumMatrix[i] && divisorsSumMatrix[divisorsSumMatrix[i]] == i) {
          if (pairs.get(i) == null && pairs.get(divisorsSumMatrix[i]) == null)
            pairs.put(i, divisorsSumMatrix[i]);
        }
    }

    return sumAllPairs(pairs);
  }

  private Integer sumAllPairs(Map<Integer, Integer> pairs) {
    int sum = 0;
    for (Map.Entry<Integer, Integer> pair : pairs.entrySet())
      sum += pair.getKey() + pair.getValue();
    return sum;
  }

}
