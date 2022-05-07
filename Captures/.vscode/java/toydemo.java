import java.util.*;
public class toydemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=0;
        System.out.println("Enter the number of toy details : ");
        int n=sc.nextInt();
        Toy[] obj=new Toy[10];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            System.out.println("Enter the details of the toy "+(i+1)+": ");
            System.out.println("Name : ");
            String name=sc.nextLine();
            System.out.println("ID : ");
            int id=sc.nextInt();
            System.out.println("Quantity : ");
            int quantity=sc.nextInt();
            System.out.println("Price : ");
            int price=sc.nextInt();
            obj[i]=new Toy (id,quantity,price,name);
        }
        System.out.println("ID\tName\tQuantity\tPrice");
        for(int i=0;i<n;i++)
        {
            System.out.println(obj[i].toyname+"\t"+obj[i].toyid+"\t"+obj[i].toyquantity+"\t\t"+obj[i].toyprice);
            total=total+(obj[i].toyquantity*obj[i].toyprice);
        }
        System.out.println("----------------------------");
        System.out.println("Grant Total is : Rs. "+total);
    }
}
 class Toy
{
    int toyid,toyquantity,toyprice;
    String toyname;
    Toy(int id,int qn,int pr,String n)
    {
        toyid=id;
        toyquantity=qn;
        toyprice=pr;
        toyname=n;
    }
}