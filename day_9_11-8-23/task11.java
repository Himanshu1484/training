public class task11 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int k=i;k<5;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {                
              if(j!=i)
                    {
                       System.out.print("*"+i); 
                    }
                    else{System.out.print("*");}
            }
            System.out.println();
        }
        for(int i=3;i>=0;i--)
        {
            for(int k=i;k<5;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {                
              if(j!=i)
                    {
                       System.out.print("*"+i); 
                    }
                    else{System.out.print("*");}
            }
            System.out.println();
        }
    }
}
