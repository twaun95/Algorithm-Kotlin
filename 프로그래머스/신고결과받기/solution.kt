class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answerList: MutableList<Int> = mutableListOf()
        var map: MutableMap<String, MutableSet<String>> = mutableMapOf() 
        var kMap: MutableMap<String, Int> = mutableMapOf()

        id_list.forEach{
            map.put(it, mutableSetOf())
            kMap.put(it, 0)
        }

        report.forEach{ 
            it.split(" ").let { splitedReport ->
                map[splitedReport.first()]!!.add(splitedReport.last())
            }
        }

        map.forEach {
            it.value.forEach {
                kMap[it] = kMap[it]!!.plus(1)
            }
        }

        id_list.forEachIndexed { index, item ->
            answerList.add(0)
            map[item]!!.forEach {
                if(kMap[it]!!>=k) {
                    answerList[index] += 1 
                }
            }
        }

        return answerList.toIntArray()
    }
}

fun main() {
    Solution().solution(
        arrayOf("muzi", "frodo", "apeach", "neo"),
        arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"),
        2
    )

    // Solution().solution(
    //     arrayOf("con", "ryan"),
    //     arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
    //     3
    // )
}