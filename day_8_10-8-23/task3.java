import java.util.*;
public class task3 {

   public static boolean check(ArrayList<Integer> list)
    {
        for(int i:list)
        {
               if(i%2!=0)
                {
                   return false;
                }
        }return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
              }};
              check(list);
             System.out.println(check(list));

    }
}
