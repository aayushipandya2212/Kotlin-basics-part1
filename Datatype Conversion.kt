/*conversion of one datatype to other. Type casting is required
when broad to narrow datatype conversion is done but when
narrow datatype is changed  to broad  datatype then conversion
is not required.
 */

fun main(args: Array<String>)
{
    var a: Byte = 5
    println("Byte value to integer: " + (a.toInt()))
    // this is not required because we are converting from narrow to wide
    println("259 to byte: " + (259.toByte()))
    // this is required because we are converting from wide to narrow
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    println("A to Int: " + ('A'.toInt()))

}