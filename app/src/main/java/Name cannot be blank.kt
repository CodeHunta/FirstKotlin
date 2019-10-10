fun main() {
    // A birthday message to the brain behind #Laptops4Developers
    // the one whose 'Name cannot be blank', the faceless hacker.

    print("What day of October is today: ")

    val S = "AKINTUNDE SULTAN"
    val T = "@hacksultan"
    val A = "devcareers.io"
    val N = "'Kunmi/Code Newbie/Kotlin Enthusiast' and all the #Laptops4Developers beneficiaries."

    var x: Int = readLine()!!.toInt() //Where x marks HackSultan's special day
    println("")
    if (x == 6) {
        print("A very big HAPPY BIRTHDAY to " +S)
        println(" a.k.a " +T)
        println("Messiah of #Laptops4Developers and Lord of " +A)
        print("This is a loving message from " +N)
        println()
    }
    else println("Revert to DevCareers for update!")
}