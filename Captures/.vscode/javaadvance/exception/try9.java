import java.util.Scanner;

public class try9 {
    public static void main(String[] args) throws Hrsexception, minsexception, secexception {
        Scanner sc=new Scanner(System.in);
        int hr=sc.nextInt();
        int min=sc.nextInt();
        int sec=sc.nextInt();
        if(hr<0 || hr>24)
        {
            throw new Hrsexception("Hrsexception");
        }
        else if(min<0 || min>60)
        {
            throw new  minsexception("minsexception");
        }
        else if(sec<0 || sec>60)
        {
            throw new  secexception("secsexception");
        }

    }
}
class Hrsexception extends Exception{
    Hrsexception(String s)
    {
        System.out.println(s);
    }
}
    class minsexception extends Exception{
        minsexception(String s)
        {
            System.out.println(s);
        }
    }
        class secexception extends Exception{
            secexception(String s)
            {
                System.out.println(s);
            }
}

