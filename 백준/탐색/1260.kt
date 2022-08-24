// https://www.acmicpc.net/problem/1260

import java.util.LinkedList
import java.util.Queue

lateinit var graph : Array<IntArray>
lateinit var visit : BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M, V) = readLine().split(" ").map{ it.toInt() }

    graph = Array(N){ IntArray(N)} 
    visit = BooleanArray(N)

    repeat(M) {
        val (x, y) = readLine().split(" ").map{ it.toInt()-1 }
        graph[x][y] = 1
        graph[y][x] = 1
    }

    println(dfs(N, V-1).trimEnd())
    visit.fill(false) 
    println(bfs(N, V-1).trimEnd())
}

fun dfs(n: Int, v: Int) : String{
    val sb = StringBuilder()
    visit[v] = true
    sb.append("${v+1} ")

    for (i in 0 until n) {
        if(graph[v][i]==1 && !visit[i]) {
            sb.append(dfs(n, i))
        }
    }

    return sb.toString()
}

fun bfs(n: Int, start: Int) : String{
    val sb = StringBuilder().apply{ append("${start+1} ") }
    val queue: Queue<Int> = LinkedList()

    queue.add(start)
    visit[start] = true

    while(queue.isNotEmpty()) {
        val current = queue.poll()
        for (i in 0 until n) {
            if(graph[current][i]==1 && !visit[i]){
                queue.offer(i)
                visit[i] = true
                sb.append("${i+1} ")
            }
        }
    }

    return sb.toString()
}