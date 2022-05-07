public class abstract1 {
    public static void main(String[] args) {
        starting st=new starting();
        st.write();
        st.write();
        st.refill();
        st.changenib();
    }
}
abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class starting extends pen{
    public void write(){
        System.out.println("He is writing");
    }
    public void refill()
    {
        System.out.println("The writing work is completed and pen should be refilled");;
    }
    void changenib()
    {
        System.out.println("It's time to change the nib");
    }
}
