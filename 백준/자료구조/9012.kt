// https://www.acmicpc.net/problem/9012

fun main() = with(System.`in`.bufferedReader()) {
    val T = readLine().toInt()
    val stack = mutableListOf<Char>()

    repeat(T) {
        val PS = readLine()

        for (ps in PS) {
            if(ps==')') {
                if(stack.isEmpty()) {
                    println("NO")
                    return@repeat
                } else {
                    stack.removeLast()
                }
            } else {
                stack.add(ps)
            }
        }
        
        if(stack.isEmpty()) println("YES")
        else println("NO")

        stack.clear()
    }
}