package Strings

object StringInterpolation {

  //  String Interpolation refers to substitution of defined variables or expressions in a given String with respected values
  // String Interpolation provides an easy way to process String literals.

  //  To apply this feature of Scala, we must follow few rules:
  //    1. String must be defined with starting character as s / f /raw.
  //    2. Variables in the String must have ‘$’ as prefix.
  //    3. Expressions must be enclosed within curly braces ({, }) and ‘$’ is added as prefix.


  def main(args: Array[String]): Unit = {
    val name = "Kunal";
    val age = 30;
    println(name + " is " + age + " years old")

    // using s before the string >> not type safe
    println(s"$name is $age years old")

    // using f before the string >> type safe
    println(f"$name%s is $age%d years old")

    //    println(f"$name%d is $age%d years old")
    //    type mismatch;
    //    found   : String
    //    required: Int
    //    println(f"$name%d is $age%d years old")

    // using raw before the string >> prints it in the raw form
    println(raw"$name%s is \n $age%d years old") // Output: Kunal%s is \n 30%d years old
  }

}
