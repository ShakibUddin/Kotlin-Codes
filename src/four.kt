// kotlin data type checking
fun main(){
    var num:Int?=4
    var line:String?="Hello"
    var decimal:Double?=23.33
    var bool:Boolean?=false
    var my_list = listOf(num,line,decimal,bool)
    for(i in my_list){
        when(i){
            is Int -> print("$i is an integer")
            is String -> print("$i is String")
            is Double -> print("$i is a Double")
            is Boolean -> print("$i is a Bool")
        }
    }
    //smart casting(Mainly works for Val types because they cant be changed..)
    //but if Var types are unchanged between after checking and usage, then ok
    if(line !is String){
        print("Line is null")
    }
    else{
        print("Size of the string '$line' is ${line.length}")
    }

}