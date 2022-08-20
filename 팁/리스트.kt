fun main() = with(System.`in`.bufferedReader()) {

    val list = mutableListOf(1,2,3)
    val list2 = mutableListOf<Int>()
    val list3 = MutableList<Int>(3) { it*it }

    println(list)
    println(list2)
    println(list3)
}