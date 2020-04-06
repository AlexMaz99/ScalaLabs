class Int2DVec(val x: Int, val y: Int) {
  override def equals(other: Any): Boolean = {
    other match {
      case that: Int2DVec =>
        (this.x == that.x) && (this.y == that.y)
      case _ => false
    }
  }
  override def hashCode = 41 * (41 + x) + y
}

object Appl {
  def checkPredicate(pred: Boolean, predAsString: String) {
    if (pred) println(predAsString + ": OK")
    else println(predAsString + ": Failed")
  }

  def main(args: Array[String]) {
    val v1 = new Int2DVec(4, 5)
    val v2 = new Int2DVec(4, 5)
    checkPredicate(v1 equals v2, "v1 equals v2") // True (nie sprawdza referencji)
    checkPredicate(!(v1 eq v2), "!(v1 eq v2)") // True (sprawdza referencje)
    checkPredicate(v1 == v2, "v1 == v2") // True (nie sprawdza referencji, tylko sprawdza czy dwa obiekty są takie same)
  }
}