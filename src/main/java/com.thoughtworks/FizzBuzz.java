package com.thoughtworks;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String WHIZZ = "Whizz";

  public String fizzBuzz(Integer number) {
    String result = "";
    String containsResult = "";
    boolean isContains = false;

    if (number % 3 == 0) {
      result += FIZZ;
    }
    if (number % 5 == 0) {
      result += BUZZ;
    }
    if (number % 7 == 0) {
      result += WHIZZ;
    }
    if (number.toString().contains("3")) {
      isContains = true;
      containsResult = FIZZ;
    }

    if (number.toString().contains("5")) {
      isContains = true;
      containsResult = result.replace(FIZZ, "");
    }

    if (number.toString().contains("7")) {
      isContains = true;
      containsResult = (containsResult + result).replace(BUZZ, "");
    }

    if (isContains) {
      return getResult(number, containsResult);
    }
    return getResult(number, result);
  }

  private String getResult(Integer number, String result) {
    return result.isEmpty() ? number.toString() : result;
  }
}