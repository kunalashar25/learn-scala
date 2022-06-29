package Functions

object Closures {

  // Closure is a function which uses 1 or more variables declared outside of the function
  var num = 10; // can also be called as free variable.

  val add = (x: Int) => x + num; // using num which is declared outside of the function

  //  Pure vs Impure closure
  //  Impure closure variables are stored as var >> value can change from inside the closure or outside
  //  Impure closure variables are stored as val >> value cannot be changed.

  def main(args: Array[String]): Unit = {
    println(add(5)) // 15

    num = 50;
    println(add(5)) // 55

  }
}
