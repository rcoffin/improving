package com.improving.fizzbuzz

import org.scalatest.junit.JUnit3Suite

class WhenSayingNumbers extends JUnit3Suite {
  def testShouldSayOne() {
    assert(new FizzBuzz(1).say === "1")
  }

  def testShouldSayTwo() {
    assert(new FizzBuzz(2).say === "2")
  }

  def testShouldSayFizz() {
    assert(new FizzBuzz(3).say === "Fizz")
  }

  def testShouldSayBuzz() {
    assert(new FizzBuzz(5).say === "Buzz")
  }

  def testShouldSayFizzBuzz() {
    assert(new FizzBuzz(15).say === "FizzBuzz")
  }

  def testShouldSayFizzAgain() {
    assert(new FizzBuzz(6).say === "Fizz")
  }
}