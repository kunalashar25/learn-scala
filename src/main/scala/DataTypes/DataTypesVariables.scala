package DataTypes

object DataTypesVariables {

  //  Available Types
  //  1 - Byte - 8 bit signed value. Range from -128 to 127
  //  2 - Short - 16 bit signed value. Range -32768 to 32767
  //  3 - Int - 32 bit signed value. Range -2147483648 to 2147483647
  //  4 - Long - 64 bit signed value. -9223372036854775808 to 9223372036854775807
  //  5 - Float - 32 bit IEEE 754 single-precision float
  //  6 - Double - 64 bit IEEE 754 double-precision float
  //  7 - Char - 16 bit unsigned Unicode character. Range from U+0000 to U+FFFF
  //  8 - String - A sequence of Chars
  //  9 - Boolean - Either the literal true or the literal false

  //  Advanced Data Types
  //  10 - Unit - Corresponds to no value
  //  11 - Null - null or empty reference
  //  12 - Nothing - The subtype of every other type; includes no values
  //  13 - Any - The supertype of any type; any object is of type Any
  //  14 - AnyRef - The supertype of any reference type

  //  There are 2 ways of declaring a variable
  //  Way 1: Use var >> Is mutable
  //  Way 2: Use val >> Is Immutable

  //  Syntax
  //  var ${varName}:${dataType} = ${value}
  var a: Int = 10; // ; does not matter at the EOL.
  a = a + 10;
  println(a)

  val b: Int = 30;
  //  b = b + 10; Error >> Reassignment to val
  println(b)

  //  val c: Int; Error >> Only classes can have declared but undefined members

  var d = true; // scala will internally interpret the datatype as boolean

  var e: Double = 12;
  println(e)

  var f = 12f; // w/o datatype 12 will be integer or 12f is float
  println(f)

  //  We can use multiple expressions using curly brackets and perform operation on them at the end
  val sum = {
    val c1: Int = 15; // separate statement by semicolon or next line
    val c2: Int = 20;
    c1 + c2 // result of this expression will be assigned to sum variable
  }
  println(sum)

  //  lazy initialization - https://www.baeldung.com/scala/lazy-val
  lazy val g = 500; // if g is unused, its memory will never be assigned. Memory is assigned only when it will be used for the first time

  def main(args: Array[String]): Unit = {

  }
}
