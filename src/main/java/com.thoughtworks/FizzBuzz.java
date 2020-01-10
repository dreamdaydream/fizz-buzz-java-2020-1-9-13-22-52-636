package com.thoughtworks;

public class FizzBuzz {

  public String fizzBuzz(Integer number) {
    if (number%3 == 0) {
      return "fizz";
    }
    return number.toString();
  }
}
