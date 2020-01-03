
fun main(args: Array<String>) {
    var num = 0
    while (num <= 12) {
        if (num % 3 == 0) {
            num++
            continue  //only when if condition will be true then
                // it will be skipped and will work from next value
        }
        println(num)
        num++
    }

//continue in labelled loop
    var num1 = 4
    outer@ while (num1 > 0) {
        num1--
        var num2 = 4

        inner@ while (num2 > 0) {
            if (num1 <= 2)
                continue@outer
            println("num1 = $num1, num2 = $num2")
            num2--
        }
    }
}
