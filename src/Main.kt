fun main() {
    val mercy = Banker("rehema",20)
    val farmer = Farmer("gatweri",21)
    mercy.talk()
farmer.talk()
    mercy.eat()
    farmer.dig()
    farmer.eat()
}

open class Person(name: String,age:Int){

    fun talk(){
        println("iiee")
    }
  open  fun eat(){
        println()
    }
    fun sleep(){
        println("zzzz")
    }

}

class Banker(name:String,age:Int):Person(name,age) {


    fun countMoney() {
        println("pesa")
    }
}


class Farmer(name:String,age:Int):Person(name,age){
    fun dig(){
        println("kokoko")
    }

    override fun eat() {
        super.eat()
        println("yummmmmmiiie")
    }
}





