package properties.polymorphism.methodoverloading;

public class Number {

    double sum(int a , int b){
        return a + b;
    }
    double sum(double a , int b){
        return a+b;
    }
    int sum(int a , int b , int c){
        return a + b+ c;
    }

    public static void main(String[] args) {
        Number obj = new Number();

       double result= obj.sum(2,3);
       int result1= obj.sum(2,3,5);
        System.out.println(result);
    }

}
