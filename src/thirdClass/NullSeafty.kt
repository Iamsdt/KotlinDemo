package thirdClass

/**
 * Created by Shudipto on 6/10/2017.
 */

fun main(args: Array<String>) {
    //by default you can not initialize a variable with null
    //val nullValue:String = null

    //to do that
    val nullValue:String? = null

    println(nullValue)

    //null return function
    fun returnNull():String? {
        return null
    }

    println("Function: ${returnNull()}")


    //using force operator to force a assignment

    val returnNull1:String ?= returnNull()

    //val returnNull = returnNull1.length
    val returnNull2 = returnNull1?.length ?: "value is null"

    //val returnNull3 = returnNull2.length

    println("ReturnNull2: $returnNull2")
    //println("ReturnNull3: $returnNull3")

    val returnNull4:String = returnNull() ?: "No name"
    println(returnNull4)
}