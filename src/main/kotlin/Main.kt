fun main() {

    val a: Int
        a = 5
    val b = 6

    val max: Int
    if (a >= b){
        max = a
    }else {
        max = b
    }

    println("max = $max")

    val day =  0
    when (day){
        1 -> print("$day = Monday")
        2 -> print("$day = tuesday")
        3 -> print("$day = wednesday")
        4 -> print("$day =thursday")
        5 -> print("$day = friday")
        6 -> print("$day = saturday")
        7 -> print("$day = sunday")
        else ->{
            print("fuck you only numbers")
        }

    }



}
