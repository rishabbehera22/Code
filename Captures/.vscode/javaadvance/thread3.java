public class thread3 {
    public static void main(String[] args) {
        int x=9;
        if(x==9)
        {
            int x=8;
            System.out.println(x);
        }
    }
}
class mythread1 extends Thread{
    public void run()
    {
        int i=45;
        while(i<=90){
            System.out.println("good morning");
        }
    }
}
class mythread2 extends Thread{
    public void run()
    {
        int i=45;
        while(i<=90){
            System.out.println("welcome");
        }
    }
}
