//object questiona {
//  def mergeString(str1: String, str2: String): String = {
//    var str3 = ""
//
//    for (i <- 0 until str1.length()) {
//      str3 += str1(i)
//      str3 += str2(i)
//    }
//
//    str3
//  }
//
//  def main(args: Array[String]): Unit = {
//    print("Enter first string: ")
//    val str1 = scala.io.StdIn.readLine()
//
//    print("Enter second string: ")
//    val str2 = scala.io.StdIn.readLine()
//
//    println(mergeString(str1, str2))
//  }
//}

object questionb {
  case class Person(name: String, age: Int){
    override def toString(): String = {
      name + " is " + age + " years old."
    }
  };

  def main(args: Array[String]): Unit = {
    val children = List(Person("Nuwan", 9), Person("Kulunu", 8), Person("Chamal", 11), Person("Nimal", 13))

    val sortedArray = children.sortBy(_.age).reverse

    for (i <- sortedArray) {
      println(i)
    }
  }
}