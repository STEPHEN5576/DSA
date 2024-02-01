package absractDemo;

public class daughter extends Parent{
    daughter(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am gonna be a "+ name);
    }

    @Override
    void partner(String name) {
        System.out.println("I love "+ name + "he is "+ age);
    }
}
