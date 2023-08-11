public class task5 {
        public static void main(String[] args) {
            for(int i=1;i<10;i++)
            {
                if(i<5)
                {
                    for(int j=1;j<10;j++)
                    {
                        if((j>5&&i==1)||(i<5&&j==1)||(j==5))
                        {
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                       
                    }
                            System.out.println();
                }
                 else if(i==5)
                {
                    for(int j=1;j<10;j++)
                    {  System.out.print("* "); } 
                            System.out.println();

                }
                else
                {
                    for(int j=1;j<10;j++)
                    {
                        if((j<5&&i==9)||(i>5&&j==9)||(j==5))
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
