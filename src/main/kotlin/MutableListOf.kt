fun main(args: Array<String>) {
    //MutableList is a list with list-spcific write operations
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    val numberStr = mutableListOf("one", "two", "three", "four")
    numberStr.add("five")    //this is OK
    //numbersSTr = mutablelistOf("six", "seven")    // compilation error
    println(numberStr)
}