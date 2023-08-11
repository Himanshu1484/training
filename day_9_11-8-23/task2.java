import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char string to arrenge characters");
        String str=sc.nextLine();
        List<Character> ls=new ArrayList<>();
        for(char ch:str.toCharArray())
        {
            ls.add(ch);
        }
        int size=ls.size();
        char temp;
        System.out.println(ls+"=list "+size+"=size ");
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                if(ls.get(i)>ls.get(j))
                {   
                    temp=ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
        }
        System.out.println(ls+"=list "+size+"=size ");
    }
}
