package Functions

object AnonymousFunctions {

  // In scala, Functions are treated as first class citizens.
  // We can assign a function to a variable using anonymous function.

  def main(args: Array[String]): Unit = {
    // add is a variable in this case and not a function
    // there is no function name. Hence, anonymous function
    var add = (x: Int, y: Int) => x + y;

    println(add(10, 20))
  }
}
