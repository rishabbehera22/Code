public class static3 {

    public static void main(String[] args) {
        cube c=new cube();
        c.setlength(3);
        c.setbreath(4);
        c.volume();
        System.out.println("after invoking static method");
        c.setheight(7);
        c.volume();
    }
}
class cube
{
    int length;
    int breath;
    static int height=5;
    void setlength(int l)
    {
        length=l;
    }
    void setbreath(int b)
    {
        breath=b;
    }
    static void setheight(int h)
    {
        height=h;
    }
    void volume()
    {
        System.out.println("the length is:");
        System.out.println(length);
        System.out.println("the breath is:");
        System.out.println(breath);
        System.out.println("the height is ");
        System.out.println(height);
        int volume=length*breath*height;
        System.out.println("volume is");
        System.out.println(volume);
    }
}
