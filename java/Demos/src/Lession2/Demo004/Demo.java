package Lession2.Demo004;

/**
 * 题目 10：中国特色社会主义的体制中有这样的现象：地方省政府要坚持党的领导和按照国务院的指示进行安全生产。请编写一个java应用程序描述上述的体制现象。要求如下：
（1）该应用程序中有一个“党中央”接口：CentralPartyCommittee，该接口中有个“坚持党的领导”方法：void partyLeader()
（2）该应用程序中有一个“国务院”抽象类：StateCouncil，该抽象类中有个“安全生产”的抽象方法：abstract void safetyInProduction()
（3）该应用程序中有一个“省政府”类：Province，该类继承StateCouncil抽象类并且实现CentralPartyCommittee接口；在实现partyLeader()方法时输出“我们各省人民一定坚持党的领导！”；在重写safetyInProduction()方法时输出“我们各省人民一定按照国务院的指示进行安全生产！”。
（4）该应用程序中有一个主类E，在主类E的main方法中创建Province类的对象，来测试Province类的功能。
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		Province p = new Province();
		
		p.partyLeader();
		p.safetyInProduction();
	}
}
