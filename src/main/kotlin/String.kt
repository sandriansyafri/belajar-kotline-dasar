fun main(){

    var typeStringInline: String = "Inline String"
    var typeStringMultiInline: String = """
        Hello World!
        This is strings multiple inline!
    """.trimIndent()

    var firstName: String = "Sandrian"
    var lastName: String = "Syafri"
    var fullName = "$firstName $lastName" // string template

    println(typeStringInline)
    println(typeStringMultiInline)
    println(fullName)

}