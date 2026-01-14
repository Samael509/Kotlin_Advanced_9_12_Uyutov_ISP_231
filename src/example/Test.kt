package example

var age: Int = 18
    set(value){
        if((value > 0) and (value < 110))
            field = value
    }

data class Item(
    val id: Int,
    val name: String,
    val amount: Int
){
    override fun toString(): String {
        return "ID: $id | name: $name | amount: $amount"
    }
}

abstract class Human(val name: String){
    abstract var age: Int
    abstract fun hello()
}

class Person(name: String, override var age: Int) : Human(name) {
//    override var age: Int = 0

    override fun hello() {
        println("my name is $name")
    }
}

abstract class Figure{
    abstract  fun perimetr() : Float
    abstract  fun area() : Float
}

class Reactangle(val width: Float, val height: Float) : Figure(){
    override fun perimetr(): Float {
        return 2 * (width + height)
    }

    override fun area(): Float {
        return width * height
    }
}

fun main(){
//    println(age)
//    age = 45
//    println(age)
//    age = -334
//    println(age)
//    val sword = Item(1,"Sword", 1)
//    val betterSword = sword.copy(amount = 2, name = "better Sword")
//    println(sword.toString())
//    println(betterSword.toString())
//    val(id, name, amount) = betterSword
//    println("$id | $name | $amount")
    val alo: Human = Person("alo", 24)
    val ale: Person = Person("ale", 22)
}