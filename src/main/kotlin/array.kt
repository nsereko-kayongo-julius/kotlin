fun main() {
    val integrs = arrayOf(1, 2, 3, 4, 5, 6)
    for (element in integrs) {
        println(element)
    }


//age ticket calculator

    val age = 0

    if(age <= 12 ){
        print("your ticket price is 15")
    } else if(13 >=age && age <=60 ){
        print("your ticket price is 30")
    }else if(age > 61 ){
        print("your ticket price is 30")
    }else {
        print("your ticket price is invalid")
    }

    //farenaheight scale




        var array = arrayOf("Sweet", "Peter", "Deep", "Salt", "Pepper", "Corn", "Swallow", "Lead", "Smart")

        array.forEach {
            if(it.startsWith("S"))
                println(it)
        }

}