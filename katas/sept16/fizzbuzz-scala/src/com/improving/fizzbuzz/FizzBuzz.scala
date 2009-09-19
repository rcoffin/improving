package com.improving.fizzbuzz

class FizzBuzz(current: Int) {
  def say(): String = {
    (current % 3, current % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => current.toString
    }
  }
}