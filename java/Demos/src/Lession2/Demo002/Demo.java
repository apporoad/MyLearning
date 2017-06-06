package Lession2.Demo002;

/**
 * 题目 8：（1）封装一个People类型，具有height和weight属性，具有speakHello、averageHeight、averageWeight功能。
 * （2）封装一类ChinaPeople类型是People的子类，新增chinaMartial功能，override超类的speakHello、averageHeight、averageWeight功能。
 * （3）封装一类BeijingPeople类型是ChinaPeople的子类，新增BeijingOpera功能，override超类的speakHello、averageHeight、averageWeight功能。
 * （4）用一个程序执行入口Test测试上述对象。
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		People p1 = new People();
		p1.speakHello();
		p1.averageHeight();
		p1.averageWeight();
		
		ChinaPeople p2 = new ChinaPeople();
		p2.speakHello();
		p2.averageHeight();
		p2.averageWeight();
		p2.chinaMartial();
		
		BeijingPeople p3 = new BeijingPeople();
		p3.speakHello();
		p3.averageHeight();
		p3.averageWeight();
		p3.chinaMartial();
		p3.BeijingOpera();
	}
}
