interface a{
public void calla();
}
interface b{
public void callb();

}
public class task6 implements a,b {
   void calla(){
        System.out.println("i am a");
    }
    void callb(){
        System.out.println("i am b");
    }
    public static void main(String[] args) {
        task6 demo=new task6();
        demo.calla();
        demo.callb();
    }
}
