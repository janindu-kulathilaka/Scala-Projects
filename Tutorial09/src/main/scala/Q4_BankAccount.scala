
class Q4_BankAccount(val id: Int, var balance: Double)

class BankFunctions {

  type Bank = List[Q4_BankAccount]

  def filterNegativeAccounts(bank: Bank): Bank = {
    bank.filter(_.balance < 0)
  }

  def calculateTotalBalance(bank: Bank): Double = {
    bank.map(_.balance).sum
  }

  def applyInterest(bank: Bank): Bank = {
    bank.map { account =>
      if (account.balance > 0) {
        account.balance *= 1.05
      } else {
        account.balance *= 1.10
      }
      account
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val bankFunctions = new BankFunctions()

    val accounts = List(
      new Q4_BankAccount(1, 10000),
      new Q4_BankAccount(2, -1000),
      new Q4_BankAccount(3, 20000),
      new Q4_BankAccount(4, 5000),
      new Q4_BankAccount(5, -2000)
    )

    println("Accounts with negative balances:")
    val negativeBalances = bankFunctions.filterNegativeAccounts(accounts)
    negativeBalances.foreach(account => println(s"Account ${account.id}: ${account.balance}"))

    val totalBalance = bankFunctions.calculateTotalBalance(accounts)
    println(s"Total balance of all accounts: $totalBalance")

    println("Final balances after applying interest:")
    val finalBalances = bankFunctions.applyInterest(accounts)
    finalBalances.foreach(account => println(s"Account ${account.id}: ${account.balance}"))
  }
}
