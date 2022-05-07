public class methodoveride1 {
    public static void main(String[] args) {
        smartphone p=new smartphone();
        p.bluetooth();
        p.video();
    }
}
class phone{
    private void camera(){
        System.out.println("Taking ssnap");
    }
    protected void music()
    {
        System.out.println("Play music");
    }
    void video(){
        System.out.println("Taking video");
    }
}
class smartphone extends phone{
    void bluetooth(){
        System.out.println("connecting to bluetooth");
    }
    void video(){
        System.out.println("Taking video from smartphone");
    }
}
