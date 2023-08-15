import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of items to add in array");
        int no=sc.nextInt();
        int[] ls=new int[no];
        for(int j=0;j<no;j++)
        {
            System.out.println("Enter no"+(j+1));
            ls[j]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<ls.length;i++)
        {
            for(int j=i;j<ls.length;j++)
            {
                if(ls[i]<ls[j])
                {
                    temp=ls[i];
                    ls[i]=ls[j];
                    ls[j]=temp;
                }

            }
        }
        System.out.println("Second biggest value is::"+ls[1]);
    }    catch(Exception e){System.out.println("Enter the correct values");}
    }
}
