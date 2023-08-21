class Q2_Rational_Subtract(numerator: Int, denominator: Int) {

  def numer: Int = numerator
  def denom: Int = denominator

  def neg: Q2_Rational_Subtract = new Q2_Rational_Subtract(-numer, denom)

  def sub(other: Q2_Rational_Subtract): Q2_Rational_Subtract = {
    new Q2_Rational_Subtract(
      numer * other.denom - other.numer * denom,
      denom * other.denom
    )
  }

  override def toString: String = s"$numer/$denom"
}

object RationalTest1 {
  def main(args: Array[String]): Unit = {
    val x = new Q2_Rational_Subtract(3, 4)
    val y = new Q2_Rational_Subtract(5, 8)
    val z = new Q2_Rational_Subtract(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x = $x")
    println(s"y = $y")
    println(s"z = $z")
    println(s"x - y - z = $result")
  }
}
