object Test {
    import scala.annotation.tailrec

    // always returns "b"
    def f(p: Any) = p match {
        case b => println("b")
        case 1 => println("1")
        case 2 => println("2")
        case _ => println("sth else")
    }

    def sum(elems: Array[Int]) = {
        @tailrec
        def goFrom(i: Int, elems: Array[Int], acc: Int):Int = {
            if (i < elems.size) goFrom(i + 1, elems, elems(i) + acc)
            else acc
        } 
        goFrom(0, elems, 0)
    }

    def printSport(sport: String) = sport match{
        case "tennis" => println("tennis: 2 players")
        case "volleyball" => println("volleyball: 6 players")
        case "baseball" => println("baseball: 9 players")
    }

    def f2(p: Any) = p match{
        case true => println("true")
        case _:Boolean => println("Boolean")
        case _ =>println("Any")
    }

    def min(elems: Array[Int]) = {
        @tailrec
        def goFrom(i: Int, elems: Array[Int], acc: Int): Int = {
            if (i < elems.size) goFrom(i + 1, elems, math.min(acc, elems(i)))
            else acc
        }
        goFrom(1, elems, elems(0))
    }

    def main(args: Array[String]) {
        f(1)
        println(sum(Array(1,2,3)))
        printSport("volleyball")
        f2(2 == 2)
        println(min(Array(5, 2, 1, 8)))
    }
}