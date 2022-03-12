fun main(){


    val firstArray: Array<String> = arrayOf("first","second","third")
    val secondArray: Array<Int?> = arrayOfNulls(5)

    println(firstArray[0]) //get index value of array
    firstArray[0] = "firstEdited"
    println(firstArray[0]) //get index value of array

    secondArray[0] =1
    secondArray[1] =2
    secondArray[2] =3
    secondArray[3] =4
    secondArray[4] =5

    for (item in secondArray){
        println(item)
    }



}