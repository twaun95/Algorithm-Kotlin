fun main() = with(System.`in`.bufferedReader()) {

    val list = mutableListOf(1,2,3)
    val list2 = mutableListOf<Int>()
    val list3 = MutableList<Int>(3) { it*it }

    println(list)
    println(list2)
    println(list3)


    // subList ((포함)시작 인덱스, (제외)끝 인덱스))
    println(list.subList(1,2))
}