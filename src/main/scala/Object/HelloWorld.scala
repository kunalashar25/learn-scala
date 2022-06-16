package Object

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }
}

// Singleton Objects:
// Scala is more object-oriented than Java because in Scala, we cannot have static members.
// Instead, Scala has singleton objects.
// A singleton is a class that can have only one instance, i.e., Object.
// You create singleton using the keyword object instead of class keyword.
// Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor.
// You already have seen all the examples using singleton objects where you called Scala's main method.
