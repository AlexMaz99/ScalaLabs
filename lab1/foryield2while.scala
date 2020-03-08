val xsa = for(i <- (1 to 3).toArray) yield(i)

val xsa2 = new Array[Int](3)
var i = 0
while(i < 3){
    xsa2(i) = i + 1
    i += 1
}