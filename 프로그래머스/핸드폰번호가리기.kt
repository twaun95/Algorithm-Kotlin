class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        for (i in 0 until phone_number.length) {
            if(i < phone_number.length-4) {
                answer += '*'
            } else {
                answer += phone_number.get(i)
            }
        }
        
        return answer
    }
}