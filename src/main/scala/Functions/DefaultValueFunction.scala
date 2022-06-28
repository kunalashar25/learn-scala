package Functions

object DefaultValueFunction {

  object Math {
    def add(x: Int = 45, y: Int = 15): Int = {
      return x + y;
    }
  }

  def main(args: Array[String]): Unit = {
    println(Math.add()) // Output: 60
    println(Math.add(80)) // Output: 95
    println(Math.add(80, 20)) // Output: 100
  }
}
