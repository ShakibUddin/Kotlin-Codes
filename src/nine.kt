private const val name:String="sakib"//only exists in this file
private open class User(){
    var newname=name+" Uddin"
    private class NestedUser():User(){//here NestedUser is a nested class which can access name from User class
        //so NestedUser was made as a subclass of User
        var newname2="md "+newname+" bhuiyan"
    }
    inner protected class InnerUser(){
        //here InnerUser is a inner class which can access name from User class
        var newname3="md "+newname+" bhuiyan"
    }
}
private class FinalUser():User(){//another subclass of User
    //cant access NestedUser as its private
    var finalname=InnerUser().newname3.toUpperCase()//newname3 belongs to InnerUser class
    //so instead of newname3, InnerUser().newname3 is required
}
fun main(){
    val result=FinalUser()
    println(result.finalname)
}