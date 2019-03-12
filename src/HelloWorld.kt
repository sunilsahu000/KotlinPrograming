import Details.PersonDetails

fun main(args: Array<String>) {

    var r1 = 1..5 //it contains the 1,2,3,4,5 .. double dots meaning assending order
    var r2 = 5 downTo 1  // It contains the 5,4,3,2,1 downTo meaning desending order
    var r3 = 10 downTo 1 step 2 // it conraints the 10,8,6,4,2 like this it step
    var r4 = 1.rangeTo(20)//its like .. function 1..20
    var r5 = 10.downTo(1)

    var a = 20
    var b = 10
    var maxVal: Int
    if (a > b) {
        maxVal = a
    } else {
        maxVal = b;
    }
    println("MAX VALUE " + maxVal)

    //same thing we can write below

    var x = 30
    var y =40
    var CheckCon:Int = if(x>y){
        a
        x
    }else{
        b
        y
    }
    println("MAX Values "+CheckCon)





}



