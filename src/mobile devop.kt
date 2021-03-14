fun main() {
index()
    intro("jane",20)
    println(word("Nyambura"))
    truth("Nyambura")
    truth("Michelle")

}
fun index() {
    var text = "akirachix"
    var a=(text[0])
    var b=(text[2])
    var c=(text[3])
    println("$a$b$c")
}
fun intro(name:String,age:Int){
println("Hi, my name is $name and i am $age years old.")
}
fun word(a:String):Int{
    return a.length
}
fun truth(name:String){
    if (name=="Nyambura"){
        println("That's me!")
}
    else{println("I don't know who that is")
    }
}