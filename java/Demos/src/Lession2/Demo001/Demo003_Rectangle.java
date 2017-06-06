package Lession2.Demo001;

/**
 *  题目 6
 *  
 *  定义长方形类，含：
  属性：宽、高（整型）；
  方法：求周长、面积；
  构造方法3个：（1）无参——宽、高默认值为1；
（2）1个参数——宽、高均为参数值；
（3）2个参数——宽、高各为参数值。
  要求：进行测试。
 * @author Administrator
 *
 */
public class Demo003_Rectangle {
	
	public static void main(String[] args) {
		Demo003_Rectangle r = new Demo003_Rectangle();
		System.out.println("默认构造   周长" + r.getGirth() + " 面积:" + r.getArea());
		
		r = new Demo003_Rectangle(2);
		System.out.println("构造1(2) 周长" + r.getGirth() + " 面积:" + r.getArea());
		
		r = new Demo003_Rectangle(3,2);
		System.out.println("构造2(3,2) 周长" + r.getGirth() + " 面积:" + r.getArea());
	}
	
	private int _width;
	private int _height;
	
	public Demo003_Rectangle(){ 
		this._height=1;
		this._width=1;
	}
	
	public Demo003_Rectangle(int length){ 
		this._height=length;
		this._width=length;
	}
	
	public Demo003_Rectangle(int width,int height){ 
		this._height=width;
		this._width=height;
	}
	
	/**
	 * 周长
	 * @return
	 */
	public int getGirth()
	{
		return 2*(_width + _height);
	}
	
	/**
	 * 面积
	 * @return
	 */
	public int getArea()
	{
		return _width * _height;
	}
}
