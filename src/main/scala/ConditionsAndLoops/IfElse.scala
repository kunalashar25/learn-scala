package ConditionsAndLoops

object IfElse {

  def main(args: Array[String]): Unit = {
    //    Using as statements
    val x = 20;
    var res = "";

    if (x == 20) {
      res = "equals";
    } else {
      res = "not equals";
    }

    println(res);

    //    Using as expressions
    val res2 = if (x != 20) "x == 20" else "x != 20"
    println(res2)

    println(if (x <= 20) "x <=20 " else "x >= 20") // expression can be used directly inside println()

    //    Can also use logical operators && , ||
  }
}
