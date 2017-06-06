package Lession2.Demo005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 题目 11  12
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		//题目 11：创建一个List集合对象, 添加20个30以内的随机整数, 并打印输出
		System.out.println("题目 11：");
		ArrayList<Integer>  array = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0;i<20;i++)
		{
			array.add(rand.nextInt(30));
		}
		for(int v : array)
		{
			System.out.print(v + " ");
		}
		System.out.println();
		
		//题目 12：声明一个Set集合,只能保存Double类型的数据, 保存10个随机100以内的数, 找出最大值和最小值,打印输出.
		System.out.println("题目 12：");
		Set<Double> set = new HashSet<Double>();
		for(int i=0;i<10;i++)
		{
			set.add(rand.nextDouble()*100);
		}
		for(Double v : set)
		{
			System.out.print(v + " ");
		}
		System.out.println();
		System.out.println("最大值：" + Collections.max(set));
		System.out.println("最小值：" + Collections.min(set));
		
		//题目 13：写一个Student类, 包含属性id[1-30), grade[1-6], score[0-100], 所有属性都是随机生成  
		//创建一个Set集合, 保存20个对象, 如果两个对象的id是一样的,则不允许添加.  
		//使用迭代器遍历集合,打印输出对象的信息, 并找出分数最高的同学和分数最低的同学, 最后打印输出最高分和最低分同学信息.  
		System.out.println("题目 13：");
		HashSet<Student> students = new HashSet<Student>();
		for(int i =0 ;i< 20 ;i++)
		{
			Student s = new Student();
			if(students.contains(s))
			{
				i--;
				continue;
			}
			students.add(s);
		}
		Iterator<Student> it = students.iterator();  
		while (it.hasNext()) {  
		  Student stu = it.next();  
		  System.out.print(stu + "   |   ");
		}  
		System.out.println();
		System.out.println("max:" + Collections.max(students));
		System.out.println("min:" + Collections.min(students));
		
		//题目 14：（Map）利用Map，完成下面的功能：
//		已知学校教学课程如下
//
//		1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述课程安排。
//		2） 增加了一位新老师Allen 教JDBC
//		3） Lucy 改为教CoreJava
//		4） 遍历Map，输出所有的老师及老师教授的课程
//		5） 利用Map，输出所有教JSP 的老师。
		System.out.println("题目 14：");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Tom", "CoreJava");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Unix");
		//2） 增加了一位新老师Allen 教JDBC
		map.put("Allen", "JDBC");
		//3） Lucy 改为教CoreJava
		map.put("Susan", "CoreJava");
		//4） 遍历Map，输出所有的老师及老师教授的课程
		for(String key : map.keySet())
		{
			System.out.print("老师：" + key + " 课程:"+ map.get(key) + " | ");
		}
		System.out.println();
		//5） 利用Map，输出所有教JDBC 的老师。
		Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry<String, String> entry = iter.next();
			if(entry.getValue().equals("JDBC"))
			{
				System.out.println("教JDBC的有：" + entry.getKey());
			}
		}
		
	}
}
