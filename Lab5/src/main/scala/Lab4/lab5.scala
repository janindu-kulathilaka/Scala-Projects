package Lab4;

object lab4 {

  //Question 01
  def prime(n: Int): Boolean = {
    //in here getting two integer parameters one is main number and decrement number
    //this recursive function will run until one of the condition proven
    //and it will return true or false
    //if it returns true it means main number can divided from another number
    //other that 1 or it's own
    //then it's not a prime number then return false from main funtion
    //if isDivisible function return false it is prime number then return true to
    //main function
    def isDivisible(mainNumber: Int, decrementNumber: Int): Boolean = {
      if (decrementNumber == 1)
        false
      else if (mainNumber % decrementNumber == 0)
        true
      else
        isDivisible(mainNumber, decrementNumber - 1)
    }

    if (n <= 1)
      false
    else
      !isDivisible(n,n-1)
    }


  //Question 02
  def primeSeq(n: Int, i: Int = 2): Unit = {

    if (i < n) {
      if (prime(i))
        print(i + " ")


      primeSeq(n, i+1)
    }

  }

  //Question 03
  def sum(n: Int): Int = {
    if (n <= 0)
      0
    else
      n + sum(n-1)
  }


  //Question 04

  def isEvenOrOdd(n: Int): Unit = {
    if (n == 0)
      println("even") //even
    else if (n == 1)
      println("odd") //odd
    else if (n < 0)
      isEvenOrOdd(-n)
    else
      isEvenOrOdd(n-2)
  }

  //Question 05

  def sumOfEven(n: Int): Int = {
    if (n <=0 )
      0
    else if (n % 2 != 0)
      sumOfEven(n-1)
    else
      n + sumOfEven(n-2)
  }

  //Question 06
  def printFibonacci(n: Int): List[Int] = {
    if (n <= 0) {
      Nil
    } else if (n == 1) {
      List(0)
    } else if (n == 2) {
      List(0, 1)
    } else {
      val fibonacciList = printFibonacci(n - 1)
      val nextNumber = fibonacciList(n - 2) + fibonacciList(n - 3)
      fibonacciList :+ nextNumber
    }
  }




  def main(args: Array[String]): Unit = {

    //Question 01
    println("Is number 5 prime number: "+prime(5))
    println("Is number 8 prime number: "+prime(8))

    println()
    //Question 02
    primeSeq(10)

    println()
    println()
    //Question 03
    println("Sum 1 to 5: " +sum(5))

    println()
    //Question 04
    print("Number 5 is ")
    isEvenOrOdd(5)
    print("Number 6 is ")
    isEvenOrOdd(6)


    println()
    //Question 05
    println("Sum of the even numbers less than 7: "+sumOfEven(7))


    println()
    //Question 06
    val n = 8
    val fibonacciSequence = printFibonacci(n)
    println("The first "+ n +" Fibonacci numbers are:"+ fibonacciSequence);
  }
}