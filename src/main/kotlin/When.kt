fun main(){
    var condition:Char = 'Z'

    //one condition
    when(condition){
        'A' -> {
            println("Sangat Baik")
        }
        'B' -> {
            println("Baik")
        }
        'C' -> {
            println("Cukup")
        }
        'D' -> {
            println("Kurang")
        }
        'E' -> {
            println("Sangat Kurang")
        }
    }

    //multiple condition
    when(condition){
        'A','B','C' -> {
            println("Pass")
        }
        'D','E' -> println("Try Again!")
        else -> println("Something wrong!")
    }

    // when ( in )
    var value: Int = 60
    var values :Array<Int> = arrayOf(70,80,90,100)

    when(value){
        in values -> println("PASS")
        else -> println("NOT PASS")
    }

    // when ( is )
    when(80){
        is Int -> println("Int")
        !is Int -> println("Not Int")
    }


}