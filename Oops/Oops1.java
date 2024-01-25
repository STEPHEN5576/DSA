package Oops;

public class Oops1 {
    public static void main(String[] args){

        A student = new A();
        System.out.println(student);
    }

}
class A{
    String name;
    int rollno;
    float percentage;

    A(){
        this.name="stephen";
        this.rollno= 12;
        this.percentage=84.6f;
    }

}
