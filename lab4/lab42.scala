import scala.math.pow

object Appl42 {
    def checkPredicate(pred: Boolean,
                        predAsString: String,
                        prefix: String = "Checking if ") {
        if (pred) println(prefix + predAsString + ": OK")
        else println(prefix + predAsString + ": Fail")
    }
    def sumArrayIter(elems: Array[Int]) = {
        var sum = 0
        for (i <- elems) sum += i
        sum
    }
    def sumArrayRec1(i: Int, elems: Array[Int]): Int = {
        if (i < elems.size) elems(i) + sumArrayRec1(i + 1, elems)
        else 0
    }
    def sumArrayRec2(elems: Array[Int]) = {
        val size = elems.size
        def goFrom(i: Int): Int = {
            if (i < size) elems(i) + goFrom(i + 1)
            else 0
        }
        goFrom(0)
    }

    def sumSqrArrayIter(elems: Array[Int]) = {
        var sum = 0
        for (i <- elems) sum += pow(i, 2).intValue
        sum
    }
    def sumSqrArrayRec1(i: Int, elems: Array[Int]): Int = {
        if (i < elems.size) pow(elems(i), 2).intValue + sumSqrArrayRec1(i + 1, elems)
        else 0
    }
    def sumSqrArrayRec2(elems: Array[Int]) = {
        val size = elems.size
        def goFrom(i: Int): Int = {
            if (i < size) pow(elems(i), 2).intValue + goFrom(i + 1)
            else 0
        }
        goFrom(0)
    }

    def prodArrayIter(elems: Array[Int]) = {
        var prod = 1
        for (i <- elems) prod *= i
        prod
    }
    def prodArrayRec1(i: Int, elems: Array[Int]): Int = {
        if (i < elems.size) elems(i) * prodArrayRec1(i + 1, elems)
        else 1
    }
    def prodArrayRec2(elems: Array[Int]) = {
        val size = elems.size
        def goFrom(i: Int): Int = {
            if (i < size) elems(i) * goFrom(i + 1)
            else 1
        }
        goFrom(0)
    }

    def sumAbsArrayIter(elems: Array[Int]) = {
        var sum = 0
        for (i <- elems) sum += i.abs
        sum
    }
    def sumAbsArrayRec1(i: Int, elems: Array[Int]): Int = {
        if (i < elems.size) elems(i).abs + sumAbsArrayRec1(i + 1, elems)
        else 0
    }
    def sumAbsArrayRec2(elems: Array[Int]) = {
        val size = elems.size
        def goFrom(i: Int): Int = {
            if (i < size) elems(i).abs + goFrom(i + 1)
            else 0
        }
        goFrom(0)
    }

    def main(args: Array[String]) {
        val a1To5 = (1 to 5).toArray
        println("Testing with a1To5 = " +
                a1To5.mkString("Array(", ", ", ") ..."))
        val expectResult = 15
        checkPredicate(sumArrayIter(a1To5) == expectResult,
                    "sumArrayIter(0, a1To5) == " + expectResult)
        checkPredicate(sumArrayRec1(0, a1To5) == expectResult,
                    "sumArrayRec1(0, a1To5) == " + expectResult)
        checkPredicate(sumArrayRec2(a1To5) == expectResult,
                    "sumArrayRec2(a1To5) == " + expectResult)
        
        val expectResultSqr = 55
        checkPredicate(sumSqrArrayIter(a1To5) == expectResultSqr,
                    "sumSqrArrayIter(0, a1To5) == " + expectResultSqr)
        checkPredicate(sumSqrArrayRec1(0, a1To5) == expectResultSqr,
                    "sumSqrArrayRec1(0, a1To5) == " + expectResultSqr)
        checkPredicate(sumSqrArrayRec2(a1To5) == expectResultSqr,
                    "sumSqrArrayRec2(a1To5) == " + expectResultSqr)
        
        val expectResultProd = 120
        checkPredicate(prodArrayIter(a1To5) == expectResultProd,
                    "prodArrayIter(0, a1To5) == " + expectResultProd)
        checkPredicate(prodArrayRec1(0, a1To5) == expectResultProd,
                    "prodArrayRec1(0, a1To5) == " + expectResultProd)
        checkPredicate(prodArrayRec2(a1To5) == expectResultProd,
                    "prodArrayRec2(a1To5) == " + expectResultProd)
        
        val a1To5Abs = Array(-1, 2, -3, 4, -5)
        println("Testing with a1To5Abs = " +
                a1To5Abs.mkString("Array(", ", ", ") ..."))
        val expectResultAbs = 15
        checkPredicate(sumAbsArrayIter(a1To5Abs) == expectResultAbs,
                    "sumAbsArrayIter(0, a1To5Abs) == " + expectResultAbs)
        checkPredicate(sumAbsArrayRec1(0, a1To5Abs) == expectResultAbs,
                    "sumAbsArrayRec1(0, a1To5Abs) == " + expectResultAbs)
        checkPredicate(sumAbsArrayRec2(a1To5Abs) == expectResultAbs,
                    "sumAbsArrayRec2(a1To5Abs) == " + expectResultAbs)
    }
}

