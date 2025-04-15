fun main(){

    //길이 3인 배열
    val oldIntArray = intArrayOf(1, 2, 3)

//길이 5인 배열을 새로 생성
    val newIntArray = IntArray(5)

//배열 항목 복사
    for (i in oldIntArray.indices) {
        newIntArray[i] = oldIntArray[i]
    }


//배열 항목 출력
    for (i in newIntArray.indices) {
        print(newIntArray[i].toString() + ", ")
    }
}