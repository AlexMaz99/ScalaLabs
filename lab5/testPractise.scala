object test{

    // closure
    def df(f: Double => Double, h: Double): Double => Double = {
        (x: Double) => (f(x + h) - f(x - h)) / (2 * h))
    }

    def sumabc(a: Int)(b: Int)(c: Int) = a + b + c
    val suma = sumabc(1)(_: Int)(_: Int)
    val sumab = suma(2, _: Int)
    val sumabc2 = sumab(3)
}