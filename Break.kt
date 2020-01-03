fun main(args: Array<String>) {

    var name = "Hai JRS"
    for (i in name){
        println(i)
        if(i == 'R') {
            break
        }
    }

//labelling loops using @
//labelled breaks

    outer@ for (i in 4 downTo 1) {
         inner@ for (j in 4 downTo 1) {
            if (i == 2)
                break@outer
            println("i = $i; j = $j")
        }
    }
}
