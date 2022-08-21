// https://www.acmicpc.net/problem/3052

fun main() = with(System.`in`.bufferedReader()) {
    val inputArr = IntArray(10)

    repeat(10) {index ->inputArr[index] = readLine().toInt()%42}

    println(inputArr.toSet().size)
}