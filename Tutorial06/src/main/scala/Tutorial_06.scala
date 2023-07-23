object Tutorial_06 {

  def Encryption(string: String): String = {
    var newString = ""

    for (i <- 1 to string.length) {
      newString = newString + string((i + 2)%string.length);
    }

    newString
  }

  def Decryption(string: String): String = {
    var newString = ""

    for (i <- 1 to string.length) {
      newString = newString + string((string.length - 4 + i)%string.length);
    }

    newString
  }

  def

  def main(args: Array[String]): Unit = {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val encryptedStr = Encryption(str)
    println("Encryption: " + encryptedStr)
    val decryptedStr = Decryption(encryptedStr)
    println("Decryption: " + decryptedStr)
  }
}
