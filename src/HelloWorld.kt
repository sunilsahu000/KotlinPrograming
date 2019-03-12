fun main(args: Array<String>) {

    var number: Int = 21
    when (number) {
        1 -> println("the Nummber is 1")
        2 -> println("the Number is 2")
        3 -> println("the umber is 3")
        20 -> println("The Number is 20")
        else -> println("It is like Default in Jva " + number)
    }

    var a = 7;
    when (a) {
        1 -> {
            //writing the multiple codes of lines
            println("The number is " + 1)
            println("The number is1 " + 1)
            println("The number is 2" + 1)
        }
        2 -> {
            println("The number is " + 1)
            println("The number is1 " + 1)
            println("The number is 2" + 1)
        }
        3 -> {
            println("The number is " + 1)
            println("The number is1 " + 1)
            println("The number is 2" + 1)
        }
        0, 7, 9 -> {
            println("The number is " + a)
            println("The number is1 " + a)
            println("The number is 2" + a)
        }
        else -> {
            //here we can make default value with multiple lines
        }
    }

    var a1 :Char = 's'
    when(a1){
        'a','e','i','o','u' -> println("VOWELS ")
        else -> println("CONSTONETS ")

    }



    var rangeValues = 1..20
    if(5 in 1..20){
        println("Rangevalues containes the 5 value")
    }


    var z = 123;
    when(z){
        1,0,2,3,5,120 -> println("The value is 0,1,2,3,5,120")
        !in 120..130 -> println("The value is 120 and 130 betwenn range")
        else -> println("The value is ")
    }

    //WHEN as Expression

    var x1 = 1;
    var str:String =
    when(x1){
        0,2,3 -> "The values 0,2,3"
        1 -> "The value is 1"
        else -> "The is not value for X"
    }
    println(str)


}