// https://www.acmicpc.net/problem/11399

// 1.
// fun main() = with(System.`in`.bufferedReader()) {
//     readLine()
//     val list = readLine().split(" ").map{ it.toInt()}.sorted()
//     var sum = list[0]

//     for (i in 1 until list.size) {
//         sum += list.subList(0,i+1).sum()
//     }

//     println(sum)
// }

// 2.
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{ it.toInt()}.sorted()
    var acc = 0

    for (i in 0 until n) {
        acc += (list[i]*(n-1-i))
    }
    
    println(acc+list.sum())
}