import java.util.Scanner;

public class task2 {

    static void swap(float a,float b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping::");
        System.out.println("No 1:"+a);
        System.out.println("No 2:"+b);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no 1:");
        float a=sc.nextFloat();
        System.out.println("Enter no 2:");
        float b=sc.nextFloat();
        swap(a, b);
    }
}
