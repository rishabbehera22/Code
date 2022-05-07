public class dynamicdisp1 {
    public static void main(String[] args) {
        phone p=new smartphone();
        p.camera();
        p.video();
    }
}
class phone{
    void camera(){
        System.out.println("Taking ssnap");
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
