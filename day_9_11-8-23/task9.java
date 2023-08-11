public class task9 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            for(int k=i;k<5;k++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<4;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i){
                System.out.print("*");
                }
                else{  System.out.print(" "); }

            }

                System.out.println();
        }
        for(int d=0;d<11;d++)
        {
            if((d==0)||(d==10)||(d==(11/2)))
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    
        for(int i=4;i>0;i--)
        {
			for(int j=1;j<=i+1;j++)
            {
                if(j==1||j==i)
                {
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            for(int k=i;k<5;k++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=4;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++)
            {
                if(j==1||j==i){
                System.out.print("*");
                }
                else{  System.out.print(" "); }

            }

                System.out.println();
        }
    }
}
