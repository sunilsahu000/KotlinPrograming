package Details
/*
* creating new package with class called PersonDetails
* and making it as a constructor and passing the paremeters to class
*
* */
class PersonDetails(var name:String,var lastName :String) {

    fun personDetails(){
        println("hello viewers ${lastName}"+name)

    }

}