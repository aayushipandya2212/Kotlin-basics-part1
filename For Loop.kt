fun main(args: Array<String>)
{
    for (i in 1..6){
        println(i)
    }

    for(i in 1..10 step 3){
        println(i) //every time it will print with 3rd steps i.e.
        // 1 4 7 10
    }

    for(i in 10 downTo 1){
        println(i) //reverse order
    }

    for (i in 10 downTo 1 step 3){
        println(i) //reverse order skipping 3rd step
    }

    //Traversing string using for loop

    var name = "ABC"
    var name2 = "DEF"

    // traversing string without using index property
    for (alphabet in name) print("$alphabet ")

    // traversing string with using index property
    for (i in name2.indices) print(name2[i]+" ")
    println(" ")

    // traversing string using withIndex() library function
    for ((index,value) in name.withIndex())
        println("Element at $index th index is $value")
}