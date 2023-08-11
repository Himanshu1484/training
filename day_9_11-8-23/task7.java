import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            if(i==0||i==((s-1)/2)||i==(s-1))
            {
                for(int k=0;k<((s+1)/2);k++)
                {
                    if(k==0||k==((s-1)/2))
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }System.out.println();
            }
            else{
                for(int k=0;k<((s+1)/2);k++)
                {
                    if(k==0||k==((s-1)/2))
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
    }
}
