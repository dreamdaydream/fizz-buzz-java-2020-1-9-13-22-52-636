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

  @Test
  public void should_return_buzz_when_run_fizzbuzz_given_a_number_is_multiple_of_seven() {
    Integer inputNumber = 7;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Whizz", actualResult);
  }

  @Test
  public void  should_return_fizzbuzz_given_a_number_of_both_multiple_of_three_and_five() {
    Integer inputNumber = 30;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Fizz", actualResult);
  }

  @Test
  public void  should_return_fizzbuzz_given_a_number_of_both_multiple_of_seven_and_five() {
    Integer inputNumber = 70;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Whizz", actualResult);
  }

  @Test
  public void  should_return_fizzbuzz_given_a_number_of_both_multiple_of_seven_and_three() {
    Integer inputNumber = 21;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("FizzWhizz", actualResult);
  }

  @Test
  public void  should_return_fizzbuzz_given_a_number_of_all_multiple_of_seven_and_three_and_five() {
    Integer inputNumber = 105;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("BuzzWhizz", actualResult);
  }

  @Test
  public void  should_return_fizz_given_a_number_contains_three() {
    Integer inputNumber = 13;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Fizz", actualResult);
  }

  @Test
  public void  should_ignore_the_rule_about_three_given_a_number_contains_five() {
    Integer inputNumber = 35;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("BuzzWhizz", actualResult);
  }

  @Test
  public void  should_ignore_the_rule_about_five_given_a_number_contains_seven() {
    Integer inputNumber = 75;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("Fizz", actualResult);
  }

  @Test
  public void  should_return_itself_given_51() {
    Integer inputNumber = 51;

    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualResult = fizzBuzz.fizzBuzz(inputNumber);

    assertEquals("51", actualResult);
  }

}
