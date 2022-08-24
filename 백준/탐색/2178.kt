// https://www.acmicpc.net/problem/2178

import java.util.Queue
import java.util.LinkedList

val dx = intArrayOf(1,0,-1,0)
val dy = intArrayOf(0,-1,0,1)

lateinit var graph : Array<IntArray>
lateinit var visit : Array<BooleanArray>

data class Room(val x: Int, val y: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(" ").map{ it.toInt() }
    graph = Array(N){ IntArray(M) }
    visit = Array(N){ BooleanArray(M) }

    repeat(N) { n ->
        val mList = readLine().map{it.toString().toInt()}

        for(i in 0 until M) {
            graph[n][i] = mList[i]
        }
    }

    bfs(0, 0, N, M)
    println(graph[N-1][M-1])
}

fun bfs(x: Int, y: Int, height: Int, width: Int) {
    val queue: Queue<Room> = LinkedList()

    queue.offer(Room(x,y))
    visit[x][y] = true

    while (queue.isNotEmpty()) {
        val current = queue.poll()

        for(i in 0 until 4) {
            val n = current.x + dx[i]
            val m = current.y + dy[i]
            
            if(n<0 || m<0 || n>=height || m>=width) continue
            if(visit[n][m] || graph[n][m]==0 ) continue

            queue.offer(Room(n, m))
            graph[n][m] = graph[current.x][current.y] + 1
            visit[n][m] = true
        }
    }    
}