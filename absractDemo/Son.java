package absractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("Gonna be "+name);
    }

    @Override
    void partner(String name) {
        System.out.println("I love "+ name +" her age is "+age);
    }
}
