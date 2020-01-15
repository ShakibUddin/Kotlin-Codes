class Student constructor(name:String="Anonymous", var id:Int=0, cgpa:Double=0.0){
    //Student is a class with primary constructor,
    //secondary constructors are written inside the class
    //the constructor is default.so 'constructor' keyword can be omitted
    //the properties declared in the primary constructor can be mutable (var) or read-only (val).
    init {//first initializer block.
        // parameters of the primary constructor can be used in the initializer blocks.
        println("This is $name's information")//here name will be the default value "Anonymous" if no name is provided
        //because I assigned name in the main function
    }
    var student_name:String=""//these are property initializers
    get()=field
        set(value) {
            field=value
        }
    var student_id:Int=id
    var stringId:String=""
    var student_cgpa:Double=-3.0
        get() = field
        set(value) {
            if(value>4.00){
                field=4.00
            }
            else if(value<2.00){
                field=2.00
            }
        }
    fun setId(){
        this.student_id=id//normally this would have been wrong...
        // cause functions in class cant access primary constructor parameters
        //to make it work I had to add var/val before id in primary constructor
    }
}
fun main(){
    var andrew = Student(id=1221,cgpa=3.75)
    andrew.student_name="Andrew Garfield"
    andrew.setId()
    andrew.student_cgpa=1.75
    println("Student name is ${andrew.student_name}, ID is ${andrew.student_id}, CGPA is ${andrew.student_cgpa}")
    //OUTPUT : This is Anonymous's information(init blocks output)
    //Student name is Andrew Garfield, ID is 1221, CGPA is 2.0(cgpa = 2.0 because of setter)

    var jhon = Student("Jhon Constantine",1890,3.84)
    jhon.student_name="Jhon Constantine"
    jhon.setId()
    jhon.student_cgpa=6.7
    println("Student name is ${jhon.student_name}, ID is ${jhon.student_id}, CGPA is ${jhon.student_cgpa}")
    //OUTPUT : This is Jhon Constantine's information(init blocks output)
    //Student name is Jhon Constantine, ID is 1890, CGPA is 4.0(cgpa = 4.0 because of setter)
}