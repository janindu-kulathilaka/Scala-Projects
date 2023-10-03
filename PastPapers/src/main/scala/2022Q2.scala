//object question2 {
//  def fibonacci(x: Int): Int = {
//    if (x == 1) {
//      0
//    }
//    else if (x == 2) {
//      1
//    }
//    else {
//      fibonacci(x-1) + fibonacci(x-2)
//    }
//  }
//
//  def main(args: Array[String]): Unit = {
//
//    print("Enter number to find fibonacci: ")
//    val x = scala.io.StdIn.readInt()
//
//    println(fibonacci(x))
//  }
//}


object examb extends App {
  def f1(x: Int, y: Double) = x * y

  def f2(a: Int, b: Int): Int ={
    if (b == 0) a else f2(b, a % b)
  }

  val f3 = (x: Int) => x*x

  val f4 = (f: Int => Int) => (x: Int) => f3(x)

  def f5(x: Double, y: Int) = x + y

  def f6(x: Int, y: Int): Int = y match {
    case 0 => 1
    case _ => x * f6(x, y-1)
  }

  val f7 = List(12, 24, 16)
  val f8 = f7.reduce((x, y) => f2(x, y))
}

