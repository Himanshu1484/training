import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to revers the words");
        String str=sc.nextLine();
        String[] c=str.split(" ");
        String[] b=new String[c.length];
        int j=c.length-1;

        for(int i=0;i<c.length;i++)
        {
           b[j]=c[i];
           j--;            
        }
        StringBuffer sb=new StringBuffer();
        for(String s:b)
        {
            sb.append(s);
            sb.append(" ");
        }
        String rev=sb.toString();
        for(int k=0;k<b.length;k++){System.out.println(b[k]);}
        String str1=String.valueOf(b);
        System.out.println("Here is the reversed string::"+rev);
   
    }
}
