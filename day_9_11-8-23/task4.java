import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    System.out.print("*");
                }
                else if(i==s-1)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
