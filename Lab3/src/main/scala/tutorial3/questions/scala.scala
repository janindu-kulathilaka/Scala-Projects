package tutorial3.questions

object scala {

  //question 01
  def reverseString(string: String): String = {
    var str = ""
    for (letter <- string) {
      str = letter + str
    }
    str
    //in this part first i got string parameter and create variable called str.
    //after that i create a for loop and get one letter at a time from string and add them
    //front of the arr variable after assigning all the letter return that str
  }

  //question 02
  def filterString(strArray : Array[String]): Array[String] = {
    val arr = new Array[String](strArray.length)
    //first create string array same size of the given array
    var count = 0 //this count is for count the number of filter strings
    for (string <- strArray) {
      if (string.length > 5) {
        arr(count) = string
        count += 1
      }
    }

    //create new array with size of the count
    //copy first filter arr to new arr and return new array
    val finalArray = new Array[String](count)
    Array.copy(arr, 0 , finalArray, 0, count)

    finalArray
  }


  //questions 03
  def avgNumber(num1: Float, num2: Float): String = {

    val avg = "%.2f".formatted((num1 + num2) / 2)
  //this %.2f part will show the 2 decimals
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
