import java.util.Arrays;

public class Ques6 {
    public static void main(String[] args) {
        String s = new String("Priyanka Sahoo");
        char[] ch = new char[10];
        s.getChars(0, 5, ch, 0);
        System.out.println("getChars(0,5,ch,0) : " + Arrays.toString(ch));
        System.out.println("getBytes() : " + Arrays.toString(s.getBytes()));
        System.out.println("toCharArray() : " + Arrays.toString(s.toCharArray()));
        System.out.println("Priyanka.equalsIgnoreCase(Priyanka) : " + "Priyanka".equalsIgnoreCase("Priyanka"));
    }
}