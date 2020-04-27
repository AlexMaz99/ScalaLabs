object Appl41 {
  def factorial(n: Int): Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def fibb(n: Int): Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) n
    else fibb(n - 2) + fibb(n - 1)
  }

  def main(args: Array[String]) {
    println("5! = " + factorial(5))
    println("Fibb(10) = " + fibb(10))
  }
}