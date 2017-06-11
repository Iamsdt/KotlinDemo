package firstClass

import java.util.*

/**
 * Created by Shudipto on 5/31/2017.
 */

fun main(arg: Array<String>){

    //books name
    val booksName = arrayOf("java","c","c++","kotlin","c#","html")

    val scanner = Scanner(System.`in`)

    val studentDiscount = .25f
    val teacherDiscount = .15f

    println("*************WELCOME TO OUR BOOK STORE**********")
    println("Which book do you want?")
    print("Answer: ")
    val book = scanner.nextLine()

    if (booksName.contains(book.toLowerCase())){
        println("You Want $book book. price 200 Tk.")
        println("we have some discount for student and teacher.\nWhat is your occupation?")
        print("Answer: ")
        val occupation = scanner.nextLine()

        when(occupation.toLowerCase()){
            "student" -> {
                calculatePrice(studentDiscount)
            }

            "teacher" ->{
                calculatePrice(teacherDiscount)
            }

            else -> println("Sorry you don't get any discount."+
                            "\nYour total payable price is 200 TK.")
        }

    } else{
        println("Sorry we don't have $book book")
    }
}

private fun calculatePrice(x: Float): Unit {
    var price = 200f
    price -= price * x

    println("Your total payable price is $price TK.")
}