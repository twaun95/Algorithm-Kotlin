// mutableList 를 stack 처럼! FILO 을 지켜주면 된다.

fun main() = with(System.`in`.bufferedReader()) {
    val stack = MutableList<Int>(3){it}

    println(stack)

    // push
    stack.add(4)
    println(stack)
    
    // pop
    stack.removeLast()
    println(stack)

    // top
    println(stack.last())

    
    println(stack.isEmpty())

}