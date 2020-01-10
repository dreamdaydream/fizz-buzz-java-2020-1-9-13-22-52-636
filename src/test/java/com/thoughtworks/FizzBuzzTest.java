package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

  @Test
  public void should_return_fizz_when_run_fizzbuzz_given_a_number_is_multiple_of_three() {
    Integer inputNumber = 3;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Fizz", actualResult);
  }

  @Test
  public void should_return_itself_when_run_fizzbuzz_given_a_generate_number() {
    Integer inputNumber = 1;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("1", actualResult);
  }

  @Test
  public void should_return_buzz_when_run_fizzbuzz_given_a_number_is_multiple_of_five() {
    Integer inputNumber = 5;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Buzz", actualResult);
  }

}
