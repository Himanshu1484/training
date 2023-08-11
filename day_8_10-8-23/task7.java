
public class task7 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello Himanshu");
        System.out.println("After append="+sb);
        sb.insert(5,",");
        System.out.println("After insertion="+sb);
        sb.delete(6,sb.length());
        System.out.println("After deletion="+sb);
        sb.replace(5,6,"!");
        System.out.println("After replacement="+sb);
        sb.reverse();
        System.out.println("After reverse="+sb);
        System.out.println("length of sb="+sb.length());
        System.out.println("capacity of sb="+sb.capacity());



    }
}
