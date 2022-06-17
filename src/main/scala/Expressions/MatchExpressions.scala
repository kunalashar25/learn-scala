package Expressions

object MatchExpressions {

  //  Can be used to select between multiple alternatives, Similar to switch in java

  def main(args: Array[String]): Unit = {
    val age = 200;

    age match {
      case 18 => println("I'm 18")
      case 20 => println("I'm 20")
      case 25 => println("I'm 25")
      case _ => println("I'm invincible") // default case
    }

    //    using match as expression
    val res = age match {
      case 18 => "I'm 18"
      case 20 => "I'm 20"
      case 25 => "I'm 25"
      case _ => "I'm invincible" // default case
    }
    println(res);

    // grouping case
    var i = 50;
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("We are Odd")
      case 2 | 4 | 6 | 8 | 10 => println("We are Even")
      case _ => println("You do not belong")
    }

  }

}
