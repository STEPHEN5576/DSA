package Human;

public class Human {
    String name;
    int age;
    long Salary;
    boolean married;
    static int population;

     static String Message(){
         String hello ="hello Humans We are testing you right now";
        System.out.println(hello);
        return hello;

     }

    public Human(String name, int age, long Salary, boolean married){
        this.name = name;
        this.age = age;
        this.Salary = Salary;
        this.married = married;
        // this is how you need to write bacause it is common for all and it exist in class not the object
        Human.population += 1;
        // this is not a good naming convention but it works because it has a common class ,
        // it works but also gives us a error
//        this.population += 1;
        Human.Message();
    }

}
