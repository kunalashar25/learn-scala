package Functions

object HigherOrderFunctions {

  // HigherOrderFunctions can take functions as arguments
  // HigherOrderFunctions can return functions

  def math(x: Double, y: Double, fn: (Double, Double) => Double): Double = fn(x, y);

  // fn: (Double, Double) => Double >> 3rd parameter will accept a function that can perform some operation and return Double value as result
  // = fn(x, y); >> is when the function is called and operations are performed

  // math(x: Double, y: Double, fn: (Double, Double) => Double): Double >> based in the inner function (3rd param) calculation,
  // end result will also be double which math function will return

  // We can also do function nesting, function inside of a function
  def math2(x: Double, y: Double, z: Double, fn: (Double, Double) => Double): Double = fn(fn(x, y), z);

  // fn(fn(x, y), z) >> Initially, fn(x, y) will be evaluated and will generate a result
  // then fn(result, z) will be evaluated to give final output


  def main(args: Array[String]): Unit = {
    val resultAdd = math(10.5, 20.12, (x, y) => x + y)
    println(resultAdd) // 30.62

    val resultMul = math(10.5, 20.12, (x, y) => x * y)
    println(resultMul)

    val minNum = math(10.5, 20.12, (x, y) => x min y)
    println(minNum)

    val maxNum = math(10.5, 20.12, (x, y) => x max y)
    println(maxNum)

    val min2 = math2(10.5, 20.12, 30.5, (x, y) => x min y)
    println(min2) // 10.5

    val max2 = math2(10.5, 20.12, 30.5, (x, y) => x max y)
    println(max2) // 30.5

    // using wildcard _ for (x, y) => x + y
    val resultAdd2 = math(10.5, 20.12, _ + _) // adding something with something
    println(resultAdd2) // 30.62
  }
}
