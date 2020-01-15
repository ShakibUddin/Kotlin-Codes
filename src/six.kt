fun foo(bar:Int,barString: String){
    println("$bar . $barString")
}
fun foo2(bar:Char='#',barString: String){
    println("$bar $barString")
}
fun math(vararg numbers:Int,x:Int=1):Int{
    var sum=0
    for(num in numbers){
        sum+=num
    }
    return sum/x
}
//nested functions
fun findBMI(height:Double,weight:Double){
    if(height<=0){
        throw IllegalArgumentException("Height can't be less than or equal to 0")
    }
    if(weight<=0){
        throw IllegalArgumentException("Weight can't be less than or equal to 0")
    }
    fun calculateBMI():Double{//This nested function is called Local function.
       //Local functions can access local variables of the outer function.
        //so calculateBMI can acccess the arguments passed in findBMI()
        return weight/(height*height)
    }
    println("BMI is ${calculateBMI()}")
}
//The main() method itself is a top-level function in Kotlin since it is defined outside of any class.
fun main(){
    foo(1,"Apple")
    //now recalling the function with named parameters
    foo(barString="Mango",bar=2)
    //calling function with default parameters
    foo2(barString = "Banana")
    //foo2("Banana") is wrong as it is position based argument and banana goes to bar:Char variable

    //You can use a mix of named arguments and position-based arguments
    // only if all the position-based arguments are placed before the named arguments-
    //if the parameters in foo2() swapped positions and i put named argument before position based argument
    //it does not work
    foo2('@',barString = "Grape")
    //vararg arguments
    //In Kotlin, a vararg parameter of type T is internally represented as an array of type T (Array<T>) inside the function body.
    //means I dont have to say how many arguments i will pass
    println(math(1,2,3,4,5))
    //A function may have only one vararg parameter. If there are other parameters following the vararg parameter,
    // then the values for those parameters can be passed using the named argument syntax -
    println("Dividing the sum ${math(1,2,3,4,5)} with 5 result is ${math(1,2,3,4,5,x=5)}")
    //Kotlin spread(*) operator
    //if you already have an array and want to pass the elements of the array to the vararg function,
    // then you can use the spread operator like this -
    var nums = intArrayOf(2,4,8)
    println("Dividing the sum ${math(*nums)} with 2 result is ${math(*nums,x=2)}")
    //calling the nested function
    findBMI(1.95072,90.00)
}
