package questions

object question {

  def DiskArea(r: Int): Double = {
    val pi = 3.14f
    return pi * r * r
  }

  def TemperatureConvertor(t: Int): Double = {
    return (t * 1.8)  + 32
  }

  def VolumeOfSphere(r: Int): Double = {
    val pi = 3.14
    return (4/3 * pi * (r^3))
  }

  def CalcTotalWholesale(numOfCopies: Int) : Double = {
    val unitPrice = 24.95
    val shopDiscount = 0.4
    val afterdiscount = unitPrice - unitPrice * shopDiscount
    var shippingCost: Double = 3

    if (numOfCopies > 50) {
      shippingCost +=  0.75 * (numOfCopies - 50)
    }

    var totalCost = afterdiscount * numOfCopies + shippingCost

    return totalCost
  }

  def CalcRunningTime(): Int = {
    val easyPace = 8 //8min per km
    val tempo = 7 //7min per km

    return 2 * easyPace + 3 * tempo + 2 * easyPace
  }

  def main(args: Array[String]): Unit = {

    //question 01
    println("Area of Disk: " + DiskArea(5))

    //question 02
    println("Temperature in Fahrenheit: " + TemperatureConvertor(35))

    //question 03
    println("Volume of a sphere: " + VolumeOfSphere(5))

    //question 04
    println("total wholesale cost: "+ CalcTotalWholesale(60))

    //question 05
    println("Total Running time: " + CalcRunningTime())
  }

}
