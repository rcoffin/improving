package com.improving.fizzbuzz


object Main extends Application {
  (1 to 100)
          .map(n => new FizzBuzz(n).say)
          .foreach(s => println(s))
}