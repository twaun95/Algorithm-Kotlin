import java.util.Queue
import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M, K, X) = readLine().split(" ").map{ it.toInt() }

    // 그래프 정보입력(각 노드에 연결되어 있는 루트 그래프) - 인접리스트 방식  (이중배열은 인접행렬 방식)
    // index와 입력을 맞추기 위해 +1
    val graph = Array(N+1){mutableListOf<Route>()}
    // 거리를 담은 배열, INFINITE 값으로 초기화.
    val distance = IntArray(N+1){ Int.MAX_VALUE }
    // 시작노드(X)로 부터 인접해 있는 노드들을 담을 큐
    val queue: Queue<Route> = LinkedList()

    // 그래프 정보 입력
    repeat(M) {
        // a에서 b로 가는 노드, c: cost
        val (a, b, c) = readLine().split(" ").map{it.toInt()}
        graph[a] = Route(b,c)
    }

    // bfs

    // distance 배열 조회하며 최소거리 만족하면 출력

}

data class Route(val node: Int, val edge: Int)