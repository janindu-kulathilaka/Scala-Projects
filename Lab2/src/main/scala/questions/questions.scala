package questions
object questions {
  private def question01(): Unit = {
    var k, i, j = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    var c = 'X'

    val qa = k + 12 * m
    val qb = m / j
    val qc = n % j
    val qd = m / j * j
    val qe = f + 10 * 5 + g
    val qf = (+(+i)) * n

    println("Question 01")

    println(f"a) $qa%d \nb) $qb%d \nc) $qc%d \nd) $qd%d \ne) $qe%.2f \nf) $qf%d")
  }

  private def question02(): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f

    println("\nQuestion 02")
    b -= 1
    val tempD = d
    d -= 1
    print("a) ")
    println(b * a + c * tempD)

    var tempA = a
    a += 1
    print("b) ")
    println(tempA)

    print("c) ")
    println(-2 * (d - k) + c )

    print("d) ")
    c += 1
    println(c)

    c += 1
    tempA = a
    a += 1
    print("e) ")
    println(c * tempA)

  }

  private def question03(): Unit = {

    println("\nQuestion 03")
    val normal_working_hour_salary = 250
    val ot_working_hour_salary = 85

    val normal_working_hours_per_week = 40
    val ot_working_hours_per_week = 30

    val tax = 0.12

    val salary_per_week = normal_working_hour_salary * normal_working_hours_per_week + ot_working_hour_salary * ot_working_hours_per_week
    val tax_per_week = salary_per_week * tax

    val take_home_salary_per_week = salary_per_week - tax_per_week;

    println("Take home salary for week: Rs. " + take_home_salary_per_week)

  }

  private def highest_profit_cal(): Int = {
    val performance_cost = 500
    val attendee_cost = 3

    var ticket_price = 5
    var number_of_attendance = 160

    var profit_temp1 = (ticket_price * number_of_attendance) - performance_cost - (attendee_cost * number_of_attendance)
    ticket_price += 5
    number_of_attendance -= 20
    var profit_temp2 = (ticket_price * number_of_attendance) - performance_cost - (attendee_cost * number_of_attendance)


    while (profit_temp2 > profit_temp1) {
      println(profit_temp1)
      profit_temp1 = profit_temp2
      ticket_price += 5
      number_of_attendance -= 20
      profit_temp2 = (ticket_price * number_of_attendance) - performance_cost - (attendee_cost * number_of_attendance)
    }

    profit_temp1
  }


  def main(args: Array[String]): Unit = {
    question01()
    question02()
    question03()

    println("\nQuestion 04\nHighest Profit: " + highest_profit_cal())
  }
}
