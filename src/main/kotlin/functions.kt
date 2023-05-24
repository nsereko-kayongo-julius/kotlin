fun main(){


    studentDetaild("Kotlin", "122R", 12)
    println("${sum(5,4)}")
}

fun studentDetaild(studentName: String, studentRollNumber: String, studentAge: Int) {
    println("studentName is $studentName and Student Roll Number is : $studentRollNumber, and the Age is: $studentAge")
}

fun sum(num1: Int, num2:Int): Int{
    return(num1+num2)
}