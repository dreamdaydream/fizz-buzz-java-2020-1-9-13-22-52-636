package com.thoughtworks;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String WHIZZ = "Whizz";

  public String fizzBuzz(Integer number) {
    String result = "";

    if (number % 3 == 0) {
      result = result + FIZZ;
    }
    if (number % 5 == 0) {
      result = result + BUZZ;
    }
    if (number % 7 == 0) {
      result = result + WHIZZ;
    }

    return result.isEmpty()? result+number.toString(): result;
  }
}
