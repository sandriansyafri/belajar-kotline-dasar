fun main(){
    fun calculate(vararg values:Int): Int{
        var total: Int = 0
        for (value in values){
            total+= value
        }

        return  total
    }

    println(calculate(10,20,30))
}