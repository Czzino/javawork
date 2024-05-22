package _04_interface;

//interface 
//- 상속받을 떄 키워드 impliements 
//- 다중 상속 가능
public class Tv implements RemoteControl {

	private int volume;
	@Override
	public void trunOff() {
		System.out.println("tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume < RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else
			this.volume = volume;
		System.out.println("현재 음량 : " + this.volume); // 인스턴스 변수

	}

	@Override
	public void trunOn() {
		System.out.println("tv를 켭니다.");
		
	}

	@Override
	public void search(String msg) {
		System.out.println("msg");
	}
}
