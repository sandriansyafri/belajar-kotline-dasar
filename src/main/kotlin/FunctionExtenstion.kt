fun String.sayHello():Unit{
    println("Hello $this")
}

fun  main(){

    var fullName:String = "Sandrian Syafri"

    println(fullName.sayHello())

}