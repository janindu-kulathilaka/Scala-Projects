package Lab4

object tutorial {

  // Question 01
  // In this part i get parameter integer parameter
  // after that if else statements filter them out first one if less than or equal to 20,000 interest presentage 2% and less than or equal to 200,000 interest precentage 4% and so on.
  // after that presentage will multiply with the deposit amount and return the yearly interest
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
  // first as input getting int parameter and using if statement check number is less than or equal to 0 if it is return "Negative/Zero"
  // if it is not then check balance when divide that number by 2 if it is 0 then return "EVEN Number" if it is 1 then return "ODD Number"
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

  //Question 03

  //in first funtion getting string parameter and using toUpperCase pre defined function get upper case letters for input and return the output
  //in second function same theory using toLowerCase return output
  //in third funciton getting two parameters. first one is normal string parameter and second one is functional parameter it will get the input data as a function
  def toUpper(name : String): String = {
    val strUpper = name.toUpperCase

    strUpper
  }

  def toLower(name : String): String = {
    val strLower = name.toLowerCase

    strLower
  }

  def formatNames(name : String, formatter: String => String ) : String = {
    formatter(name)
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

    println()


    //Question 03
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    for (name <- names){
      val upperCaseName = formatNames(name, toUpper)
      val lowerCaseName = formatNames(name, toLower)

      println(upperCaseName)
      println(lowerCaseName)

      println()
    }

  }

}
