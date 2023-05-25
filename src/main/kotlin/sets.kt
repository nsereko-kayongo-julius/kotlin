fun main(){

    //sets dono have duplicates and can not be acessde using idices
    //immutable set
    val name = setOf<String>("daniel", "shifrah", "joshua")
    for (s in name) {
        println(s)
    }
println("..........mutable list........")
    //mutable set
    val names = mutableSetOf<Int>(11, 12,33,12,12)
    names.add(44)
    names.remove(12)

    names.forEach(){ println(it)}
}