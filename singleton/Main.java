package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj);
        System.out.println(obj1);


    }

}
