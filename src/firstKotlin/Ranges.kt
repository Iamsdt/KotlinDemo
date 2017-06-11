package firstClass

/**
 * Created by Shudipto on 5/31/2017.
 */

fun main(arg: Array<String>){
    ranges()
}

fun conditions(): Unit {
    val age = 10

    if (age <= 5){
        println("Go to preSchool")

    } else if (age in 5..9){
        println("Go to PrimarySchool")

    } else if(age >= 10) {
        println("Go to HighSchool")

    } else{
        println("Go to College")

    }

    when(age){

        0,1,2,3,4,5 -> println("Go to preSchool")

        in 6..9 -> println("Go to PrimarySchool")

        10 -> println("Go to HighSchool")

    //default conditions
        else -> println("Go to College")

    }
}

fun ranges(){
    val oneToTen = 1..10

    val alpha = "A".."Z"

    println("R in alpha: ${"R" in alpha}")

    val tenDownToOne = 10.downTo(1)

    //val twoTO20 = 2.rangeTo(20)

    val range3 = oneToTen.step(3)

    for (x in range3) println("range 1: $x")

    for (x in tenDownToOne) println("reverse: $x")

    //suppose you need to print line with 5 gap

    val oneTo100 = 1..100
    val range5 = oneTo100.step(5)
    for (x in range5) println("range 1: $x")

    for (x in tenDownToOne.reversed()) println("reversed: $x")
}