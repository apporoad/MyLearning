package Lession2.Demo001;

import java.util.Scanner;

/**
 * 题目2 3 4 5
 * @author Administrator
 *
 */
public class Demo002 {
	public static void main(String[] args) {
		//题目 2：定义一个int类型的变量为x并赋值为5，如果x<10,则让x实现自增，并输出x最后的值
		int t2 = 5;
		while(t2 <10)
		{
			t2++;
		}
		System.out.println("题目2 的答应:" +t2);
		
		//题目 3：定义一个int类型的变量成绩为59，如果成绩大于等于60，则输出成绩及格，否则，输出成绩不及格
		int score =59;
		if(score >=60)
		{
			System.out.println("题目 3: 成绩及格");
		}
		else
		{
			System.out.println("题目 3: 成绩不及格");
		}
		
		//题目 4：输入员工登记A、B、C级，判断其是否加薪，加薪对应500、300、100（switch语句）
		System.out.println("题目4，请输入员工登记级别：");
		Scanner scan = new Scanner(System.in) ; // 从键盘接收数据
		String str =scan.next();
		int bonus =0;
		switch(str.charAt(0))
		{
			case 'A':
				bonus =500;
				break;
			case 'B':
				bonus = 300;
				break;
			case 'C':
				bonus =100;
				break;
		}
		System.out.println("你的等级对应的加薪为:" + bonus + "日元");
		
		//题目 5：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符
		System.out.println("题目5：请输入一段文字：");
		int eCount =0;
		int sCount =0;
		int nCount =0;
		int oCount =0;
		str = scan.next();
		int index =0;
		while(index <str.length())
		{
			char c = str.charAt(index++);
			if ((c >= 'A' && c <= 'Z')  || (c >= 'a' && c <= 'z')) {  
                eCount++; 
            } 
			else if(c == ' '){
				sCount++;
			}
			else if(c >= '0' && c <= '9')
			{
				nCount++;
			}
			else
			{
				oCount++;
			}
		}
		System.out.println("英文单词共:" + eCount + " 空格:"+sCount + " 数字:"+ nCount + " 其他:"+oCount);
		
		
	}
}
