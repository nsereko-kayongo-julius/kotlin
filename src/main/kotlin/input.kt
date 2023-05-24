
fun main(){



        print("Enter the temperature scale (K, C, or F) in uppercase: ")
        val scale = readln()
        print("Enter the temperature value: ")
        val temperature = readln()?.toDouble()

        if (scale != null && temperature != null) {
            when (scale) {
                "C" -> {
                    val fahrenheit = (9.0 / 5.0 * temperature) + 32.0
                    val kelvin = temperature + 273.15
                    println("$temperature°C is $fahrenheit°F and $kelvin K")
                }
                "F" -> {
                    val celsius = (temperature - 32.0) * 5.0 / 9.0
                    val kelvin = (temperature - 32.0) * 5.0 / 9.0 + 273.15
                    println("$temperature°F is $celsius°C and $kelvin K")
                }
                "K" -> {
                    val celsius = temperature - 273.15
                    val fahrenheit = (9.0 / 5.0 * (temperature - 273.15)) + 32.0
                    println("$temperature K is $celsius°C and $fahrenheit°F")
                }
                else -> {
                    println("Invalid scale entered.")
                }
            }
        } else {
            println("Invalid input.")
        }
    }

