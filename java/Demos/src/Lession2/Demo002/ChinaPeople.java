package Lession2.Demo002;

public class ChinaPeople extends People {
	
	public void chinaMartial(){
		System.out.println("china is martial");
	}
	
	@Override
	public void speakHello() {
		System.out.println("hello, i am a chinese");
	}
	
	@Override
	public void averageHeight() {
		System.out.println("我的身高是 " + super.height);
	}
	
	@Override
	public void averageWeight() {
		System.out.println("我的体重是 " + super.weight);
	}

	
}
