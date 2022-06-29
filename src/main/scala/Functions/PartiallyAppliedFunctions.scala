package Functions

import java.util.Date;

object PartiallyAppliedFunctions {
  // Fully Applied Function: we pass all function parameter values while calling the function
  // Partially Applied: we pass some function parameter while calling it.

  val sum = (a: Int, b: Int, c: Int) => a + b + c;

  val fn = sum(10, 20, _: Int); // 3rd argument will be passed when we call fn

  val fn2 = sum(10, _: Int, _: Int);

  // real world example
  def log(date: Date, message: String) = {
    println(s"$date $message")
  }

  // assigning new date object everytime it is called and just asking user to pass logMessage
  val partialLog = log(new Date(), _: String)

  def main(args: Array[String]): Unit = {
    println(fn(30)) // 30 is applied to wildcard _ of fn

    println(fn2(100, 30))

    partialLog("Init Logs")
    partialLog("Log 1")
    partialLog("Log 2")
    Thread.sleep(2000)
    partialLog("Log 3")
  }

}
