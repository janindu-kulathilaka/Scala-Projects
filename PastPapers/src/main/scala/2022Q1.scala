//object exam extends App {
//  def f1(x: Int, y:Double) = x * y
//    def f2(x: Double, y:Int) = x + y
//
//  def f3(x: Double, y:Int) = x - y
//
//  val x = f3(f2(f1(2, 3), 4), 5)
//
//  println(x)
//}

//object exam2 extends App {
//  val f1 = (x: Int, y:Int) => x * y
//  val x = List(1,2,3,4,5)
//  val y = x.map(x => f1(x, 2))
//  println(y)
//}

//object exam3 extends App {
//  val f1 = (x: Int, y:Int) => x * y
//  val f2 = (x: Int, y:Int) => x + y
//  val x = List(1,2,3,4,5)
//  val y = x.map(x => f1(x, 2)).reduce(f2)
//  println(y)
//}

//object exam4 extends App {
//  val pi = 3.14
//  val double = (x: Double) => x * x
//  val area = (x: Double) => pi * double(x)
//  println(area(5))
//}

//object Exam5 extends App {
//  val fx = (x: Int) => (y: Int) => (x, y)
//  println(s"Step 1: Defined fx function: fx = (x: Int) => (y: Int) => (x, y)")
//
//  val x = List(1, 2, 3, 4, 5)
//  println(s"Step 2: Created list x: $x")
//
//  val y = x.map(x => fx(1)(x))
//  println(s"Step 3: Applied fx function to each element of x: y = $y")
//
//  val z = y.reduce((x, y) => (x._1 + y._1, x._2 + y._2))
//  println(s"Step 4: Reduced the list y by summing the tuples: z = $z")
//
//  println(s"Final Output: $z")
//}


//object exam6  extends App {
//  val fx = (x: Int) =>
//      if (x % 2 == 0) false else  true
//  val lx = List(1,2,3,4,5,6,7,8)
//  val lfx = lx.filter(fx).map(_ * 2)
//  println(lfx)
//}

//object exam7 extends App {
//  case class Point(x: Int, y: Int) {
//    val f = (x: Int, y: Int) => x + y
//    val op = (that: Point) => {
//      Point(f(that.x, this.y), f(that.y, this.x))
//    }
//  }
//    val p1 = Point(2,3)
//    val p2 = Point(3,4)
//
//    println(p1.op(p2))
//
//}

//object exam8 extends App {
//  val cube = (x: Int) => x * x * x
//  val square = (x: Int) => x * x
//  val print = (f:Int => Int) => (x:Int) => f(x)
//  println(print(cube)(square(2)))
//}

//object exam9 extends App {
//  def fx(n:Int):Boolean = n match {
//    case 0 => true
//    case _ => fy(n-1)
//  }
//
//  def fy(n: Int):Boolean = ! (fx(n))
//    val l = List(1,2,3,4,5,6,7)
//    println(l.filter(fy))
//}

object exam10 extends App {
  def fx(a: Int, b: Int) : Int = if (b == 0 ) a else fx(b, a % b)
  val l1 = List(12, 24, 16)
  val l2 = l1.reduce((x, y) => fx(x, y))
  println(l2)
}

