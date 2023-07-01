package Lab4

object tutorial {

  // Question 01
  def calacInterest(deposit : Int): Double = {
      if (deposit <= 20000) {
        val interestPresentage = 0.02
        deposit * interestPresentage
      }

      else if (deposit <= 200000){
        val interestPersentage = 0.04
        deposit * interestPersentage
      }

      else if (deposit <= 2000000){
        val interestPersentage = 0.035
        deposit * interestPersentage
      }

      else{
        val interestPersentage = 0.065
        deposit * interestPersentage
      }
  }

  // Question 02
  def patternMatching(number: Int): Unit = {
    if (number <= 0) {
      println("Negative/Zero")
    }
    else{
      if (number % 2 == 0){
        println("Even Number")
      }
      else {
        println("Odd Number")
      }
    }
  }
  

  def main(args: Array[String]): Unit = {

    //Question 01
    val deposit1 = 18000;
    println("Annual Interest for " + deposit1 + ": " +  calacInterest(deposit1))
    val deposit2 = 180000;
    println("Annual Interest for " + deposit2 + ": " + calacInterest(deposit2))
    val deposit3 = 1800000;
    println("Annual Interest for " + deposit3 + ": " + calacInterest(deposit3))
    val deposit4 = 18000000;
    println("Annual Interest for " + deposit4 + ": " + calacInterest(deposit4))

    println(" ")

    //Question 02
    patternMatching(-1)
    patternMatching(0)
    patternMatching(4)
    patternMatching(7)

  }

}
