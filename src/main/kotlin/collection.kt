fun main(){
    // 3types of lists set, list and map
    // immutable list
    val name = listOf<String>("nsereko", "Ari", "mutumba")

    for (n in name){
        println(n)
    }
    println("------------foreach----------")
    name.forEach(){ println(it)}

    //mutable list
    val names = mutableListOf<String>("julis")
    names.add( "nsereko")
    names.add( "Adam")

    for (n in names){
        println(n)
    }
    println("------------foreach----------")
    names.forEach(){ println(it)}
}