fun main(){
    // allow key and values, key cannot be duplicate but values can be duplicate

    //read only map

    val age = mapOf<String, Int>("Nsereko" to 22, "Ari" to 26, "Adam" to 40)
    age.forEach{ (n, a) ->
        println("$n is $a years old")
    }
println(".......mutable map...............")
    //mutable collection
    val ages = mutableMapOf<String, Int>("Bryan" to 12, "julius" to 40)
    ages["Hasan"] = 33
    ages.remove("julius")
    ages.forEach{(n, a) ->
        println("$n has $a years")
    }
}