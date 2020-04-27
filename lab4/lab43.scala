object Appl43 {
  def checkPredicate(pred: Boolean,
                        predAsString: String,
                        prefix: String = "Checking if ") {
        if (pred) println(prefix + predAsString + ": OK")
        else println(prefix + predAsString + ": Fail")
    }
  def maxIter(elems: Array[Int]) = {
        var max = elems(0)
        for (i <- elems) if (i > max) max = i
        max
  }
  def maxRec1(i: Int, maxEl: Int, elems: Array[Int]): Int = {
        if (i < elems.size) maxRec1(i + 1, math.max(maxEl, elems(i)), elems)
        else maxEl
  }
  def maxRec2(elems: Array[Int]) = {
        def goFrom(i: Int, maxEl: Int, size: Int): Int = {
            if (i < size) goFrom(i + 1, math.max(maxEl, elems(i)), size)
            else maxEl
        }
        goFrom(0, elems(0), elems.size)
  }
  def main(args: Array[String]) {
        val arr1 = Array(3, 12, 43, 4, 10)
        println("Testing with arr1 = " +
                arr1.mkString("Array(", ", ", ") ..."))
        val expectResult = 43
        checkPredicate(maxIter(arr1) == expectResult,
                    "maxIter(arr1) == " + expectResult)
        checkPredicate(maxRec1(0, arr1(0), arr1) == expectResult,
                    "maxRec1(0,arr1(0), arr1) == " + expectResult)
        checkPredicate(maxRec2(arr1) == expectResult,
                    "maxRec2(arr1) == " + expectResult)
  }
}