// https://www.acmicpc.net/problem/2606
// 바이러스

import java.util.Queue
import java.util.LinkedList

lateinit var computers : Array<MutableList<Int>>
lateinit var visit : BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    val computerNum = readLine().toInt()
    val virusCount = readLine().toInt()

    computers = Array(computerNum+1) { mutableListOf() }
    visit = BooleanArray(computerNum+1)

    // 초기화
    repeat(virusCount) {
        val (n,m) = readLine().split(" ").map{ it.toInt() }
        computers[n].add(m)
        computers[m].add(n)
    }

    println(bfs(1))
}

fun bfs(n: Int) : Int{
    val queue: Queue<Int> = LinkedList()
    var totalVirus = 0

    queue.offer(n)
    visit[n] = true

    while(queue.isNotEmpty()) {
        val current = queue.poll()
        for (i in computers[current]) {
            if(!visit[i]) {
                queue.offer(i)
                visit[i] = true
                totalVirus++
            }
        }
    }

    return totalVirus
}


// 1. 연결 확인 하는 이중배열 생성 -> Array<ArrayList>>
// 2. visit 배열 생성 -> visit Array
// 2. bfs(queue) / dfs(stack) 선택 -> Queue LinkedList 
// 3. empty 할 때 까지 루프 횟수++ -> count
// 4. 횟수 == 결과