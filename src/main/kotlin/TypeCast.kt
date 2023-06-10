fun main (){
    // type check
    val myVariable:Any  = "hello"
    if(myVariable is String) {
        println("the length of the string is: ${myVariable.length}")
    }
    //type cast

    val myObject: Any = 50

    val myString: String? = myObject as? String
    println(myString) // Prints "Hello"

    for (i in 6 downTo 0 step 2) {
        println(i)
    }






}