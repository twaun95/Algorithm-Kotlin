fun main() = with(System.`in`.bufferedReader()) {
    // FIFO

    // 1. 리스트를 마치 큐처럼
    // 모두 사이즈 관련 에러는 Exeption
    val queue = mutableListOf<Int>(1,2,3)


    queue.add(4)
    println(queue)

    queue.removeAt(0)
    println(queue)

    println(queue.first())
    println(queue.isEmpty())


    // 2. java.util. 을 import하여 LinkedList 를 이용하는 방법.

    // add(Exception) / offer
    // Remove(Exception) / Poll
    // element(Exception), peak(null)

}