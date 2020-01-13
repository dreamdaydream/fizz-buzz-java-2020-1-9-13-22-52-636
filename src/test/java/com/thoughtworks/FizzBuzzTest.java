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
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(90));
    assertEquals("FizzWhizz", fizzBuzz.fizzBuzz(21));
    assertEquals("BuzzWhizz", fizzBuzz.fizzBuzz(105));
  }

  @Test
  public void should_return_Fizz_given_a_number_is_contain_3() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.fizzBuzz(13));
    assertEquals("Fizz", fizzBuzz.fizzBuzz(30));
    assertEquals("Fizz", fizzBuzz.fizzBuzz(63));
  }

  @Test
  public void should_return_Buzz_given_a_number_contains_5() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Buzz", fizzBuzz.fizzBuzz(15));
    assertEquals("BuzzWhizz", fizzBuzz.fizzBuzz(35));
  }

  @Test
  public void should_return_Whizz_given_a_number_contains_7() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.fizzBuzz(27));
    assertEquals("Whizz", fizzBuzz.fizzBuzz(70));
  }
}
