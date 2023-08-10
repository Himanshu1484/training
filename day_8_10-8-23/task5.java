import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Enter decemal num of your desire:");
        Scanner sc=new Scanner(System.in);
        double no=sc.nextDouble();
       String s=String.valueOf(no);
       int d=s.indexOf('.');
        s.replace(".", "");
        char[] c=s.toCharArray();
        char[] r=new char[c.length+1];
        int co=0;
        for(int j=c.length-1;j>=0;j--)
        { 
            if (co < d)
           {
            r[co]=c[j];
           }
           else if (co == d)
           {
            r[co]='.';
           }
           else{
           r[co] = c[j];}
           co++;
        }
        
        for(int l=0;l<r.length;l++)
        {
            System.out.println(r[l]);
        }
                    System.out.println(d);

    }
}
