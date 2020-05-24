object lab54{
    def df(f: Double => Double) = {
        (x: Double) => {
            val h = 1e-3
            (f(x + h) - f(x)) / h
        }
    }
}