public class static4 {

    public static void main(String[] args) {
        cube c=new cube();
        c.setlength(3);
        c.setbreath(4);
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
    static{
        height=9;
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

