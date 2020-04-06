object ThreeColors extends Enumeration {
    type ThreeColors = Value // without this would be ThreeColors.Value
    val Blue, White, Red = Value // ThreeColors.ThreeColors
}

import ThreeColors._

object utils {
    def leadingActor(part: ThreeColors) : String = part match {
        case Blue => "Juliette Binoche"
        case White => "Zbigniew Zamachowski"
        case Red => "Irene Jacob"
    }
}

object Appl {
    def main(args: Array[String]){
        for (part <- ThreeColors.values)
            println(part + ": " + utils.leadingActor(part))
    }
}