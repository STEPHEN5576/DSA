package Human;

public class Human {
    String name;
    int age;
    long Salary;
    boolean married;
    static int population;

    public Human(String name, int age, long Salary, boolean married){
        this.name = name;
        this.age = age;
        this.Salary = Salary;
        this.married = married;
        Human.population += 1;

    }

}
