// https://www.acmicpc.net/problem/10818

fun main() {
    readLine()!!.toInt()
            
    val list = readLine()!!
        .split(" ")
        .map{ it.toInt() }

    var min = list[0]
    var max = list[0]
    
    for ( i in 1..list.size-1) {
        if(min > list[i]) { min = list[i]}
        if(max < list[i]) { max = list[i]}
    }        

    println("$min $max")
}