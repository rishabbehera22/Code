public class static2 {
    public static void main(String[] args) {
        check c=new check();
        c.change();
        c.print();
        check p=new check();
        p.change();
        p.print();
    }
}
class check{
    int a=6;
    static int b=6;
    void change()
    {
        a=a+1;
        b=b+1;
    }
    void print()
    {
        System.out.println("the value of instance variable is =");
        System.out.println(a);
        System.out.println("the value of static varaiable is =");
        System.out.println(b);
    }
}
