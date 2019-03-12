fun main(args:Array<String>){
    //for loop in kotlin
  /*  in java will use for loop like
    Intilizer -> ConditionCheck -> Code Excutetion -> Increament
    for(int i =1;i<=10;i++){
    //will write our loping logic here
    but in kotlin will use ranges to use for loop
    }*/

    for(i in 1..20){
        if(i % 2 == 0)
            println("Even number is "+i)

    }

    //While loop

    var i:Int =1
    while (i <= 5){
        println("i value is "+i)

        i++

    }

    //Do while loopv
    var  v :Int =2
    do{

        println("THe Do while loop "+v)
        v++
    }while (v<=5)
}