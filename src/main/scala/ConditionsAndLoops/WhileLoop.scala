package ConditionsAndLoops

object WhileLoop {

  def main(args: Array[String]): Unit = {
    var x = 0;

    while (x < 10) {
      println(s"Value of x: $x")
      x += 1; // pre/post increment/decrement operators are not allowed in scala.
    }
  }
}
