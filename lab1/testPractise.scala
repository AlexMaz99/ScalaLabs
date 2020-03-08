//1.
//(int x = 3 in java) == (var x = 2 in Scala)

//2.
for(i <- 1 until 5; j <- i to 3) println(j, i)
// the last pair is (3,3)

//3.
def fun(uLim1: Int, uLim2: Int, b: Double) = { 
    for(i <- 0 to uLim1; j <- 0 until uLim2) println(2 * (i + j) * b)}

//4.
for(i <- 1 until 7; if(i%2 == 0)) yield(i*i)
// returns IndexedSeq[Int] = Vector(4, 16, 36)

//5.
def sumcub(a: Int, b: Int): Int = {
    var sum: Int = 0
    for (i <- a until b) sum += i * i + 1
    return sum
}

//6.
for (i <- 1 to 10) yield(2 * i)

//7.
def abs(x: Double) = if (x >= 0) x else -x

//8.
def sumAbs(args: Int*):Int = {
    var sum: Int = 0
    for (arg <- args){
        if (arg >= 0) sum += arg
        else sum = sum - arg
    }
    return sum
}

//9.
def f(a: Int, b: Int): Int = {
    var sum: Int = 0
    for (i <- a until b) sum += i
    return sum
}

//10.
for(i <- (0 until 10).toArray)yield(i)