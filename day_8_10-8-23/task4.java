import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Enter the string to find from::");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the no of word you want::");
        int no=sc.nextInt();
        String[] st=str.split(" ");
        System.out.println(no+" Word is :: "+st[no-1]);

       
    }
}
