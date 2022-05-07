import java.util.Scanner;

public class try6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[3];
        marks[0]=2;
        marks[1]=3;
        marks[2]=4;
        int j;
        boolean b=true;
        System.out.println("Enter the index");

            j=sc.nextInt();
            try{
                System.out.println("The number is =" + marks[j]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("There is a error:");
                System.out.println(e);
            }
        

    
}
}
