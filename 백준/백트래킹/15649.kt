// https://www.acmicpc.net/problem/15649

fun main() = with(System.`in`.bufferedReader()) {

}

/*
백트래킹
n크기의 배열(1~n)과 m크기의 배열(자리수))

재귀함수 사용
: 사용한 수는 visit true로 바꿔주고 현재 자리 값 정해주고 dfs(), dfs돌고 나오면 다시 false로 하고 다시 새로운 arr

dfs()
종료조건 - 진행하는 index(자리수)가 m을 만족했을 때 
루프 - visit확인, true면 패스, false면 반영 / 1부터 n 까지 루프를 돌리므로 오름차순 만족.

+)StringBuilder()를 사용해서 append 후 마지막에 한번만 출력하면 속도 개선 가능.
*/