import java.util.Scanner;
import java.lang.Math;


public class constructor2 {

    public static void main(String[] args) {
        Rational r1=new Rational(2,4);
        Rational r2=new Rational(3,2);
        Rational result=new Rational(1,2);

       result= r1.add(r2);
       System.out.println("Additon is"+result.p+"/"+result.q);

       result= r1.subtract(r2);
       System.out.println("Subtraction is"+result.p+"/"+result.q);

       result= r1.multiply(r2);
       System.out.println("Multiplication is"+result.p+"/"+result.q);

       result= r1.divide(r2);
       System.out.println("Divide is"+result.p+"/"+result.q);


    }

} 
class Rational {
    int p;
    int q;

    Rational(){
        p=0;
        q=1;

    }

   Rational(int p, int q) {
        this.p = p;
        this.q = q;
    }


    Rational add(Rational r) {


        int denomitaer = r.q * q;
        int numerator = q * r.p + p * r.q;

        Rational result = new Rational(numerator, denomitaer);

        return result;
    }

    Rational subtract(Rational r) {


        int denomitaer = r.q * q;
        int numerator = q * r.p - p * r.q;

        Rational result = new Rational(numerator, denomitaer);


        return result;
    }

    Rational multiply(Rational r) {


        int numerator = p * r.p;
        int denomitaer = q * r.q;

        Rational result = new Rational(numerator, denomitaer);


        return result;
    }

    Rational divide(Rational r) {


        int denomitaer = p * r.q;
        int numerator = q * r.p;

        Rational result = new Rational(numerator, denomitaer);


        return result;
    }
}


