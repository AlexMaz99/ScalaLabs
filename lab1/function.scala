def abs(x: Double): Double = if (x >= 0) x else -x

val absAsFunction1: (Double) => Double = abs

val absAsFunction2 = abs _

def factorial (n: Int):Int = if (n <= 0) 1 else n * factorial(n-1)

def max(a: Int, b: Int): Int = { if(a > b) return a else return b }

def max(a: Int, b: Int) = if (a > b) a else b

def printAll(args: Int*) = {for (arg <- args) println(arg)}
val x = printAll((3 to 4):_*)//splat

def f1(x: Int) = if (x > 0) 1 else 2.3
def f1a(x: Int):Double = if (x > 0) 1 else 2.3

def f2(x: Int) = if (x >= 0) 1 else "x is negative"
def f2(x: Int):Any = if (x >= 0) 1 else "x is negative"