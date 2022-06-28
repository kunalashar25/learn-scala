package Functions

object OperatorAsFunctionNames {

  // We are allowed to declare function names with operator.
  // It is not operator overloading
  // +,-,/ are not an operators but a function in scala. To understand better, try to hover over + while adding 2 numbers or refer https://youtu.be/CHc_hzNKYOI?t=347

  object Math {
    def +(x: Int, y: Int): Int = {
      return x + y;
    }

    def -(x: Int, y: Int): Int = {
      println("We will subtract something")
      x - y;
    }

    def ^(x: Int) = x * x;
  }

  def main(args: Array[String]): Unit = {
    println(Math.+(10, 20))
    println(Math.-(10, 20))
    println(Math.^(10))
  }

}
