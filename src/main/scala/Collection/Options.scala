package Collection

object Options {

  // It is a container which gives 2 values
  // It can give an instance of SOME or NONE

  val nums = List(1, 2, 3);
  val names = Map(1 -> "Tom", 2 -> "Nick", 3 -> "Harry");

  def main(args: Array[String]): Unit = {
    // find returns options
    println(nums.find(_ > 6)) // find anything greater than 6
    // Output: None as no value is greater than 6

    println(nums.find(_ > 2))
    // Output: Some(3) as there are some values which satisfies the condition

    // to get value out of the sum instance
    println(nums.find(_ > 2).get) // Output: 3

    // get also returns options
    println(names.get(1)) // Output: Some(Tom)

    // to avoid exception while fetching values from map using invalid key
    println(names.get(5).getOrElse("invalid key")) // invalid key

    // defining options
    val opt: Option[Int] = Some(5);
    val opt2: Option[Int] = None;

    println(opt) // Some(5)
    println(opt.isEmpty) // false

    println(opt2) // None
    println(opt2.isEmpty) // true
  }

}
