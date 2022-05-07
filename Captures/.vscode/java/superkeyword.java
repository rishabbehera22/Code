public class superkeyword {
    public static void main(String[] args) {
        smartphone p=new smartphone();
    }
}
class phone{
    phone(){
        System.out.println("Taking ssnap");

}
}
class smartphone extends phone{
    smartphone()
    {
        super();
        System.out.println("Taking snap from smartphone");
    }
}
