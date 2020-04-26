// Case classes
// Case classes have an apply method by default which takes care of object construction.
// Instances of case classes are compared by structure and not by reference.

class C1(val x: Int)
class SubC1 (x: Int) extends C1(x)

class C2(val x: Int)
case class SubC2(y: Int) extends C2(y)

case class C3(x: Int)
class SubC3(x: Int) extends C3(x)

// Sealed classes
// A sealed trait can be extended only in the same file as its declaration.
// Sealed class is also mostly used in enums.

sealed abstract class S // or sealed trait S
case class SubS1(i: Int) extends S
case class SubS2(d: Double) extends S
case class SubS3(s: String) extends S

object Appl {
    def f(s: S) = s match {
        case SubS1(arg) => println("SubS1(" + arg + ")")
        case SubS2(arg) => println("SubS2(" + arg + ")")
        case SubS3(arg) => println("SubS3(" + arg + ")")
    }
    def main(args: Array[String]) {
        f(new SubS1(42))
        f(new SubS2(1.5))
        f(new SubS3("Aloha!"))
    }
}


// Enumerators

object TrafficLights {
    object TrColor extends Enumeration {
        type TrColor = Value
        val Red, RedYellow, Green, Yellow = Value
    }
    import TrColor._
    var currentColor: TrColor = Red
    def changeTo(trColor: TrColor) = {
        println("Changing to " + trColor.toString + "(" + trColor.id + ")")
        trColor match {
            case Red => println("toRed handler...")
            case RedYellow => println("toRedYellow handler...")
            case Green => println("toGreen handler...")
            case Yellow => println("toYellow handler...")
        }
        currentColor = trColor
} }

object Appl2 {
    import TrafficLights._
    def main(args: Array[String]) {
        changeTo(TrColor.Red)
        for (color <- TrColor.values) {
        changeTo(color)
}}}