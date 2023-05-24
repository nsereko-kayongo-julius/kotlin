fun main() {

    val mark = 10

    if (mark in 1..49) {
        println("f9")
    } else if (mark in 50..55) {
        println("p8")
    } else if (mark in 55..60) {
        println("p7")
    } else if (mark in 65..70) {
        println("c5")
    } else if (mark in 75..80) {
        println("c4")
    } else if (mark in 85..90) {
        println("d2")
    } else if (mark in 95..100) {
        println("d1")
    }


    val marks = 50
    when (marks) {
        in 1..49 -> print("get serious")
        in 50..60 -> print("work hard")
        in 61..69 -> print("work better")
        in 70..79 -> print("good")
        in 80..89 -> print("v.good")
        in 90..109 -> print("Exellent")


    }
}

