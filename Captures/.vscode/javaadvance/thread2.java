public class thread2 {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t2.start();
        t1.start();
    }
}
class Mythread1 extends Thread{
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}
