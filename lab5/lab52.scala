object lab52 {
    val succ1 = (a: Int) => a + 1
    val succ2: (Int) => Int = (a: Int) => a + 1

    val pred = (a: Int) => a - 1

    val maxFrom3 = (a: Int, b: Int, c: Int) => math.max(math.max(a,b), c)
}