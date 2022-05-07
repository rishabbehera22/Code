public class thread1 {
    public static void main(String[] args) {
      t1 obj1=new t1();
      Thread t=new Thread(obj1);
      t2 obj2=new t2();
      Thread p=new Thread(obj2);
      p.start();
      t.start();
    }
}
class t1 implements Runnable{
    public void run(){
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");
        System.out.println("The thread1 is running");

    }
}
class t2 implements Runnable{
    public void run(){
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        System.out.println("The thread 2 is running");
        
    }
}