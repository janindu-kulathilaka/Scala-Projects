// object Question2 {
//   def main(args: Array[String]): Unit = {
//     var total = 1
//     for (i <- 1 until 11) {
//       total *= i
//     }
//     println(total)
//   }
// }

// object Question2 {
//   def factorialCalc(num: Int): Int = {
//     if (num <= 1) {
//       1
//     }
//     else {
//       num * factorialCalc(num - 1)
//     }
//   }

//   def main(args: Array[String]): Unit = {
//     println(factorialCalc(1))
//   }
// }

// object Question2 {
//   def isPrime(n: Int): Boolean = {
//     var i = 2
//     while (i < n) {
//       if (n % i == 0) {
//         return false
//       }
//       i += 1
//     }
//     return true
//   }

//   def main(args: Array[String]): Unit = {
//     println(isPrime(13))
//   }
// }

// object Question2 {
//   def main(args: Array[String]): Unit = {
//     val arr = List(10, 20, 30, 5, 11, 23, 2)
//     var minimum = arr(0)
//     var maximum = arr(0)
//     var length = 0

//     for (num <- arr) {
//       if (num < minimum) {
//         minimum = num
//       }
//       if (num > maximum) {
//         maximum = num
//       }
//       length += 1
//     }

//     println("Minimum: " + minimum)
//     println("Maximum: " + maximum)
//     println("Length: " + length)
//   }
// }

// object Question2 {
//   def main(args: Array[String]): Unit = {
//     val arr = List(1,2,3,4,5, 6)
//     val arr2 = arr.filter(x => x%3 == 0)
//     println(arr2)
//   }
// }

object Question2 {
  def main(args: Array[String]): Unit = {
    val arr = List("A", "BB", "CCC", "DDDD", "EEEEE")
    for (string <- arr){
      println(string + "-" + string.length)
    }
  }
}

