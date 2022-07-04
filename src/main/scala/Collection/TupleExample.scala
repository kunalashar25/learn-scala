package Collection

object TupleExample {

  // It is class that can contains different types of element unlike List or Set
  // Tuples are immutable and are of fixed size

  val values = (1, "Apple", true, 2, false, "Welcome");

  // defining tuple with length => new Tuple${# of elements}
  val data = new Tuple3(1, "Apple", true);
  val data2 = new Tuple5(1, "Apple", true, 2, 4);

  // A Tuple can contain max of 22 elements

  def main(args: Array[String]): Unit = {
    println(values) // (1,Apple,true,2,false,Welcome)

    println(values._2); // Apple

    // iterating on tuple
    values.productIterator.foreach {
      value => println(value)
    }

    // 1 key/value in Map represents a Tuple
    println(1 -> "Tom") // (1,Tom)

    // Tuple only works for 2 elements, if we provide more then it creates nested tuple
    println(1 -> "Tom" -> true) // ((1,Tom),true)

    // nested tuple example
    val data3 = new Tuple3(1, "Apple", (true, 2));
    println(data3._3._2) // 2

  }

}
