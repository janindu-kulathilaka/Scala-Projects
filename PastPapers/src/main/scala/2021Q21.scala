// object Question2 {
//   def main(args: Array[String]): Unit = {
//     var total = 1
//     for (i <- 1 until 11) {
//       total *= i
//     }
//     println(total)
//   }
// }

object Question2 {
  def factorialCalc(num: Int): Int = {
    if (num <= 1) {
      1
    }
    else {
      num * factorialCalc(num - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(factorialCalc(1))
  }
}

