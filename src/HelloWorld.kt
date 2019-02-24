fun main(args: Array<String>) {

    /*
    creating object for person here we dont have new keyword to create object for class /
     */
    var personObjecct = Persion()
    personObjecct.name ="Saleel"
    println(personObjecct.callMthod("Hello saleel"))
    println(personObjecct.name)
    //STRING INTERPOLATION
    /*
    * STRING INTERPOLATION same line we can print our value by using ${}
    * complier will undertstand by seeing $ */
    println("STRING INTERPOLATION ${personObjecct.name}  "+personObjecct.name)
}


class Persion{

   var name:String ="khan"
fun callMthod(s: String) {
    println(name)
    println(s)
}
}

