object tutorial_08 {

  //Question 01 using lambda functions
  def calcInterestPerYear(depositAmount : Int) : Double = {
    depositAmount match {
      case deposit if deposit <= 20000 => deposit * 0.02
      case deposit if deposit <= 200000 => deposit * 0.04
      case deposit if deposit <= 2000000 => deposit * 0.035
      case deposit => deposit * 0.065
    }

  }

  //Question 02 using lambda functions
  def patternMatching(num: Int): String = {
    num match {
      case n if n <= 0 => "Negative/Zero"
      case n if n%2 == 0 => "Even"
      case n => "Odd"
    }
  }

  def toUpper(string: String): String = {
    string.toUpperCase()
  }

  def toLower(string: String): String = {
    string.toLowerCase()
  }

  def formatNames(str: String)(formatter: String => String): String = {
    formatter(str);
  }

  def main(args: Array[String]): Unit = {

    //Question 01
    println("Question 01")
    println(calcInterestPerYear(25000))
    println()


    //Question 02
    println("Question 02")
    println(patternMatching(-5))
    println(patternMatching(4))
    println(patternMatching(3))
    println()


    //Question 03
    println("Question 03")
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(toUpper))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(toLower))
  }

}
