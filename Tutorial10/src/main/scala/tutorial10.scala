object RationalTest {

  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => celsius * 1.8 + 32)
    val totalFarenheit = fahrenheitTemperatures.reduce((total, temp) => total + temp)
    totalFarenheit / fahrenheitTemperatures.length
  }
  def countLetterOccurences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length)
    val totalOccurences = letterCounts.reduce((total, count) => total + count)
    totalOccurences
  }

  def main(args: Array[String]): Unit = {
    val temperatures = List(0, 10, 20, 30)
    val avgTemperature = calculateAverage(temperatures)
    println(s"Average Fahrenheit Temperature: $avgTemperature")

    val words = List("apple", "banana", "cherry", "date")
    val totalOccurences = countLetterOccurences(words)
    println(s"Total count of letter occurences: $totalOccurences")

  }
}
