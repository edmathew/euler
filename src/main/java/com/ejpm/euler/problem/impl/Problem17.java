package com.ejpm.euler.problem.impl;

import com.ejpm.euler.problem.Problem;
import com.ejpm.euler.utils.text.NumberToText;

import java.util.*;


/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 */
public class Problem17 implements Problem {

  @Override
  public void execute() {
    System.out.println("Problem 17:\tThe sum of all letters is " + sumWordLettersUntil(1000));
  }

  public int sumWordLettersUntil(int finalNumber) {
    int result = 0;
    for (int i = 1; i <= finalNumber; i++)
      result += sumLetters(i);
    return result;
  }

  private int sumLetters(int number) {
    final List<String> tokens = NumberToText.getTextRepresentation(number);

    final String joinTokens = String.join("", tokens);

    return joinTokens.length();
  }
}
