//object question {
//  def sumofOddNumbers(arr: List[Int]): Int = {
//    val oddNumbers = arr.filter(x => x % 2 != 0)
//    val sum = oddNumbers.reduce((x,y) => x + y)
//    sum
//  }
//
//  def main(args: Array[String]): Unit = {
//    val arr = List(1,2,3,4,5,6,7,8,9,10)
//    println(sumofOddNumbers(arr))
//  }
//}

//object questionb {
//  def count(arr:List[Int]): Int = {
//    var numberOfElements = 0;
//    for (i <- arr) {
//      numberOfElements += 1
//    }
//    numberOfElements
//  }
//
//  def main(args: Array[String]): Unit = {
//    val arr = List(1,2,3,4,5,6,7,8,9,10)
//    println(count(arr))
//  }
//}

// object questionc {
//   def absoluteValue(arr: List[Int]): List[Int] = {
//     val absoluteValue = arr.map(x => x.abs)
//     absoluteValue
//   }

//   def main(args: Array[String]): Unit = {
//     val arr = List(2, -4, 3, -1, 23, -4, -54)
//     println(absoluteValue(arr))
//   }
// }


def sumofOddNumbers(arr: List[Int]): Int = {
  arr.filter(_%2!=0).reduce(_+_)
}

def main(args: Array[String]): Unit = {
  val arr = List(1,2,3,4,5,6,7,8,9,10)
  println(sumofOddNumbers(arr))
}