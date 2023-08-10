import java.util.*;
class b{
    public void bcall(){
        System.out.println("Called b");
    }
}class a extends b{
    public void call(){
        System.out.println("Called a");
    }
}
class task1 extends a{
    public static void main(String[] args) {
        task1 a=new task1();
        a.call();
        a.bcall();

    }
}