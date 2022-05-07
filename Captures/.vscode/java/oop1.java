import java.util.Scanner;

class oop1 {
    public static void main(String[] args) {
        Employee rishab= new Employee();
        rishab.setName("rishabbehera");
        System.out.println(rishab.getName());
        
    }
    }

class Employee {
    int salary;
    String name;
    public int getSalary(int s) {

        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
