// https://www.acmicpc.net/problem/10828
// 스택
    
fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val stack = mutableListOf<Int>()

    repeat(N) {
        val command = readLine().split(" ")
        when(command[0]) {
            "pop" -> {
                if(stack.isNotEmpty()) println(stack.removeLast())
                else println("-1") 
            }
            "size" -> {
                println("${stack.size}")
            }
            "empty" -> {
                if(stack.isEmpty()) println("1")
                else println("0")
            }
            "top" -> {
                if(stack.isNotEmpty()) println("${stack.last()}")
                else println("-1")
            }
            else -> {
                stack.add(command[1].toInt())
            }
        }
    }
}
