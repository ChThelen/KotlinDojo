package dojo


class Dojo {
    fun doTask(count: Int) : Int{
        return Math.pow(count.toDouble(), 2.0).toInt();
    }
}

fun main(args : Array<String>) {
    val dojo: Dojo = Dojo()
    println("I'm alive!")
    println(dojo.doTask(3))
}