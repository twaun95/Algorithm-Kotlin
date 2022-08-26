// https://www.acmicpc.net/problem/18352
// 특정 거리의 도시 찾기

import java.util.Queue
import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M, K, X) = readLine().split(" ").map{ it.toInt() }

    val graph = Array(N+1){mutableListOf<Route>()}
    val distance = IntArray(N+1){ Int.MAX_VALUE }
    val queue: Queue<Route> = LinkedList()

    repeat(M) {
        val (a, b) = readLine().split(" ").map{it.toInt()}
        graph[a].add(Route(b,1))
    }


    // bfs()

    // 시작 노드, 자기 자신은 0
    queue.add(Route(X,0))
    distance[X] = 0

    while(queue.isNotEmpty()) {
        val (current, dist) = queue.poll()

        // 기존 저장된 distance < 현재 이동한 노드의 distance 이면 continue (왜? 최소 거리를 저장해야하기 때문에)

        // 인접리스트에서 연결된 노드들 확인
        for (i in graph[current]) {
            val cost = dist + i.edge
            if(cost < distance[i.node]) {
                queue.add(Route(i.node, cost))
                distance[i.node] = cost
            }
        }
    }


    val sb = StringBuilder()

    // distance 배열 조회하며 최소거리 만족하면 출력
    for (i in distance) {
        if(i==K) sb.append("$i")
    }

    if(sb.isEmpty()) println("-1") else println(sb.toString())
}


data class Route(val node: Int, val edge: Int)