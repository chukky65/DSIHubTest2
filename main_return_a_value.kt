fun main() {
    /*5 Function which returns a value

     */
    println(add (num1:10, num2:20))
    println(fullname(“chuks”, “okafor”))
    println(greetings(greet:”How are you?”, name:”chuks”))
    println(getmax(num1:2, num2:5))
    println(Findsum(num1:14.0, num2:5.0))

    fun add (num1:Int, num2:Int): Int{
        return num1 + num2 }

    fun fullname (Firstname:String, Lastname:String):String{
        val fname=”Firstname + Lastname”
        return fname
    }
    fun greeting (greet: String, name:String) :String {
        return “$greet $name”
    }
    fun getmax (num1:Int, num2:Int) :Int{
        val max:Int= if (num1>num2) num1
        else num2
                return max
    }
    Fun Findsum(num1:Double, num2:Double) : Int {
        Var sum =num1 + num2
        return Sum.toInt()
    }

}