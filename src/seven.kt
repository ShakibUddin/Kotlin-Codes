//lambda expression
var add : (Int,Int) -> String = {a,b -> (a+b).toString()}
//function name is add
//(Int,Int) -> String means takes two Int as input and return type is String
//a,b -> (a+b).toString() means first Int is a, second Int is b, add a and b, convert to string as we are returning String

//Higher Order functions(functions that can accept functions as parameters and return a function)
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun sumAsString(a:Int,b:Int):String{
    return (a+b).toString()
}
fun returnAFunction():((Int,Int) -> Int){
    return :: sum
}
//returnAFunction() has no parameter but returns a function that takes two Int parameters and returns an Int
//here I have decided returnAFunction to return sum() function
fun functionAsParameter(abc: String):Int{
    return abc.toInt()
}
//functionAsParameter takes a function with return type of String and return an Int
fun main(){
    println("Result of lambda is ${add(2,3)}")
    var result=returnAFunction()//now result has sum(),also an example of first class functions
    //because Kotlin supports first class functions
    //First class functions are those that can be stored in a variable or structure
    //so result wworks exactly ass sum()
    println("Result of returnAFunction() is ${result(7,8)}")
    println("Result of functionAsParameter() is ${functionAsParameter(sumAsString(20,20))}")
}