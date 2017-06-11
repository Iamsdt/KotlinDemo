package secondclass

import java.util.*

/**
 * Created by Shudipto on 6/4/2017.
 */

fun main(arg: Array<String>): Unit {

        //higher order function

    //get even number from 1 to 20

    val numberList = 1..20

    //if funcation has one paramiter then we can use it
    // instede of declear it
    val evenlist = numberList.filter { it % 2 == 0}
    evenlist.forEach { n -> println(n) }

    //finished 53 min

    val multi3 = makeMath(5)
    println("5 * 3 = ${multi3(3)}")

    //val multiply2 = {num2:Int -> num2 * 2}

}

//fun mathOnList(numberList: Array<Int>){}

//created funcation that's return funcation
fun makeMath(num:Int): (Int) -> Int ={num1 -> num * num1}

fun funcation(){

    val two = 2
    val three = 3

    val new = two + three
    println(new)

    fun add(num1:Int,num2:Int):Int = num1 + num2
    println("2 + 5 = ${add(2,5)}")

    fun substract(num1:Int,num2:Int) = num1 - num2
    println("5 - 2 = ${substract(5,2)}")

    fun multiply(num1:Int = 1,num2:Int = 2) = num1 * num2
    println("5 * 2 = ${multiply(num1 = 5,num2 = 2)}")

    //another way to use
    val divided = {num1:Int,num2:Int -> num1 / num2}

    println("5 divided by 3: ${divided(5,3)}")


    //don't return any things
    //void methods just java
    fun sayHello(name : String): Unit = println("Hello $name")
    println("Say hello to Shudipto: ${sayHello("Shudipto")}")

    sayHello("shudipto")

    println("\n\n")
    //println("Next two number of 5: ${nextTwo(5)}")

    //val (firstOne, secondOne) = nextTwo(5)
    //println("baseNumber: 5, $firstOne,$secondOne")

    //get number
    //println("Summation number ${getSum(1,2,20,20)}")

    //function for return two value

    fun nextTwo(num:Int): Pair<Int,Int>{
        return Pair(num+1,num+2)
    }

    //give an array and add all the number
    fun getSum(vararg numbers : Int) : Int{
        var sum = 0

        numbers.forEach { n -> sum += n}

        return sum
    }
}

fun loop(){

    for (x in 1..10){
        println("Loop: $x")
    }

    val random = Random()
    val magicNumber = random.nextInt(50) + 1

    var number = 0

    while (magicNumber != number){
        number += 1
    }

    println("\n\n")
    println("Random number: $number")

    println("\n\n")
    for (x in 1..20){
        if (x % 2 == 0 ){
            continue
        }
        println("Odd value: $x")
    }

    val array: Array<Int> = arrayOf(1,23,34,45,57,68,79)

    println("\n\n")
    for (x in array.indices){
        println("Multi 3: ${array[x]}")
    }

    println("\n\n")
    for ((index,value) in array.withIndex()){
        println("Index: $index value $value")

    }
}