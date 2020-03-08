val i = -1
//i: Int = -1
val abs_i = if (i >= 0) i else -i
//abs_i: Int = 1
val ifNoElseRes = if (i >= 0 || i % 2 == 0) println("Nonnegative or even")
//ifNoElseRes: Unit = ()

val i = 1
//i: Int = 1
val ifRes = if (i > 0) i else 0
//ifRes: Int = 1
val halfIfRes1 = if (i > 10) i
//halfIfRes1: AnyVal = ()
val halfIfRes2 = if (i > 10) i else ()
//halfIfRes2: AnyVal = ()