//https://www.acmicpc.net/problem/1330

fun main() {
    val input = mutableListOf<Int>()

    readLine()!!
    .split(" ")
    .map{ it.toInt() }
    .forEach{ input.add(it) }

    println ( 
        when {
            input[0] > input[1] -> ">"
            input[0] < input[1] -> "<"
            else -> "=="
        }
    )
}