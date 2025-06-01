package day5


class Audio : RemoteControl {
    private var volume = 0

    //turnOn() 추상 메소드 오버라이딩
    override fun turnOn() {
        println("Audio를 켭니다.")
    }

    //turnOff() 추상 메소드 오버라이딩
    override fun turnOff() {
        println("Audio를 끕니다.")
    }

    override fun setVolume(volume: Int) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME
        } else {
            this.volume = volume
        }
        println("현재 Audio 볼륨: $volume")
    }

    //필드
    private var memoryVolume = 0

    //디폴트 메소드 재정의
    override fun setMute(mute: Boolean) {
        if (mute) {
            this.memoryVolume = this.volume
            println("무음 처리합니다.")
            setVolume(RemoteControl.MIN_VOLUME)
        } else {
            println("무음 해제합니다.")
            setVolume(this.memoryVolume)
        }
    }
}