// https://www.acmicpc.net/problem/10870
// bottom_up

fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(21) // 0~20
    val n = readLine().toInt()

    arr[1] = 1

    for (i in 2..n) {
        arr[i] = arr[i-1] + arr[i-2]
    }

    println(arr[n])
}