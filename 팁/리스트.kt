fun main() = with(System.`in`.bufferedReader()) {

    val list = mutableListOf(1,2,3)
    val list2 = mutableListOf<Int>()
    val list3 = MutableList<Int>(3) { it*it }

    println(list)
    println(list2)
    println(list3)


    println()
    // subList ((포함)시작 인덱스, (제외)끝 인덱스))
    println(list.subList(1,2))

    // immutable list : sorted(), reversed(), sortedWith(), sortedBy{}
    // mutable list : sort(), reverse(), sortWith(), sortBy{}
    println()

    list.reverse()
    println(list)

    list.sort()
    println(list)

    // sortWith : compareBy<타입> 기준으로 정렬
    val strList = mutableListOf<String>("g", "gggg", "gg")
    strList.sortWith(compareBy<String> {it.length})
    println(strList)


    // sortBy : map 과 같이 타입이 다른 리스트를 정렬할 떄
    val mapList = mutableListOf("aaa" to 2, "bb" to 1, "c" to 33)
    mapList.sortBy {it.second}
    println(mapList)

    mapList.sortBy {it.first.length}
    println(mapList)

}