public class task3 {
    public static void main(String[] args) {
        int[] ls= {98,32,72,94,75,73,92,36,28,34};
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
            System.out.println(ls[i]);
        }
        System.out.println("Second biggest value is::"+ls[1]);
    }
}
