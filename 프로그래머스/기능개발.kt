import java.util.Queue
import java.util.LinkedList

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val queue : Queue<Int> = LinkedList()
        
        for(i in 0 until progresses.size){
            val deadline = (100-progresses[i])%speeds[i]
            if(deadline==0) {
                queue.add((100-progresses[i])/speeds[i])
            } else {
                queue.add(((100-progresses[i])/speeds[i]) +1)
            }
        }
        
        while(queue.isNotEmpty()) {
            val current = queue.poll()
            var count = 1
            
            while(queue.isNotEmpty() && current>=queue.peek()){
                queue.poll()
                count++
            }
            
            answer.add(count)
        }
        
        return answer.toIntArray()
    }
}