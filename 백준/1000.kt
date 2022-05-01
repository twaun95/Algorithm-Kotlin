// https://www.acmicpc.net/problem/1000

fun main() {

    //1
    println(
        readLine()!!
        .split(" ")
        .sumOf { it.toInt()}
    )

    //2
    println(
        readLine()!!
        .split(" ")
        .fold(0) { acc,c ->
            acc+c.toInt()
        }
    )
}


/*
입력

readLine()!! 사용
split() -> list 생성

이후에는 바로 값을 구하든,
map을 해서 원하는 형태의 list를 생성하든, 
다양한 방법 존재
 */