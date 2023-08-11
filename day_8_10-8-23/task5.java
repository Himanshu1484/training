import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Enter decemal num of your desire:");
        Scanner sc=new Scanner(System.in);
        double no=sc.nextDouble();
        String s=String.valueOf(no);
        int len=s.length();
        int ind=len-s.indexOf('.')-1;
        int d=10;
        int no2;
        for(int l=1;l<ind;l++)
        {
            d=d*10;
        }
        no2= (int)(no*(d));
        int newno=0;
        while(no2>0)
        {
            newno=(newno*10)+no2%10;
            no2/=10;
        }
        double no1=(double)(newno);
        double no3=no1/d;
                System.out.println(len+"=len "+ind+"=ind "+no2+"=no "+(d)+"=10^ind "+newno+"=newno "+no3+"=revers_no ");



    
    
    }
      
}
