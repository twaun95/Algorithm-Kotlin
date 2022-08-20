fun main() = with(System.`in`.bufferedReader()) {
    // 리스트를 마치 큐처럼
    // FIFO
    val queue = mutableListOf<Int>(1,2,3)


    // in
    queue.add(4)
    println(queue)

    // out
    queue.removeAt(0)
    println(queue)


    // java.util. 을 import하여 LinkedList 를 이용하는 방법.
    
}