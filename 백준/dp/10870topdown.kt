// https://www.acmicpc.net/problem/10870
// top_down

val arr = LongArray(91){ (-1) } // 0~90

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    arr[0] = 0
    arr[1] = 1

    println(fib(n))
}

fun fib(i: Int) : Long{
    if(arr[i]>-1) return arr[i]
    
    arr[i] = fib(i-1) + fib(i-2)

    return arr[i]
}


// 재귀(기록 없음)
// dp (Bottom-UP)(Tabulation) : 0,1, 부터 채워나가기
// dp (Top-Down)(Memorization) : 재귀를 이용한 기록