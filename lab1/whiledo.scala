var i = 0
do {
    if (i%2 == 0) println(i)
    i += 1
} while (i < 10)

var i = 0
while (i < 10) {
    if (i%2 == 0) println(i)
    i += 1
}

var i = 0
val doWhileRes = do {println(i); i += 1; true} while (i < 4)
//doWhileRes: Unit = ()