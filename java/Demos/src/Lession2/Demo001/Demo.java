package Lession2.Demo001;

import java.util.Collections;
import java.util.Scanner;

/**
 * 题目1
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		Demo instance = new Demo();
		int[] intArr = instance.getArray(10);
		
		instance.printArray("数组为:",intArr);
		//删除第4个数字
		intArr = instance.delArrayValueByIndex(intArr, 4);
		instance.printArray("删除第4个数字后的数组为:",intArr);
		
		//修改第8个数字为9
		instance.editArrayValueByIndex(intArr, 8, 9);
		instance.printArray("修改第8个数字为9后的数组为:",intArr);
		
		//获取某数的位置
		int index = instance.getIndexOf(intArr, 9);
		System.out.println("获取数字为9的数组下标:" + index);
		
		//获取最大值
		System.out.println("数组中最大值：" + instance.getMaxValue(intArr));
		//获取最小值
		System.out.println("数组中最小值:" + instance.getMinValue(intArr));
		//去掉一个最大值，去掉一个最小值，求平均值
		System.out.println("去掉一个最大值，去掉一个最小值，平均值:" +instance.getAverage(intArr));
		
		//对数组使用冒泡排序
		instance.sort(intArr);
		instance.printArray("冒泡排序后的结果：", intArr);
	}
	
	/**
	 * 打印array
	 * @param array
	 */
	public void printArray(String msg,int[] array)
	{
		System.out.println(msg);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}
	
	/**
	 * 获取数组
	 * @param count 数组长度
	 * @return
	 */
	public int[] getArray(int count)
	{
		Scanner scan = new Scanner(System.in) ; // 从键盘接收数据
		int[] array = new int[count];
		for(int i=0;i<count;i++)
		{
			System.out.print("请输入第" + (i+1)+"个值:");
			String str = scan.next();
			try
			{
				array[i] = Integer.parseInt(str);
			}
			catch(Exception ex)
			{
				System.out.println("[" +str+ "]不是一个数字，请重新输入!");
				i--;
			}
		}
		return array;
	}
	
	/**
	 * 删除指定位置的数
	 * @param index
	 */
	public int[] delArrayValueByIndex(int[] array ,int index)
	{
		int[] newArr = new int[array.length-1];
		for(int i=0;i<array.length;i++)
		{
			if(i<index -1 )
			{
				newArr[i]=array[i];
			}
			else if (i > index -1)
			{
				newArr[i-1] = array[i];
			}
		}
		return newArr;
	}
	
	/**
	 * 修改指定index 的值
	 * @param array
	 * @param index
	 * @param value
	 */
	public void editArrayValueByIndex(int[] array, int index, int value)
	{
		array[index-1]=value;
	}
	
	/**
	 * 获取某数的index
	 * @param array
	 * @param value
	 * @return
	 */
	public int getIndexOf(int[] array,int value)
	{
		int index =-1;
		for(int i=0;i<array.length;i++)
		{
			if(value == array[i])
			{
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 获取最大值
	 * @param array
	 * @return
	 */
	public int getMaxValue(int[] array)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] >max)
			{
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * 获取最小值
	 * @param array
	 * @return
	 */
	public int getMinValue(int[] array)
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] <min)
			{
				min = array[i];
			}
		}
		return min;
	}
	
	/**
	 * 获取平均值
	 * @param array
	 * @return
	 */
	public double getAverage(int[] array)
	{
		int max = this.getMaxValue(array);
		int min = this.getMinValue(array);
		int total =0;
		for(int i=0;i<array.length;i++)
		{
			total +=array[i];
		}
		return (total - max -min) *1.0/(array.length -2);
	}
	
	/**
	 * 对数组进行冒泡排序
	 * @param array
	 */
	public void sort(int[] array)
	{
		int temp;
		for(int i=0 ;i<array.length ; i ++ )
		{
			for(int j =i+1 ;j < array.length ;j++)
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
