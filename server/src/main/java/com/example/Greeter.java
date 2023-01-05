package com.example;

/**
 * This is a class that generates greetings.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    // Do nothing because of X and Y
  }

  /**
   * Generates a greeting for the given person.
   * @param someone the person to greet
   * @return the greeting
   */
  public String generateGreetingFor(String someone) {
    return String.format("Hello Kenne EDWIN, %s!", someone);
  }
}
