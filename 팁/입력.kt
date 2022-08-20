fun main() = with(System.`in`.bufferedReader()) {

    // System.`in`.bufferedReader() 를 통해 !! 없애줌
    val input = readLine()

    // 정수하나
    println(input.toInt())

    // 빈칸을 기준으로 나누고 인트타입으로 바꿔 리스트로
    println(
        input
        .split(" ")
        .map{ it.toInt()}
    )
}