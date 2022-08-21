// https://www.acmicpc.net/problem/10870

fun main() = with(System.`in`.bufferedReader()) {

    println(fib(readLine().toInt()))
}

fun fib(n: Int) : Int{
    return when(n) {
        0, 1 -> n
        else -> {
            fib(n-2) + fib(n-1)
        }
    }
}
