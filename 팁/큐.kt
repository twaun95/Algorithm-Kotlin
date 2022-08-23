
import java.util.LinkedList
import java.util.Queue

fun main() = with(System.`in`.bufferedReader()) {
    // java.util. 을 import하여 LinkedList 를 이용하는 방법.
    val queue: Queue<Int> = LinkedList()


    // add(Exception) / offer
    // Remove(Exception) / poll
    // element(Exception), peek(null)

    queue.offer(1)
    queue.offer(2)
    queue.offer(3)

    println(queue)
    queue.poll()
    println(queue)
    println(queue.peek())
}