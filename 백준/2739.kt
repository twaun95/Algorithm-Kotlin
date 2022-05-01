// https://www.acmicpc.net/problem/2739

fun main() {
    val input = readLine()!!.toInt()

    for (i in 1..9) {
        println("$input * $i = ${input*i}")
    }
}