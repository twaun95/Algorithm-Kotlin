fun main() = with(System.`in`.bufferedReader()) {

    val intArr = intArrayOf(1,2,3)
    val arr = arrayOf<Int>(4,5,6)

    // 배열 출력 
    println(intArr.contentToString())
    println(arr.contentToString())




    // 이중배열

    // 1. arrayOf()
    val dArr = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))

    println()
    dArr.forEach{ println(it.contentToString()) }

    // 2. Arr Constructor
    // column, row 를 통해  초기화
    val row = 2
    val col = 3

    val dArr2 = Array(row){ IntArray(col)}
    val dArr3 = Array(row){ IntArray(col){ 3 } }
    val dArr4 = Array(row){ row ->
        IntArray(col) { col ->
            row + col
        }
    }

    println()
    dArr2.forEach{ println(it.contentToString()) }
    dArr3.forEach{ println(it.contentToString()) }
    dArr4.forEach{ println(it.contentToString()) }


}