object Tutorial_06 {

  def Encryption(string: String, shift: Int): String = {
    var newString = ""

    for (i <- 1 to string.length) {
      newString = newString + string((i + shift -1)%string.length);
    }

    newString
  }

  def Decryption(string: String, shift: Int): String = {
    var newString = ""

    for (i <- 1 to string.length) {
      newString = newString + string((string.length - shift - 1 + i)%string.length);
    }

    newString
  }

  def secureString(string: String, shift:Int,  formatter: (String, Int) => String) : String = {
    formatter(string, shift)
  }

  def main(args: Array[String]): Unit = {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    val shift = 3

    val encryptedStr = secureString(str, shift, Encryption)
    println("Encryption: " + encryptedStr)
    val decryptedStr = secureString(encryptedStr,shift, Decryption)
    println("Decryption: " + decryptedStr)
  }
}
