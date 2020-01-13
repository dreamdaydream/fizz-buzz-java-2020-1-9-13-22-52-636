package com.thoughtworks;

public class FizzBuzz {

  public String fizzBuzz(Integer number) {
    String stringNumber = number.toString();
    Boolean isContain3 = stringNumber.contains("3");
    Boolean isContain5 = stringNumber.contains("5");
    Boolean isContain7 = stringNumber.contains("7");

    String result  = "";
    if (isContain3 && !isContain5) {
      return "Fizz";
    }
    if (number % 3 == 0 && (!isContain5 || isContain7)) {
      result += "Fizz";
    }
    if (number % 5 == 0 && !isContain7) {
      result += "Buzz";
    }
    if (number % 7 == 0) {
      result += "Whizz";
    }
    return result.isEmpty()? stringNumber: result;
  }
}
