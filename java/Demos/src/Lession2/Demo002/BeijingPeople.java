package Lession2.Demo002;


public class BeijingPeople extends ChinaPeople {

	public void BeijingOpera()
	{
		System.out.println("我唱。。。。。");
	}
	
	@Override
	public void speakHello() {
		System.out.println("你好，俺是北京人");
	}
	
	@Override
	public void averageHeight() {
		System.out.println("俺是很高，是：" + super.height);
	}
	
	@Override
	public void averageWeight() {
		System.out.println("俺是不胖，就：" + super.weight);
	}
}
