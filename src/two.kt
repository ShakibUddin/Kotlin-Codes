fun main(){
    var fireShinobis = Array(5){""}
    print("Enter 5 name of shinobis of Hidden Leaf")
    for(i in 0..4){
        fireShinobis[i]= readLine()!!//  '!!' is called not null assertion operator
        // means if the input is null kotlin will throw NullPointerException
        //or a non null value e.g a string...that's why converting readLine to string is another option
    }
    for(name in fireShinobis){
        print(name)
    }
    var sandShinobis:MutableList<String> = mutableListOf<String>("")//mutable means editable....
    // simple List is read only
    print("Enter 5 name of shinobis of Hidden Sand")
    for(i in 0..4){
        sandShinobis.add(readLine().toString())
    }
    if(sandShinobis.contains("Gaara")){
        print("Gaara is a Kage\n")
    }
    sandShinobis.sort()
    for(name in sandShinobis){
        print(name)
    }
    var kage = Pair("Naruto","Gaara") // A pair class
    if(fireShinobis.contains(kage.first) && sandShinobis.contains(kage.second)){
        print("${kage.first} and ${kage.second} are kages\n")
    }
    var team7 = Triple("Naruto","Sasuke","Sakura")// A triple class in kotlin
    if(fireShinobis.contains(team7.first) && fireShinobis.contains(team7.second) && fireShinobis.contains(team7.third)){
        val team7List:List<String> = team7.toList()
        print("$team7List belongs to Team 7\n")
    }

}