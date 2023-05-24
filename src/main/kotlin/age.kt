class Age {
    var age : Int = 12

    set(value) {
        if (value < 0)
            println("your age is invalid, age cn never be zero")
        else
           field = value
    }

}

fun main(){

    val person = Age()
    person.age = -1

    println("age: ${person.age}")

    val p1 = Person("nsereko", 12)
    print ("${p1.status()}")
}

open class Person(
    var name: String,
    val age: Int){
    fun status(){
        println("$name is single and searching")
    }
}

class Student(age: Int, name: String) : Person(name, age){

}