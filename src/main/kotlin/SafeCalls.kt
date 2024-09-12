fun main(args: Array<String>) {
    //safe calling
    //?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }

    //The ?. chaining
    //student?.teacher?.supervisor?.name = "seymour skinner"
}