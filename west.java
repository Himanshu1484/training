// A Java program to demonstrate that invoking a method
// on null causes NullPointerException
import java.io.*;
import java.util.Scanner;

class west
{
	public static void main (String[] args)
	{
			System.out.println("Enter the string to encode::");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			char[] arr=str.toCharArray();
			int[] arr1=new int[arr.length];
			char[] str1=new char[arr1.length];
		
			for(int i=0;i<arr.length;i++)
			{
				arr1[i]=((((int)(arr[i]))*2)+8)/2;
			}
			for(int i=0;i<arr.length;i++)
			{
				str1[i]=(char)(arr1[i]);
			}

			StringBuffer sb=new StringBuffer();
			for(int i=0;i<arr.length;i++)
			{
				sb.append(str1[i]);
			}
			String str2=sb.toString();
			System.out.println("Encoded String is ::"+str2);
			char[] arr2=str2.toCharArray();
			int[] arr11=new int[arr2.length];
			char[] str11=new char[arr1.length];
			
			
			for(int i=0;i<arr2.length;i++)
			{
				arr11[i]=(((((int)(arr2[i]))*2)-8)/2);
			}
			for(int i=0;i<arr2.length;i++)
			{
				str11[i]=(char)(arr11[i]);
			}
			StringBuffer sb1=new StringBuffer();
			for(int i=0;i<arr2.length;i++)
			{
				sb1.append(str11[i]);
			}
			String str3=sb1.toString();
			System.out.println("Decoded String is ::"+str3);

			
	}
}
