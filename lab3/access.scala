package p1
package p11 {
  private[p1] class C1 {
    protected[p1] def protP1MC1() {
      print("[protP1MC1]: "); privP11MC1()
    }
    private[p1] def privP1MC1() { // widoczna dla pakietu p1, p11
      print("[privP1MC1]: ");  privP11MC1()
    }
    private[p11] def privP11MC1() {
      print("[privP11MC1]: "); println((new C11).a13)
    }
    protected[p11] def protP11MC1() {
      print("[protP11MC1]: "); privP11MC1()
    }
    private[C1] var a11 = 11
    private[this] var a12 = 12
    class C11 {
      private[C1] val a13 = 13
    }
    override def equals(other: Any): Boolean = other match {
      case that: C1 => (this.a11 == that.a11)
      // && (this.a12 == that.a12) // (1)
      case _ => false
    }
  }
}
package p12 {
  import p11._
  object O1 {
    private[p12] val ao1 = new C1
  }
  class C12 extends C1 {
    def mC121() { print("[mC121]: "); super.protP11MC1() }
    // def mC122() { print("[mC122]: "); super.privP11MC1() } // (2)
  }
}
object Appl {
  def main(args: Array[String]) {
    val c1 = new p11.C1
    c1.protP1MC1()
    c1.privP1MC1()
    val c12 = new p12.C12
    c12.mC121()
  }
}