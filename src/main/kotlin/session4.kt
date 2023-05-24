fun main(){
    val maximum = max(5,10)
    print("$maximum")

    val set = setOf("apple", "pear", "orange", "apple")
    println(set.count())



}
fun max(a: Int, b: Int) = if (a > b) a else b