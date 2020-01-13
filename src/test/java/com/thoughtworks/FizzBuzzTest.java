package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  @Test
  public void should_return_relevant_result_for_number_is_divided_by_3_5_and_7() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    assertEquals("Whizz", fizzBuzz.fizzBuzz(7));
  }

  @Test
  public void should_return_combine_result_given_the_number_is_multiple_divided_by_3_5_and_7() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    assertEquals("FizzWhizz", fizzBuzz.fizzBuzz(21));
    assertEquals("BuzzWhizz", fizzBuzz.fizzBuzz(35));
    assertEquals("FizzBuzzWhizz", fizzBuzz.fizzBuzz(105));

  }
}
