class Q1_Rational(val numer: Int, val denom: Int) {

  def neg: Q1_Rational = new Q1_Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"
}

object RationalTest {
  def main(args: Array[String]): Unit = {
    val x = new Q1_Rational(3, 2)
    val y = new Q1_Rational(3, 4)

    println(s"x = $x")
    println(s"-x = ${x.neg}")

    println(s"y = $y")
    println(s"-y = ${y.neg}")
  }
}
