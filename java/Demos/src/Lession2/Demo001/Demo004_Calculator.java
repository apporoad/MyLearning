package Lession2.Demo001;

/**
 * 题目 7：定义一个计算器类，包括加、减、乘、除运算   要求：进行测试。
 * @author Administrator
 *
 */
public class Demo004_Calculator {
	
	public static void main(String[] args) {
		Demo004_Calculator calc = new Demo004_Calculator();
		System.out.println("10 + 7 =" + calc.plus(10, 7));
		System.out.println("100 - 77 =" + calc.minus(100, 77));
		System.out.println("25 X 5 =" + calc.multi(25, 5));
		System.out.println("10 / 7 =" + calc.divide(10, 7));
	}
	
	public int plus(int p1,int p2)
	{
		return p1 +p2;
	}
	
	public int minus(int p1,int p2)
	{
		return p1 -p2;
	}
	
	public int multi(int p1,int p2)
	{
		return p1* p2;
	}
	
	public double divide(int p1,int p2)
	{
		if(p2 ==0) return 0;
		return p1*1.0/p2;
	}
}
