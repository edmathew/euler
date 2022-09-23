package com.ejpm.euler.utils.text;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NumberToText {
  private static final Map<Integer, String> dozensMap = new LinkedHashMap<>();

  static {
    dozensMap.put(90, "ninety");
    dozensMap.put(80, "eighty");
    dozensMap.put(70, "seventy");
    dozensMap.put(60, "sixty");
    dozensMap.put(50, "fifty");
    dozensMap.put(40, "forty");
    dozensMap.put(30, "thirty");
    dozensMap.put(20, "twenty");
  }

  private static final String HUNDRED = "hundred";
  private static final String THOUSAND = "thousand";
  private static final String AND = "and";

  private static final String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven",
          "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
          "seventeen", "eighteen", "nineteen"};

  public static List<String> getTextRepresentation(int number) {
    final ArrayList<String> tokens = new ArrayList<>();
    int thousands = number / 1000;
    int remainder = number % 1000;

    if(thousands > 0){
      tokens.add(getIndividualNumberText(thousands));
      tokens.add(THOUSAND);
    }

    int hundreds = remainder / 100;
    remainder = number % 100;
    if (hundreds > 0) {
      tokens.add(getIndividualNumberText(hundreds));
      tokens.add(HUNDRED);
      if (remainder > 0)
        tokens.add(AND);
    }

    for (Map.Entry<Integer, String> entry : dozensMap.entrySet()) {
      if (remainder >= entry.getKey()) {
        tokens.add(entry.getValue());
        remainder -= entry.getKey();
      }
    }

    if (remainder > 0)
      tokens.add(getIndividualNumberText(remainder));

    return tokens;
  }

  private static String getIndividualNumberText(int number) {
    return numbers[number];
  }
}
