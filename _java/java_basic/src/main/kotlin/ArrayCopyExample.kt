fun main(){

    //길이 3인 배열
    val oldStrArray = arrayOf("java", "array", "copy")

//길이 5인 배열을 새로 생성
    val newStrArray = arrayOfNulls<String>(5)

//배열 항목 복사
    System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.size)

//배열 항목 출력
    for (i in newStrArray.indices) {
        print(newStrArray[i] + ", ")
    }
}