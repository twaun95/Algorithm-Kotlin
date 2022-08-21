// https://www.acmicpc.net/problem/2675

// 1
fun main() = with(System.`in`.bufferedReader()) {
    val T = readLine().toInt()
    var R: Int 
    var S: String

    repeat(T){
        readLine().split(" ").also{
            R = it[0].toInt()
            S = it[1].toString()
        }
        
        var P = ""
        S.map{it}.forEach{s ->
            var p = ""
            for (i in 0 until R) {
                p += s
            }
            P += p
        }

        println(P)
    }
}

// 2
// fun main() = with(System.`in`.bufferedReader()) {
//     val T = readLine().toInt()
//     var R: Int 
//     var S: String

//     repeat(T){
//         readLine().split(" ").also{
//             R = it[0].toInt()
//             S = it[1].toString()
//         }
        
//         var P = ""
//         S.map{it}.forEach{
//             P += "$it".repeat(R)
//         }

//         println(P)
//     }
// }