import scala.math.pow
object Appl531 {
  def genSumArray(elems: Array[Int], f: (Int) => Int) = {
    var sum = 0
    for (e <- elems) sum += f(e)
    sum
  }

  def sum(elems: Array[Int]) = genSumArray(elems, (e: Int) => e)

  def sumSqr(elems: Array[Int]) = genSumArray(elems, (e: Int) => pow(e, 2).intValue)

  def sumCube(elems: Array[Int]) = genSumArray(elems, (e: Int) => pow(e, 3).intValue)

  def sumAbs(elems: Array[Int]) = genSumArray(elems, (e: Int) => e.abs)

  def main(args: Array[String]) {
    val a = Array(1,2,3,4,-5)
    println("sum(a) = " + sum(a))
    println("sumSqr(a) = " + sumSqr(a))
    println("sumCube(a) = " + sumCube(a))
    println("sumAbs(a) = " + sumAbs(a))
  }
}