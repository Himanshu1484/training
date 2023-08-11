public class task6 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--)
        {

            for(int k=0;k<i-1;k++)
            {
                System.out.print(" ");
            }
            if(i==5||i==1){
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            }
            else
            {
                  for(int j=0;j<5;j++)
            {
                if(j==0||j==4)
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
