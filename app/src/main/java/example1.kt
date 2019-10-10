/*fun main() {
    println("Hello World, this is Stan Lee.")
    println("I am a Kotlin Newbie. May the force be with me!")

    // Variables declared with 'val' can't be reassigned, therefore returns an error.
    val num = 10
    val str = "immutable"
    println(num)
    println(str)

    // Variables declared with 'var' can be reassigned with the code
    var age: Int = 45
    var type: String = "Can change because it is a 'var' and not 'val'"
    age = 34
    println(age)
    println(type)

    // expressing data types. If not declared, a variable takes its type from the assigned variation (type inference).
    // Also, if not declared with either an 'f' or 'F' at the end of a decimal, the data is taken as Double
    //Data Types: Integer, Double, Float, Long, Short, Byte
    var a = 42.8
    var b = 0.5
    var c = (a * b)
    println(c)

    var e: Int = 33
    var f: Float = 3.14f
    var d: Double = 2.71828
    println("Result:" +e)
    print("$e; $f; $d") // + or $ (string templates) can be used to include a variable's value in a string
    // println(f)
    // println(d)
    val name = readLine()
    println(message = "Your input is " +name)

}*/

fun main() {
    /*println("Enter Number")
    var x: Int = readLine()!!.toInt()

    println("Enter Number")
    var y: Int = readLine()!!.toInt()

    println(x)
    println(y)*/

    println("Note that marks are between 0 and 100. Thank you!")
    println("Enter marks:")

    var x: Int = readLine()!!.toInt() //where x = marks
    when (x)
    {
        in 0..49 -> println("Fail")
        in 50..79 -> println("Pass")
        in 80..100 -> println("Distinction")
        else -> println("Check your input and re-enter")
    }

    /*if (x >= 50)
        println("Pass")
    else
        print("Fail")*/

}