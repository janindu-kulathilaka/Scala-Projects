class Q3_Account(val accID: Int, var balance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited: $amount.")
      println(s"New Balance of Your Account is $balance")
    } else {
      println("Invalid Amount for deposit")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"You have withdrawn $amount.")
      println(s"New Balance of Your Account is $balance.")
    } else {
      println("Insufficient amount to withdraw")
    }
  }

  def transfer(amount: Double, targetAccount: Q3_Account): Unit = {
    if (amount > 0 && amount <= balance) {
      targetAccount.deposit(amount)
      println(s"$amount Transferred")
      balance -= amount
    } else {
      println("Amount cannot be transferred")
    }
  }
}

object AccountTest {
  def main(args: Array[String]): Unit = {
    val account1 = new Q3_Account(1, 10000.0)
    val account2 = new Q3_Account(2, 5000.0)

    def printBalances(): Unit = {
      println(s"Account 1 Balance: ${account1.balance}")
      println(s"Account 2 Balance: ${account2.balance}")
    }

    println("Initial Balances:")
    printBalances()

    account1.deposit(2000.0)
    account2.withdraw(1000.0)

    println("\nBalances after Transactions:")
    printBalances()

    account1.transfer(3000.0, account2)

    println("\nBalances after Transfer:")
    printBalances()
  }
}
