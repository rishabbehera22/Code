public class inheritance4 {
    public static void main(String[] args) {
        box b=new box();
        b.setbox(3,4,5);
        b.print();
        System.out.println("for wooden box");
        woodbox w=new woodbox();
        w.setwoodbox(3, 4, 5, 6);
        w.print();
    }
}
class plate{
    int length;
    int breath;
    void setplate(int l,int b)
    {
        length=l;
        breath=b;
    }
    void print(){
        System.out.println("the length is:");
        System.out.println(length);
        System.out.println("the breath is:");
        System.out.println(breath);
    }
}
class box extends plate{
    int hieght;
    void setbox(int l,int b,int h){
        setplate(l, b);
        hieght=h;
    }
    void print(){
        System.out.println("the length is:");
        System.out.println(length);
        System.out.println("the breath is:");
        System.out.println(breath);
        System.out.println("the hieght is:");
        System.out.println(hieght);
    }
}
class woodbox extends box{
    int thick;
    void setwoodbox(int l,int b,int h,int t){
        setbox(l, b,h);
        
        thick=t;
    }
    void print(){
        System.out.println("the length is:");
        System.out.println(length);
        System.out.println("the breath is:");
        System.out.println(breath);
        System.out.println("the hieght is:");
        System.out.println(hieght);
        System.out.println("the thickness is");
        System.out.println(thick);
    }
}