import java.util.Scanner
fun printHashMap(hm:HashMap<String,Int>){
    if(hm.isEmpty()){
        print("HashMap is empty")
    }
    else{
        print("HashMap $hm")
    }
}
fun printHashMapValueByKey(hm:HashMap<String,Int>){
    if(hm.isEmpty()){
        print("HashMap is empty")
    }
    else{
        for(key in hm.keys){
            print("key = $key , Value =  ${hm.get(key)}")
        }
    }
}
fun main(){
    var sc =Scanner(System.`in`)
    var hm:HashMap<String,Int> = hashMapOf<String,Int>()
    printHashMap(hm)
    print("Enter 5 elements(String,Int) in hashmap")
    for(i in 0 until 4){
        var key = readLine().toString()
        var value = sc.nextInt()
        hm.put(key,value)
    }
    printHashMap(hm)
    printHashMapValueByKey(hm)
    if(hm.containsKey("Thor")){
        hm.remove("Thor")
    }
    else{
        print("Thor does not belong to DC Universe")
    }
    if(hm.containsValue(100)){
        hm.replace("Superman",90)
    }
    printHashMapValueByKey(hm)

    var (x,y) = Pair("Flash",92)
    hm.put(x,y)
    print("Enter more Super Heroes")
    var key = readLine().toString()
    var value = sc.nextInt()
    var newHeroes = Pair(key,value)
    hm.put(newHeroes.first,newHeroes.second)
    printHashMapValueByKey(hm)

}