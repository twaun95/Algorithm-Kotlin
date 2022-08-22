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


// 재귀(기록 없음)
// dp (Bottom-UP)(Tabulation) : 0,1, 부터 채워나가기
// dp (Top-Down)(Memorization) : 재귀를 이용한 기록