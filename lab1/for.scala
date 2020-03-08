val expr1 = 1 to 3
//expr: scala.collection.immutable.Range.Inclusive = Range 1 to 3

val expr2 = 1 until 3
//expr2: scala.collection.immutable.Range = Range 1 until 3

val forLoopRes = for (i <- 1 to 10; x = 2 * i + 1; if (x % 3 == 0)) {println(i, x); i}
//forLoopRes: Unit = ()