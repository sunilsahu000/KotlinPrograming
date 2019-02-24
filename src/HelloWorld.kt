fun main(args: Array<String>){
    /*
    * this comment line 1
    * this ccomment line 2
    * we can write about function like t*/
    var myNumber = 10
    println("My Number is "+myNumber)
    var myDecimalValue = 3.3
    println(myDecimalValue)
    var myString  : String // mutavble string
    myString = "helllo saleel"
    myString ="Hello jaanu how r you"
    val myConstantsString  : String //immutable string
    myConstantsString ="Hello worl"

    println(myString)
    println(myConstantsString)
    callTheStringFun(myConstantsString)
    callIntMthod(myNumber)
    println(callIntMthod(125))

}


/*
* creating function with parameters
* here fun means we are creating function
* fun nameOftheFunction(variableName:VariableDataType)*/
fun callTheStringFun(name:String){
    println(name)

}
/*
* creating a method with Int return type
* callIntMthod name of the method and Int data type parameter we are passswing int data type return
* before { if we write any data typ its means we are exceping same return type value from the method*/
fun callIntMthod(value:Int): Int{
    //println(Integer.MIN_VALUE)
    return value
}




fun dataTypesInOOPS(){
    var fixedSize : String
    var userDefined : String
    userDefined ="String,Class,Object,Null,Array......"
    fixedSize = "byte-8 bits" +
            "Short - 2 bytes" +
            "int - 4 bytes" +
            "float -4 bytes" +
            "double = 8 bytes" +
            "long = 8 bytes" +
            "char = 2 bytes" +
            "boolean - 1 bit"
    var dataTypenadCapacity:String
    dataTypenadCapacity ="" +
            "min = minus(2power n minus - 1)  here n means number of bits" +
            "max = plus{2 power n minus -1 and -1 }"
    /*
    * for char max capaciy = 65,535*/
}


