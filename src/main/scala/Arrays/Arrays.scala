package Arrays

object Arrays {

  // defining way 1
  val nums: Array[Int] = new Array[Int](4);

  // defining way 2
  val nums2 = new Array[Int](5);

  // defining way 3
  val nums3 = Array(1, 2, 3, 4)

  // Array index starts from 0

  def main(args: Array[String]): Unit = {
    nums(0) = 10;
    nums(1) = 20;
    nums(2) = 30;
    nums(3) = 40;

    for (i <- nums) {
      println(i)
    }

    // concat array
    nums.concat(nums3);

  }
}
