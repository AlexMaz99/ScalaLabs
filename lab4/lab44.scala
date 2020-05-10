object Appl44 {
  def sumArrayRec2(elems: Array[Int]) = {
    def goFrom(i: Int, size: Int, elms: Array[Int]): Int = {
      if (i < size) elms(i) + goFrom(i + 1, size, elms)
      else 0
    }
    goFrom(0, elems.size, elems)
  }

  def recurseTest(i: Int, j: Int, arr: Array[Int]): Int = {
    try {
        recurseTest(i + 1, j + 1, arr)
    } catch { case e: java.lang.StackOverflowError =>
        println("Recursion depth on this system is " + i + ".")
        i
    }
  }

  def main(args: Array[String]) {
    val recDepth = recurseTest(0, 0, Array(1))
    println("sumArrayRec2 = " + 
            sumArrayRec2((0 until recDepth).toArray))
  }
}