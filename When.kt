/*
*In Kotlin, when replaces the switch operator of other languages like Java.
*The argument of when expression compares with all the branches
* one by one until some match is found. After the first match found,
*  it reaches to end of the when block and execute the code next to
* when block.
* In Kotlin, when can be used in two ways:

    when as a statement
    when as an expression

 */

//Using when as a statement with else –
import java.util.Scanner;
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter any largebody:")
    var lb = reader.next()

    when (lb) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }


//Using when as an expression –
        var reader1 = Scanner(System.`in`)
        print("Enter the month number:")
        var monthOfYear = reader1.nextInt()
        var month = when (monthOfYear) {
            1 -> "January"
            2 -> "Febuary"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> {
                println("Not a month of year")
            }
        }
        println(month)


//Check the input value in range or not –
        var reader2 = Scanner(System.`in`)
        print("Enter the month number of year: ")
        var num = reader2.nextInt()
        when (num) {
            in 1..3 -> println("It is spring season")
            in 4..6 -> println("It is summer season")
            in 7..8 -> println("It is rainy season")
            in 9..10 -> println("It is autumn season")
            in 11..12 -> println("It is winter season")
            !in 1..12 -> println("Enter valid month of year")
        }



//Check given variable is of certain type or not –
        var num2: Any = "CDGI"
        when (num2) {
            is Int -> println("It is an Integer")
            is String -> println("It is a String")
            is Double -> println("It is a Double")
        }


    //Using when as replacement for an if-else-if chain –
    fun isOdd(x: Int) = x % 2 != 0
    fun isEven(x: Int) = x % 2 == 0

        var num3 = 8
        when {
            isOdd(num3) -> println("Odd")
            isEven(num3) -> println("Even")
            else -> println("Neither even nor odd")
        }
    }
