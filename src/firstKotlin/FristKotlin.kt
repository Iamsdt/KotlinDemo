package firstClass

/**
 * Created by Shudipto on 5/19/2017.
 */

fun main(arg : Array<String>){
    println("Hello world kotlin")

    var myArray = arrayOf("Shudipto",15,45.8,"Khulna")

    myArray[2] = 60

    println("Name: ${myArray[0]}")
    println("weight: ${myArray[2]}")

    println("Size: ${myArray.size}")
    println("Contains Khulna: ${myArray.contains("Khulna")}")

    val newArray = myArray.copyOfRange(0,2)
    println("new array with first 2 index: ${newArray.size}")

    println("new array first element: ${newArray.first()}")
    println("new array Last element: ${newArray.last()}")

    println("Index of Shudipto: ${newArray.indexOf("Shudipto")}")


    val intArray:Array<Int> = arrayOf(1,2,3,4,5,6)

    println("Array: ${intArray[2]}")

    val sqrArray = Array(100,{x -> x * x * x})

    println("Array pos:0 ${sqrArray[0]}")
    println("Array pos:0 ${sqrArray[1]}")
    println("Array pos:0 ${sqrArray[2]}")
    println("Array pos:0 ${sqrArray[3]}")
    println("Array pos:0 ${sqrArray[4]}")


    println("**************Start a new Program ***************")
    val qube = Array(100,{ x -> x * x})

    var i:Int = 0

    while(i < 100){
        println("Array pos:${i + 0} ${qube[i]}")
        i++
    }

}

fun varriables(): Unit {
    //    //immutable variable
//    val name = "Shudipto"
//    val age = 21
//
//    println("Name: $name Age: $age")
//
//    //mutable variable
//    var bigDouble:Double = Double.MAX_VALUE
//    var smallDouble:Double = Double.MIN_VALUE
//
//    println("Big Integer: "+bigDouble)
//    println("Small Integer: $smallDouble")
//
//    println("\n")
//
//    var intValue:Int = 21

    //println("3.2 to int "+3.14.toInt())

    //println("65 to Char: "+65.toChar())

    //loop

//    var number:Int = 48
//
//    while (number <= 125){
//        println("$number to Char: "+number.toChar())
//        number ++
//    }
}

fun jounString(){
    val FName = "Shudipto"
    val LName = "Trafder"

    println("Full name: ${FName+" "+LName}")

    val address ="""I am shudipto trafder lives in Khulna.
                I study on the khulna University """

    println("Name: ${FName+" "+LName}"+" Address: "+address)

    //compare two string
    val string1 = "user"
    val string2 = "User"

    println("Strings are same: ${string1.equals(string2)}")
    println("Strings are same: ${string1 == string2}")

    //another way
    println("Strings are same: ${string1.equals(string2,true)}")

    var s = "I love you"
    //get a character with specific index
    println("2nd index: ${s[2]}")

    //a specific index from 2 to 5
    println("2nd index: ${s.subSequence(2,6)}")

    //check a word that's exist in a string
    println("Word is exist: ${s.contains("love")}")

    //done 20 min

}


