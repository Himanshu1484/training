import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=s;i>0;i--)
        {

            for(int k=0;k<i-1;k++)
            {
                System.out.print(" ");
            }
            if(i==s||i==1){
            for(int j=0;j<s;j++)
            {
                System.out.print("*");
            }
            }
            else
            {
                  for(int j=0;j<s;j++)
            {
                if(j==0||j==(s-1))
                {System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            }

            System.out.println();
        }
    }
}
