package thirdClass

/**
 * Created by Shudipto on 6/10/2017.
 */

open class Animal(val name:String,
                  var height:Double,
                  var weight:Double){
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)){
            println("Animal name can not contain Numbers")
        }

        require(height >= 0){
            println("Animal Height must be grater than zero")
        }

        require(weight >= 0){
            println("Animal Weight must be grater than zero")
        }
    }

    open fun AllInfo():Unit {
        println("Name: $name Height: $height cm weight: $weight kg")
    }
}

class Dog(name: String,
          height: Double,
          weight: Double,
          var ownerShip:String) : Animal(name, height, weight){

    override fun AllInfo() {
        //super.AllInfo()
        println("Name: $name Height: $height cm weight: $weight kg and is owned by $ownerShip")
    }
}

interface FlayAble{
    var flies:Boolean
    fun fly(miles: Int):Unit
}

class Bird constructor(val name: String,
                       override var flies:Boolean = true)
    :FlayAble{
    override fun fly(miles: Int) {
        if (flies) println("$name fly miles: $miles")
    }
}

fun main(args: Array<String>){
    val animal = Animal("Tommy",21.05,12.00)
    animal.AllInfo()

    val animal2 = Dog("TommyNew",15.05,12.07,"Shudipto")
    animal2.AllInfo()

    val b = Bird("Crow",true)
    b.fly(122)
}
