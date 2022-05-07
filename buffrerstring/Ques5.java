import java.util.Arrays;
public class Ques5 {
    public static void main(String[] args) {
        int n = 13;
        int arr[]={1,2,3};
        String s = String.valueOf(n)+" Priyanka";
        System.out.println("valueOf() : "+s);
        s = Arrays.toString(arr);
        System.out.println("toString() : "+s);
    }
}