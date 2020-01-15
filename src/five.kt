//Kotlin ranges
fun main(){
    //different ways to write a for loop
    for(i in 1..5){
        print("$i ")//will print from 1 to 5
    }

    println()
    (1..5).forEach(::print) //will print from 1 to 5
    println()

    for(i in 5.downTo(1)){ //down to is for descending like 5,4,3,2,1 and range to is for ascending like a,b,c,d,e
        print("$i ")//will print from 5 to 1
    }
    println()
    for(i in 1.rangeTo(5)){
        print("$i ")//will print from 1 to 5
    }
    println()
    for(i in 'a'.rangeTo('e')){
        print("$i ")//will print from a to e
    }
    println()
    for(i in 'e'.downTo('a')){
        print("$i ")//will print from e to a
    }
    println()
    for(i in 'a'..'e'){
        print("$i ")//will print from a to e
    }
    println()
    //step in Kotlin..step is equivalent to i+=k in other languages....for(i=0 ; i<n ; i+=k){}
    //value of step should always be greater than or equal to 1(default)...step will work with any loop format stated above
    for(i in 1.rangeTo(10) step 2 ){
        print("$i ")//will print from 1 to 5
    }
    println()
    //if a loop was called with initial value of 1 to 5 then (1..5 step 2).first will give the initial value when step is 2
    print((1..5 step 2).first)
    println()
    //if a loop was called with initial value of 1 to 5 then  (1..5 step 2).last will give the last value when step is 2
    print((1..5 step 2).last)
    println()
    print((1..5 step 2).step)//print the step used in range
}