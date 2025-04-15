fun main() {
    val arr1: IntArray         // 배열 변수 arr1 선언
    val arr2: IntArray         // 배열 변수 arr2 선언
    val arr3: IntArray         // 배열 변수 arr3 선언

    arr1 = intArrayOf(1, 2, 3) // 배열 {1, 2, 3}을 생성하고 arr1에 대입
    arr2 = intArrayOf(1, 2, 3) // 배열 {1, 2, 3}을 생성하고 arr2에 대입
    arr3 = arr2                // arr2를 arr3에 대입

    println(arr1 === arr2)     // arr1과 arr2가 같은 배열(객체)을 참조하는지 비교
    println(arr2 === arr3)     // arr2와 arr3이 같은 배열(객체)을 참조하는지 비교
}