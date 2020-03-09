//domyślnie klasy w Scali są publiczne, w Javie - package
//w Javie - w jednym pliku tylko jedna publiczna klasa, w Scali - wiele
//w Scali nie ma konieczności nazywania pliku tak jak publiczna klasa
//w konstruktorze Scali tworzy się atrybut prywatny i getter

import scala.beans.BeanProperty
class Person (val givenName: String, @BeanProperty var surname: String, protected val id: String){
    def name() = givenName + " " +  surname
}
 object Appl extends App{
     val p = new Person("Jan", "Kowalski", "1234567890")
     println(p.name)
     p.surname = "Nowak"
     println(p.name)
 }

class Int2DVec (val x: Int, val y: Int){
    def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
    def unary_- = new Int2DVec(-x, -y)
    def *(other: Int2DVec) = new Int2DVec(x * other.x, y * other.y)
    def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
    override def toString() = "(" + x.toString + "," + y.toString + ")"

    def this() = {
        this(0,0)
        println("Creating Int2DVec(0,0)")
    }
    def this(prototype: Int2DVec) = {
        this(prototype.x, prototype.y)
        println("Copy-constructor working")
    }
}
object Appl1{
    def main(args: Array[String]){
        val v1 = new Int2DVec(1,2)
        val v2 = new Int2DVec(10,20)
        val v3 = v1 + v2
        val v4 = -v2
        val v5 = v1 * v2
        val v6 = v1 - v2
        println(v3)
        println(v4)
        println(v5)
        println(v6)
        println(new Int2DVec())
        println(new Int2DVec(v1 + v2 + v3))
    }
    // object Int2DVec {
    //     def apply(x: Int, y: Int) = new Int2DVec(x, y)
    //     def apply() = new Int2DVec(0,0)
    //     def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
    // }
}