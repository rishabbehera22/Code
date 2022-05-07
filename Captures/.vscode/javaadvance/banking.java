import java.util.Scanner;
public class banking {
    public static void main(String[] args) {
        bank h=new HDFC();
        bank i=new ICICI();
        bank b=new BOI();
        h.find_ROI();
        i.find_ROI();
        b.find_ROI();
    }
}
class bank{
    float ROI;
    void find_ROI()
    {
        System.out.println("Finding out ROI");
    }
}
class HDFC extends bank{
    void find_ROI(){
        System.out.println("For hdfc");
        float intrest;
        float principle;
        float time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the intrest");
        intrest=sc.nextInt();
        System.out.println("Enter the principle amount");
        principle=sc.nextInt();
        System.out.println("Enter the time");
        time=sc.nextInt();
        ROI=intrest/(principle*time);
        System.out.println(ROI);
    }
}
    class ICICI extends bank{
        void find_ROI(){
            System.out.println("for ICICI");
            float intrest;
            float principle;
            float time;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the intrest");
            intrest=sc.nextInt();
            System.out.println("Enter the principle amount");
            principle=sc.nextInt();
            System.out.println("Enter the time");
            time=sc.nextInt();
            ROI=intrest/(principle*time);
            System.out.println(ROI);
    }

}
class BOI extends bank{
    void find_ROI(){
        System.out.println("for BOI");
        float intrest;
        float principle;
        float time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the intrest");
        intrest=sc.nextInt();
        System.out.println("Enter the principle amount");
        principle=sc.nextInt();
        System.out.println("Enter the time");
        time=sc.nextInt();
        ROI=intrest/(principle*time);
        System.out.println(ROI);
}
}
