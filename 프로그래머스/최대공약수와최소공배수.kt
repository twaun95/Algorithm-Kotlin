class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = IntArray(2)
        
        answer[0] = gcd(n, m)
        answer[1] = (n * m) / answer[0]
        
        return answer
    }
    
    fun gcd(a: Int, b: Int) : Int{
        return if (b==0) a
        else gcd(b, a%b)        
    }
}