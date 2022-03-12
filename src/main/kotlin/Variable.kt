const val APP:String = "Belajar Kotlin"
const val VERSION: String  = "0.0.1"

fun main(){
    var useVar: String = "use 'var' declaration" // muttable
    val useVal: String = "use 'val' declaration" // immuttable
    var canNull: String? = null //nullable
    val appVersion: String = "$APP $VERSION"

    println(useVar)
    println(useVal)
    println(canNull)
    println(appVersion)

}