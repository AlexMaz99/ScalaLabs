val a = for (i <- 1 to 3) yield(i)
//a: IndexedSeq[Int] = Vector(1, 2, 3)

val xsa = for (i <- (1 to 3).toArray) yield(i)
//xsa: Array[Int] = Array(1, 2, 3)

val xsl = for (i <- (1 to 3).toList) yield(i)
//xsl: List[Int] = List(1, 2, 3)

val xss2 = for (i:Int <- (1 to 3).toSet) yield(i * i)
//xss2: scala.collection.immutable.Set[Int] = Set(1, 4, 9)

val xss4 = for (i <- (1 to 3).toSet[Int]) yield {if (i % 2 != 0) i * i}
//xss4: scala.collection.immutable.Set[AnyVal] = Set(1, (), 9)