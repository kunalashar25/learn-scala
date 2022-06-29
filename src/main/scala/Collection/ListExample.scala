package Collection

object ListExample {

  // collection of similar data type
  // List are immutable and it represents Linked List

  val nums: List[Int] = List(1, 2, 3, 4);

  def main(args: Array[String]): Unit = {
    println(nums) // List(1, 2, 3, 4)

    // :: operator is generally used to prepend a single element to the list. It returns the new list with the added element.
    println(10 :: nums) // List(10, 1, 2, 3, 4)

    println(Nil) // List() >> represents empty list
    println(1 :: 2 :: 3 :: Nil) // List(1, 2, 3)

    // first value of the list
    println(nums.head) // 1

    // list w/o first element
    println(nums.tail) // List(2, 3, 4)

    println(nums.isEmpty) // false
    println(Nil.isEmpty) // true

    println(nums.reverse) // List(4, 3, 2, 1)

    // generating list at runtime
    println(List.fill(5)(2)) // 5 is length, 2 is value Output: List(2, 2, 2, 2, 2)

    // max value in the list
    println(nums.max) // 4

    // iterating on the list with foreach
    nums.foreach(num => println(num))

    // sum of elements
    var sum: Int = 0;
    nums.foreach(sum += _); // will iterate on each element and add it to sum variable
    println(sum)

    // iterating with for
    for (num <- nums) {
      print(num)
    }

    // fetch value using index
    print(nums(0))
  }

}
