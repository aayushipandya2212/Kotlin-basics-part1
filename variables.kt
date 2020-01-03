fun main(args: Array<String>){
    var salary=30000 //var that is mutable i.e. its value can be changed
    println(salary)
    salary=25000 // here value of salary is changed which shows that it is mutable
    println(salary)

    val language = "kotlin"
    println(language)
   // language = "java" // this will show error because val is immutable so its value cant be changed

    var birthdate= "22/12/1999"
    val dob= birthdate
    println(birthdate)
    println(dob) //so in this way we can indirectly change value of immutable variable i.e. val using var
               // whenever we will change value of birthdate value of dob will also change
}