import kotlin.math.*
fun main(args: Array<String>) {
    //Constants
    println("Pi: ${PI}\ne: ${E}")
    //available math functions
    //min(), max(), round(), ceil(), floor() and truncate()
    var varDouble = 2.72
    var roundResult: Int = round(varDouble).toInt()
    println("Pembulatan round $varDouble adalah "+ roundResult)
    //abs() and sign()
    //sin(), cos(), tan(), acos(), asin(), atan()
    //pow() and sqrt()
    println("Nilai 2 pangkat 3 adalah " + 2.0.pow(3))
    //exp(), log(), log10(), log2()
    //8 = 8^(1/3)
    println("Nillai 8 panngkat 1/3 adalah " + 8.0.pow((1.0 / 3.0)))
    //Division
    val a = 5 / 2
    val b = 5.0 / 2
    val c = 5 / 2.0
    val d = 5.0 / 2.0
    // val e: Int = 5 / 2.0
    //val f: Double = 5 /2
    print("$a\n$b\n$c\n$d")
}