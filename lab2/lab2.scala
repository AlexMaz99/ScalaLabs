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
     p.setSurname("Nowak");
     println(p.getSurname())
}

class Int2DVec private (val x: Int, val y: Int){
    def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
    def unary_- = new Int2DVec(-x, -y)
    def *(other: Int2DVec) = new Int2DVec(x * other.x, y * other.y)
    def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
    override def toString() = "(" + x.toString + "," + y.toString + ")"

    // Auxiliary constructors
    // def this() = {
    //     this(0,0)
    //     println("Creating Int2DVec(0,0)")
    // }
    // def this(prototype: Int2DVec) = {
    //     this(prototype.x, prototype.y)
    //     println("Copy-constructor working")
    // }
}

object Appl1{
    def main(args: Array[String]){
        // val v1 = new Int2DVec(1,2)
        // val v2 = new Int2DVec(10,20)
        val v1 = Int2DVec(1,2)
        val v2 = Int2DVec(10,20)
        val v3 = v1 + v2
        val v4 = -v2
        val v5 = v1 * v2
        val v6 = v1 - v2
        println(v3)
        println(v4)
        println(v5)
        println(v6)
        println(Int2DVec())
        println(Int2DVec(v1 + v2 + v3))
    }
}

object Int2DVec {
    def apply(x: Int, y: Int) = new Int2DVec(x, y)
    def apply() = new Int2DVec(0,0)
    def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
}

trait Fraction {
  val num: Int
  val denom: Int
  def *(other: Fraction): Fraction
  def +(other: Fraction): Fraction
  def -(other: Fraction): Fraction
  def /(other: Fraction): Fraction
}

trait Loggable {
  def log(timeStamp: Long, msg: String) =
    println("[" + timeStamp.toString + "]: " + msg)
}

object Fraction {
  // one of the "creational patterns/idioms"
  def apply(num: Int, denom: Int, loggable: Boolean = false): Fraction =
    if (loggable) new LoggableImpl(num, denom)
    else new DefaultImpl(num, denom)

  private class DefaultImpl(val num: Int, val denom: Int) extends Fraction {
    override def *(other: Fraction): Fraction =
      Fraction(this.num * other.num, this.denom * other.denom)
    override def toString() = num.toString + "/" + denom.toString
    override def +(other: Fraction): Fraction = 
        Fraction(this.num * other.denom + this.denom * other.num, this.denom * other.denom)
    override def -(other: Fraction): Fraction = 
        Fraction(this.num * other.denom - this.denom * other.num, this.denom * other.denom)
    override def /(other: Fraction): Fraction = 
        Fraction(this.num * other.denom, this.denom * other.num)
  }

  private class LoggableImpl(num: Int, denom: Int)
  extends DefaultImpl(num, denom) with Loggable {
    def timeStamp = System.nanoTime // to keep the example short...
    override def *(other: Fraction): Fraction = {
      log(timeStamp, "multiplying " + this.toString + " by " + other.toString)
      // super.*(other) is not loggable
      Fraction(this.num * other.num, this.denom * other.denom, true)
    }
    override def +(other: Fraction): Fraction = {
      log(timeStamp, "adding " + this.toString + " to " + other.toString)
      Fraction(this.num * other.denom + this.denom * other.num, this.denom * other.denom)
    }
    override def -(other: Fraction): Fraction = {
      log(timeStamp, "subtraction " + this.toString + " from " + other.toString)
      Fraction(this.num * other.denom - this.denom * other.num, this.denom * other.denom)
    }
    override def /(other: Fraction): Fraction = {
      log(timeStamp, "dividing " + this.toString + " by " + other.toString)
      Fraction(this.num * other.denom, this.denom * other.num)
    }

  }
}

object Appl3 {
  def main(agrs: Array[String]) {
    val f1 = Fraction(3, 7)
    val f2 = Fraction(4, 9)
    val f3 = Fraction(1, 19, true)
    val f1f2 = f1 * f2
    val f4 = f1 + f2
    val f5 = f1 - f2
    val f6 = f1 / f2
    println(f1.toString + " * " + f2.toString + " = " + f1f2)
    println(f3.toString + " * " + f2.toString + " * " +
            f1.toString + " = " + f3 * f2 * f1)
    println(f1.toString + " + " + f2.toString + " = " + f4)
    println(f1.toString + " - " + f2.toString + " = " + f5)
    println(f1.toString + " / " + f2.toString + " = " + f6)
  }
}