fun main(args: Array<String>){
    var a=10; var b=2

    println("a left shift b (a<<b):" + a.shl(b))
    println("a right shift b (a>>b):" + a.shr(b))
    println("a unsigned right shift b (a>>b):" + a.ushr(b))
    println("a and b (a&b):" + a.and(b))
    println("a or b (a|b):" + a.or(b))
    println("a xor b (a xor b):" + a.xor(b))
    println("a inv (~a):" + a.inv())
    println("b inv (~b):" + b.inv())
}