package com.ejpm.euler.text;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static com.ejpm.euler.text.NumberToText.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class NumberToTextTest {

  private final int input;
  private final List<String> output;

  public NumberToTextTest(int input, List<String> output) {
    this.input = input;
    this.output = output;
  }

  @Parameters
  public static Collection<Object> data() {
    return Arrays.asList(new Object[][]{
            {100, Arrays.asList(new String[]{"one", "hundred"})},
            {101, Arrays.asList(new String[]{"one", "hundred", "and", "one"})},
            {102, Arrays.asList(new String[]{"one", "hundred", "and", "two"})},
            {222, Arrays.asList(new String[]{"two", "hundred", "and", "twenty", "two"})},
            {769, Arrays.asList(new String[]{"seven", "hundred", "and", "sixty", "nine"})},
            {1000, Arrays.asList(new String[]{"one", "thousand"})},

    });
  }

  @Test
  public void shouldGenerateTheCorrectRepresentation() {
    assertThat(getTextRepresentation(input)).isEqualTo(output);
  }
}