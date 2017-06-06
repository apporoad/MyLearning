package Lession2.Demo003;

/**
 * 题目 9：设计一个Shape接口和它的两个实现类Square和Circle，要求如下：
1）Shape接口中有一个抽象方法area()，方法接收有一个double类型的参数，返回一个double类型的结果
2）Square和Circle中实现了Shape接口的area()抽象方法，分别求正方形和圆形的面积并返回
在测试类中创建Square和Circle对象，计算边长为2的正方形面积和半径为3的圆形面积
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		IShape square = new Square();
		IShape circle = new Circle();
		System.out.println("边长2的正方形面积为" +  square.area(2));
		System.out.println("半径为3的圆形面积为" + circle.area(3*2));
	}
}
