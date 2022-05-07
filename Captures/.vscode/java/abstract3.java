public class abstract3 {
    public static void main(String[] args) {
        telephone t=new smartphone();
        t.ring();
        t.lift();
        t.disconnect();
    }
}
abstract class telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class smartphone extends telephone{
    public void ring()
    {
        System.out.println("The phone is ringing");
    }
    public void lift()
    {
        System.out.println("U have picked call");
    }
    public void disconnect()
    {
        System.out.println("U have disconnected call");
    }
}
