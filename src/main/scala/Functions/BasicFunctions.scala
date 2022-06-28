package Functions

object BasicFunctions {

  // Function is a group of statement that performs a particular task.
  // Usually written for piece of code that repeats itself.

  // Syntax 1: With return keyword
  /*  def ${functionName}(arg1:datatype,arg2:datatype) : ${returnDataType} = {
        return something
     }
  */

  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  // Scala is flexible and allows us to define the functions in different ways

  // Syntax 2: without return keyword
  /*  def ${functionName}(arg1:datatype,arg2:datatype) : ${returnDataType} = {
      No need to write return keyword
      last line of the function will be implicitly marked with return keyword
  }
  */

  def subtract(x: Int, y: Int): Int = {
    println("We will subtract something")
    x - y;
  }

  // Syntax 3: No need for curly brackets for short function
  /*  def ${functionName}(arg1:datatype,arg2:datatype) : ${returnDataType} = return something;
  * */

  def multiply(x: Int, y: Int): Int = x * y;

  // Syntax 4: Can avoid writing return type if we know the result for certain
  /*  def ${functionName}(arg1:datatype,arg2:datatype) = return something;
  */

  def divide(x: Int, y: Int) = x / y;

  // Syntax 5: Function that does not return anything
  // Unit means void
  def print(x: Int, y: Int): Unit = {
    println(s"Value of x is $x and Value of y is $y")
  }

  def main(args: Array[String]): Unit = {
    println(add(2, 5))
    println(subtract(10, 4))
    println(multiply(10, 2))
    println(divide(10, 5))
    print(10, 20)
  }
}
