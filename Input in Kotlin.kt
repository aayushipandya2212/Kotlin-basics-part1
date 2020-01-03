/* input can we taken using Scanner of java but in simple way
readLine function is used in kotlin. readLine() is used mostly
but we also sometimes use readLine()!! to ensure that value entered
by user will not be null. readLine() will return the value entered
in form of string which can further we converted into other datatype.
 */
import java.util.Scanner

fun main(args : Array<String>) {
    print("Enter text: ")
    var input = readLine()
    println("You entered: $input")

    print("Enter an Integer value: ")
    val string1 = readLine()!!
    // .toInt() function converts the string into Integer
    var integerValue: Int = string1.toInt()
    println("You entered: $integerValue")

    print("Enter a double value: ")
    val string2 = readLine()!!

    // .toDouble() function converts the string into Double
    var doubleValue = string2.toDouble()
    println("You entered: $doubleValue")


//using scanner of java in kotlin to take input
//for this you nead to import java.util.Scanner
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var num = reader.nextInt()
    print("Value you entered is $num")
}