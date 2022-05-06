//https://www.acmicpc.net/problem/10950

fun main() {

    val inputCount = readLine()!!.toInt()
    var result = mutableListOf<Int>()
    
    for(i in 0..inputCount-1) {
        result.add(
            readLine()!!
            .split(" ")
            .fold(0){ acc, c ->
                acc + c.toInt()
            }
        )
    }


    for(i in 0..inputCount-1) {
        println(result[i])
    }
}

/*
입력 받은 수만큼 다시 입력받기
 */