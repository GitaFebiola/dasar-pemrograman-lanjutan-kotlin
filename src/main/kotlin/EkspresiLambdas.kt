fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //lambda Function
    val mylambda :(String)->Unit = {s:String->print(s)}
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)

    //Inline Function
    myFun(v,mylambda) //passing lambda as a parameter of annother function
}

fun MyFunction(x: String): String{
    var c:String = "Hey!! welcome To ---"
    return (c+x)
}

fun myFun(a:String, action:(String)->Unit) { //passing lambda
    print("\nHeyyy!!")
    action(a)// call to lambda function
}