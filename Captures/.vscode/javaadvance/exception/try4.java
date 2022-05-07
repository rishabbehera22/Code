import java.util.Scanner;

public class try4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[3];
        marks[0]=2;
        marks[1]=3;
        marks[2]=4;
        int j;int s=0;
        boolean b=true;
        System.out.println("Enter the index");
        while(b){
            if(s>=5)
            {
                throw new ArithmeticException("ERROR AND EXITING");
            }
        try{
            j=sc.nextInt();
            try{
                System.out.println("The number is =" + marks[j]);
                b=false;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("There is a error:");
                System.out.println(e);
                System.out.println("Enter the index again");
                s=s+1;
            }
        }
        catch(Exception e){
            System.out.println("There must be a problem in the code");
        }
    }
}
}
class Myexception extends Exception{
    public void ArithmeticException(String s)
    {
        System.out.println(s);
    }
}
