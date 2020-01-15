var city = "Dhaka"//here city is also a string variable,here city is a TOP LEVEL variable,
var age: Int? = 5//here '?' means age is nullable
fun setname(newName:String?):String?{
    return newName
}
fun getName(newName:String?):String? {//return type of nullable string
   return newName
}
fun getResponse(newName:String?):String{
    val response: String = when(newName){
        "Sakib" -> "Hello Sakib"
        null -> "Please enter a name"
        else -> "Hey, $newName"
    }
    return response
}
fun specialResponse(newName:String?):Unit = print("What's up $newName ?")//single expression function with UNIT(Void) return type
fun main(){
    var name: String? = "Sakib Uddin"//name is nulable
    age=null
    print(name)
    print(city)
    print(age)
    if(age!=null){
        print("Age is not null")
    }
    else{
        print("Age is null")
    }
    var newName:String?=getName(setname("Jack"))
    if(newName=="Jack"){
        specialResponse(newName)
    }
    else{
        getResponse(newName)
    }
}