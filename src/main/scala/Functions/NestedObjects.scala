package Functions

object NestedObjects {

  object Math{
    def add(x:Int, y:Int):Int = {
      return x+y;
    }

    def subtract(x:Int,y:Int):Int = {
      println("We will subtract something")
      x-y;
    }

    def square(x:Int) = x*x;
  }

  def main(args: Array[String]): Unit = {
    // As Math is already an Object, we don't need to create a new instance of this object
    // If it is class, we need to create a new Instance (object of the class) with the new keyword.
    println(Math.add(2,5));
    println(Math.subtract(10,20))

    // syntactical sugar for functions with single argument
    // valid operation for calling function with single argument
    // same format is used in for loop example: for (i <- 1 to 5)
    println(Math square 3);
  }

}
