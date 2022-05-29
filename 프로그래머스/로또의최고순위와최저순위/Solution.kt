class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: MutableList<Int> = mutableListOf()
        var miss_count = 0
        var match_count = 0

        lottos.forEach { if(it==0) { miss_count++ } }

        lottos.forEach { lotto ->
            win_nums.forEach { win_num ->
                if(lotto==win_num) { match_count++ }
            }
        }
        
        answer.add(ranking(match_count+miss_count))
        answer.add(ranking(match_count))

        return answer.toIntArray()
    }

    fun ranking(count: Int) : Int {
        return when {
            count >= 6 -> 1
            count == 5 -> 2
            count == 4 -> 3
            count == 3 -> 4
            count == 2 -> 5
            else -> 6
        }
    }
}

fun main() {
    Solution().solution(
        intArrayOf(44, 1, 0, 0, 31, 25),
        intArrayOf(31, 10, 45, 1, 6, 19)
    )
}