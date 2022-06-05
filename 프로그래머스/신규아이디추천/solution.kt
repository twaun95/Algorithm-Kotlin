class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""

        //1
        answer = new_id.lowercase()
  
        //2
        var temp = StringBuilder()
        val regex = Regex("[a-z0-9-_.]")
        for (i in answer) {
            if(regex.containsMatchIn(i.toString())) {
                temp.append(i)
            }
        }
        answer = temp.toString()
        //3
        answer = answer.replace("..", ".")

        //4

        if(answer.first()=='.') {
            answer = answer.substring(1, answer.length-1)
        }

        if(answer.last()=='.') {
            answer = answer.substring(0, answer.length-2)
        }

        //5
        answer = if(answer.isEmpty()) "a" else answer

        
        //6
        if(answer.length>15) {
            answer = answer.substring(0,15)
        }

        //7

        while(answer.length<3) {
            answer += answer.first()
        }
        return answer
    }
    

  
       
}

fun main() {
    Solution().solution(".11.ABC..")
}