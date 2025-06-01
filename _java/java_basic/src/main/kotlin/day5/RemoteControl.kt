package day5

interface RemoteControl {
    //추상 메소드
    fun turnOn()
    fun turnOff()
    fun setVolume(volume: Int)

    //디폴트 인스턴스 메소드
    fun setMute(mute: Boolean) {
        if (mute) {
            println("무음 처리합니다.")
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME)
        } else {
            println("무음 해제합니다.")
        }
    }

    companion object {
        //상수 필드
        const val MAX_VOLUME: Int = 10
        const val MIN_VOLUME: Int = 0
    }
}