package Functions

object Currying {

  // Currying is a technique or process of transforming a fn that takes multiple arguments into a fn that takes a single argument.
  def add(x: Int, y: Int) = x + y;

  // example of currying
  def add2(x: Int) = (y: Int) => x + y;

  // simpler form
  def add3(x: Int)(y: Int) = x + y;

  def main(args: Array[String]): Unit = {
    println(add2(5)(10))

    val add40 = add2(40);
    println(add40(100))

    println(add3(10)(20))

    // val sum50 = add3(50); missing argument list
    val sum50 = add3(50) _; // partial function
    println(sum50(40))
  }
}
