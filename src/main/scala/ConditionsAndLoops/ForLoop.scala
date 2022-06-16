package ConditionsAndLoops

object ForLoop {

  def main(args: Array[String]): Unit = {

    // Syntax
    /*for(var a <- Range){
      execute statements
    }*/

    for (i <- 1 to 5) {
      println(s"Value of i: $i")
    }
    //    Value of i: 1
    //    Value of i: 2
    //    Value of i: 3
    //    Value of i: 4
    //    Value of i: 5

    // to is a method
    for (i <- 1.to(5)) {
      println(s"Value of i: $i")
    }
    //    Value of i: 1
    //    Value of i: 2
    //    Value of i: 3
    //    Value of i: 4
    //    Value of i: 5

    //use until
    for (i <- 1.until(5)) {
      println(s"Value of i until : $i")
    }
    //    Value of i until : 1
    //    Value of i until : 2
    //    Value of i until : 3
    //    Value of i until : 4

    //    Multiple ranges inside for loop
    for (i <- 1 to 3; j <- 1 to 2) {
      println(s"Value of i: $i and Value of j: $j")
    }
    //    Value of i: 1 and Value of j: 1
    //    Value of i: 1 and Value of j: 2
    //    Value of i: 2 and Value of j: 1
    //    Value of i: 2 and Value of j: 2
    //    Value of i: 3 and Value of j: 1
    //    Value of i: 3 and Value of j: 2

    //    Use for loop to iterate over list
    var fruits = List("apple", "mango", "banana");
    for (i <- fruits) {
      println(s"Eating $i")
    }
    //    Eating apple
    //    Eating mango
    //    Eating banana

    // filtering values from list
    var nums = List(1, 2, 3, 4, 5, 6, 7, 8, 2, 4, 7, 1)
    for (num <- nums; if num < 5) {
      println(s"Num is: $num")
    }
    //    Num is: 1
    //    Num is: 2
    //    Num is: 3
    //    Num is: 4
    //    Num is: 2
    //    Num is: 4
    //    Num is: 1

    // for loop as expressions
    val res = for {i <- nums; if i < 5} yield {
      i * i // square of num
    } // returns list of square of numbers
    println("Result is " + res) // Result is List(1, 4, 9, 16, 4, 16, 1)

  }
}
