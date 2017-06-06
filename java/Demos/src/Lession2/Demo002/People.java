package Lession2.Demo002;

/**
 * 题目 8：（1）封装一个People类型，具有height和weight属性，具有speakHello、averageHeight、averageWeight功能。
 * （2）封装一类ChinaPeople类型是People的子类，新增chinaMartial功能，override超类的speakHello、averageHeight、averageWeight功能。
 * （3）封装一类BeijingPeople类型是ChinaPeople的子类，新增BeijingOpera功能，override超类的speakHello、averageHeight、averageWeight功能。
 * （4）用一个程序执行入口Test测试上述对象。
 * @author Administrator
 *
 */
public class People {
	protected int height=100;
	protected int weight=178;
	
	public void speakHello(){
		System.out.println("hello");
	}
	
	public void averageHeight()
	{
		System.out.println("my height is " + height);
	}
	
	
	public void averageWeight()
	{
		System.out.println("my weigth is " + weight);
	}
}
