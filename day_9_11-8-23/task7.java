public class task7 {
    public static void main(String[] args) {
        for(int i=0;i<9;i++)
        {
            if(i==0||i==4||i==8)
            {
                for(int k=0;k<5;k++)
                {
                    if(k==0||k==4)
                    {
                        System.out.print("   ");
                    }
                    else{
                        System.out.print(" * ");
                    }
                }System.out.println();
            }
            else{
                for(int k=0;k<5;k++)
                {
                    if(k==0||k==4)
                    {
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }System.out.println();
            }
        }
    }
}
