import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int temp=no;
        int sum=0,no1,no2;
        while(temp>0)
        {
            no1=temp%10;
            no2=no1;
            for(int i=0;i<2;i++)
            {
                no1*=no2;
            }
            sum+=no1;
            temp/=10;
        }
        if(no==sum)
        {
            System.out.println("Number is ArmStrong number.");
        }
        else
        {
            System.out.println("Number is not ArmStrong number.");
        }
        System.out.println("sum="+sum+" no="+no);

    }
}
