package ConditionsAndLoops

object doWhileLoop {

  def main(args: Array[String]): Unit = {
    var x = 0;

    do {
      println(s"Value of x: $x")
      x += 1; // pre/post increment/decrement operators are not allowed in scala.
    } while (x < 10)
  }
}
