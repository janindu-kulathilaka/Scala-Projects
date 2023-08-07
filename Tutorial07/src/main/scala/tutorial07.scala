
object tutorial07 {

  //question 01
  def filterEvenNumbers(numbers: List[Int]): List[Int] ={
    //this is the lambda function
    //from numbers list this function will get one number at a time
    //and cheack weather it is even or not
    //if it is even then that number will added to the list
    numbers.filter(x=> x%2 == 0)
  }

  //question 02
  def calculateSquare(numbers: List[Int]): List[Int] = {
    //this is the lambda function
    //from numbers list this function will get one number at a time
    //and get the square root and add to the list
    numbers.map(x => x*x)
  }

  //question 03

  def isPrime(number: Int): Boolean = {
    if (number <= 1 ) false
    else if (number == 2) true
    else !(2 until number).exists(x => number % x == 0)
  }
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }


  def main(args: Array[String]): Unit = {

    //question 01 inputs
    val numberList1 = List(1,2,3,4,5,6,7,8,9,10)

    println("Even number list: " + filterEvenNumbers(numberList1).toString())

    //question 02 inputs
    val numberList2 = List(1,2,3,4,5)

    println("Square of the number list: " + calculateSquare(numberList2).toString())

    //question 03 inputs
    val numberList3 = List(1,2,3,4,5,6,7,8,9,10)

    println("Prime numbers list: " + filterPrime(numberList3).toString())
  }
}
