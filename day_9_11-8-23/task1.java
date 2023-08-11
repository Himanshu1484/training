import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to trime spaces");
        String str=sc.nextLine();
        char[] c=str.toCharArray();
        char[] b=new char[str.length()];
        int j=0;

        for(int i=0;i<c.length;i++)
        {
            if(c[i]==' ')
            {
              continue;
            }
            else{
                b[j]=c[i];
                j++;
            }
            
        }
        for(int k=0;k<b.length;k++){System.out.println(b[k]);}
        String str1=String.valueOf(b);
        System.out.println("Here is the space removed string::"+str1);
    }
}
