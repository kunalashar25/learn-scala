package Collection

object SetExample {

  // Collection of different elements of same data types
  // Cannot have duplicate value

  // 2 types of sets

  // Mutable
  var nums2: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1, 2, 3, 1, 4, 10)

  // Immutable - by default
  val nums: Set[Int] = Set(1, 2, 3, 1, 4)


  def main(args: Array[String]): Unit = {
    println(nums) // Set(1, 2, 3, 4)

    // creates a new set and prints the value. nums set is not changed
    println(nums + 15) // HashSet(1, 2, 3, 4, 15)
    println(nums) // Set(1, 2, 3, 4)

    // set does not have indexing concept like list
    // to check value present in the set
    println(nums(10)) // false
    println(nums(3)) // true

    println(nums.head) // 1
    println(nums.tail) // Set(2, 3, 4)

    // set concat
    println(nums.concat(nums2)) // HashSet(10, 1, 2, 3, 4)
    println(nums ++ nums2) // HashSet(10, 1, 2, 3, 4)

    // intersection of 2 sets
    println(nums.&(nums2)) // Set(1, 2, 3, 4)
    println(nums.intersect(nums2)) // Set(1, 2, 3, 4)

    // using for loop is same as List apart from using index concept
  }
}
