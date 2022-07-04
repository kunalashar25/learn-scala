package Collection

object MapExample {
  // Map is collection of key-value pair
  // 1. Mutable Map
  // 2. Immutable Map

  val names: Map[Int, String] = Map(100 -> "Max", 101 -> "Sam", 102 -> "Kal", 102 -> "Tom");

  val fruits: Map[Int, String] = Map(201 -> "Apple");

  def main(args: Array[String]): Unit = {
    println(names) // Map(100 -> Max, 101 -> Sam, 102 -> Tom)

    println(names(101)) // Sam

    // println(names(105)) Exception in thread "main" java.util.NoSuchElementException: key not found: 105

    println(names.keys) // Set(100, 101, 102)

    println(names.values) // Iterable(Max, Sam, Tom)

    println(names.isEmpty) // false

    // iterating on the map
    names.keys.foreach {
      key => println(names(key))
    }

    println(names.contains(110)) // false

    // concat map
    println(names ++ fruits) // Map(100 -> Max, 101 -> Sam, 102 -> Tom, 201 -> Apple)

    println(names.size) // 3
  }
}
