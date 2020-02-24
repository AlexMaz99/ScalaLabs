for (i <- 1 to 10; x = 2 * i + 1; if (x%3 == 0)) println(i,x)

var i = 1
while (i <= 10) {
    var x = 2 * i + 1
    if (x%3 == 0) println(i,x)
    i += 1
}