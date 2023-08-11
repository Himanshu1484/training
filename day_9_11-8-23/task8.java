import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            for(int k=i;k<s;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i||i==(s-1)){
                System.out.print(" *");
                }
                else{  System.out.print("  "); }

            }
            System.out.println();
        }
    }
}
