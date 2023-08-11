import java.util.*;
public class task3 {

   public static boolean check(ArrayList<Integer> list)
    {
        for(int i:list)
        {
               if(i%2==0)
                {
                   return false;
                }
        }return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of items to add in array");
        int no=sc.nextInt();
         ArrayList<Integer> list=new ArrayList<Integer>(){{}};

        for(int j=0;j<no;j++)
        {
            System.out.println("Enter no"+(j+1));
            list.add(sc.nextInt());
        }
        if(check(list)){
        System.out.println("List contains ony odd numbers");
        }
        else{
        System.out.println("List contains ony even numbers");
        }

    }
}
