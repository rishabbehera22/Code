public class interfaces1 {
    public static void main(String[] args) {
        mysmartphone s=new mysmartphone();
        s.call();
        s.connect();
        s.photo();
        s.video();
    }
}
interface Mycamera{
    void photo();
    void video();
}
interface wifi{
    void connect();
    void disconnect();
}
class phone{
    void call()
    {
        System.out.println("call connected");
    }
    void discall()
    {
        System.out.println("call disconnected");
    }
}
class mysmartphone extends phone implements Mycamera,wifi{
    public void photo()
    {
        System.out.println("capturing photo");
    }
    public void video()
    {
        System.out.println("capturing video");
    }
    public void connect()
    {
        System.out.println("wifi connected");
    }
    public void disconnect()
    {
        System.out.println("wifi disconnected");
    }
}