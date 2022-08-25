// 1. Kotlin의 / 연산자는 소수점 나와도 Int로 리턴
// 2. string.get() extension function
class Solution {
    fun solution(s: String): String {
        var answer = ""
        
       if (s.length % 2 == 0) {
            answer = s.get((s.length / 2) - 1).toString() + s.get(s.length / 2).toString()
        } else {
            answer = s.get(s.length / 2).toString()
        }
        return answer
    }
}