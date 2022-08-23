// https://www.acmicpc.net/problem/18258
// 큐

import java.util.LinkedList
import java.util.Queue

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    val sb = StringBuilder()
    
    repeat(N) {
        val command = readLine().split(" ")
        when(command[0]) {
            "pop" -> {
                if(queue.isNotEmpty()) sb.append("${queue.remove()}\n")
                else sb.append("-1\n") 
            }
            "size" -> {
                sb.append("${queue.size}\n")
            }
            "empty" -> {
                if(queue.isEmpty()) sb.append("1\n")
                else sb.append("0\n")
            }
            "front" -> {
                if(queue.isNotEmpty()) sb.append("${queue.peek()}\n")
                else sb.append("-1\n")
            }
            "back" -> {
                if(queue.isNotEmpty()) sb.append("${queue.last()}\n")
                else sb.append("-1\n")
            }
            else -> {
                queue.add(command[1].toInt())
            }
        }
    }
    println(sb)
}

