package tutorial3.questions

object scala {

  //question 01
  def reverseString(string: String): String = {
    var str = ""
    for (letter <- string) {
      str = letter + str
    }
    str
  }

  //question 02
  def filterString(strArray : Array[String]): Array[String] = {
    val arr = new Array[String](strArray.length)
    var count = 0
    for (string <- strArray) {
      if (string.length > 5) {
        arr(count) = string
        count += 1
      }
    }
    val finalArray = new Array[String](count)
    Array.copy(arr, 0 , finalArray, 0, count)

    finalArray
  }


  //questions 03
  def avgNumber(num1: Float, num2: Float): String = {

    val avg = "%.2f".formatted((num1 + num2) / 2)

    avg
  }
  def main(args: Array[String]): Unit = {

    //question 01
    println(reverseString("janindu"))

    println()

    //question 02
    val testArr = Array("janindu", "Chathumi", "chat", "mindula", "kasun")
    for (str <- filterString(testArr)){
      print(str + " ")
    }

    println()
    println()

    //question 03
    println(avgNumber(10, 23))
  }
}
