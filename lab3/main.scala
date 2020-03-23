// first method:
// package p1.p2.p3 
// class A3

// second method:
// package p1
// package p2
// package p3
// class A3

// third method:
// package p1.p2.p3 {
//   class A3
// }

// fourth method:
// package p1 {
//   package p2 {
//     package p3 {
//       class A3
//     }
//   }
// }

import p1.p2.C2._

object Appl2 {
  import p1._
  new C1
  import p2.{C21, C22=>MyC22, C23=>_}
  new C21
  new MyC22
  def main(args: Array[String]) {
    m1OC2()
    m2OC2(new C1)
  }
}

object Appl {
  def readFile(fileName: String) = try {
    println("Opening the file...")
    val inFile = scala.io.Source.fromFile(fileName)
    try {
      for (line <- inFile.getLines) println(line)
      val x = 100 / inFile.getLines.length
    } finally {
      println("Closing the file...")
      inFile.close
    }
  } catch {
    case ex: java.io.FileNotFoundException =>
      println(ex.getMessage)
    case ex: Throwable =>
      println("Default exception handler: "+ ex.getMessage)
  }

  def main(args: Array[String]) {
    readFile("logins.txt")
  }
}

object Appl3 {
  def main(args: Array[String]) {
    import p2._
    println(m1(2))
    println(m2(5.5))
  }
}