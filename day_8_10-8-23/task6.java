interface a{
 void calla();
}
interface b{
 void callb();

}
public class task6 implements a,b {
   public void calla(){
        System.out.println("i am a");
    }
    public void callb(){
        System.out.println("i am b");
    }
    public static void main(String[] args) {
        task6 demo=new task6();
        demo.calla();
        demo.callb();
    }
}
