object Appl51{
    class Pred extends Function1[Int, Int] {
        def apply(a: Int) = a - 1
    }

    def main(args: Array[String]) {
        val pred = new Pred
        println(pred.apply(5))
        println(pred(5))
  }
}