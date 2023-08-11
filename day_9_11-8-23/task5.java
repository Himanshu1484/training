import java.util.Scanner;

public class task5 {
        public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
            for(int i=1;i<s;i++)
            {
                if(i<(s/2))
                {
                    for(int j=1;j<s;j++)
                    {
                        if((j>(s/2)&&i==1)||(i<(s/2)&&j==1)||(j==(s/2)))
                        {
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                       
                    }
                            System.out.println();
                }
                 else if(i==(s/2))
                {
                    for(int j=1;j<s;j++)
                    {  System.out.print("* "); } 
                            System.out.println();

                }
                else
                {
                    for(int j=1;j<s;j++)
                    {
                        if((j<(s/2)&&i==(s-1))||(i>(s/2)&&j==(s-1))||(j==(s/2)))
                        {
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                      
                    }
                            System.out.println();
                }
                
               
            }
        }
}
