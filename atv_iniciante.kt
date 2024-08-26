fun main() {
    // Atividade Inciante

    val eletricidade:Float = 0.475f
    val gas:Float = 2.0f

    println("Eletricidade(kwh/m^3): ")
    var El = readln().toFloat()

    println(" Gás Natural (kwh/m^3):")
    var g_natural = readln().toFloat()

    var elet = (El * eletricidade)
    var gasnat  =  (gas * g_natural)

    println("Resultado da Eletricidade foi : ${elet} kg CO2")
    println("Resultado do Gás Natural Foi: ${gasnat} kg Co2")

    var total = elet + gasnat
    println("Total: ${total} KG CO2")

}

