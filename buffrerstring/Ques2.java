import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {

        String s1 ="";
        System.out.println("String s1 is empty : " + s1.isEmpty());//b
        s1 = String.join(" ", "PRIYANKA", "SAHOO");//a
        System.out.println("The joined string is : " + s1);
        System.out.println("The replaced string is : " + s1.replace('a', 'A'));//c
        System.out.println("The substring is : " + s1.substring(0, 5));//d
        String[] s2 = s1.split(" ", 3);//e
        System.out.println("The split string is : " + Arrays.toString(s2));
    }
}