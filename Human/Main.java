package Human;

public class Main {
    // why is this staic here
    // 1. beacause staic is common for every object we can use this method without creating a object
    // 2. and main the first programm which java runs if main is not present then the java will not run
    // 3. so main is mandatory
    // 4. think{
    // 1. if static is not created then we need to create object to run the main
    // 2. in order to run anything in the class we need to create object of that class
    // 3. static belongs to the class not the object
    // 4. deos not depend on objects
    // }
    public static void main(String[] args) {
        Human specimen = new Human("stephen",23,22112, false);
        Human specimen2 = new Human("Ron", 22, 35000,true);
        Human specimen3 = new Human("Ron", 22, 35000,true);


        System.out.println(specimen.name);
        if(specimen.married == true){
            System.out.println("he is married");
        }else{
            System.out.println("he is not married");
        }

        // this is the correct nameing convention because it is in class
        // not it is not dependendent on objects
        // no object is created but still you can use it
        System.out.println(Human.population);
        System.out.println(Human.Message());

        // it will work but it is nt a good naming convention
        //
//        System.out.println(specimen.population);


        // 1. a non static method cannot be called inside the static method

        // greet();


        // dont confuse with the methods this creats new object nothing to do with static
        New obj = new New(2);
        System.out.println(obj.num);


        // i have the obj ckeck out in my function
        fun();

    }
    // we know which is not static belong to the instance /object

    void greet(){
        System.out.println("HI i am stephen");
    }

    static void fun(){

        // you cannot access non static without refrencing thier instance in
        // a static context

        // hence, here i am refrencing it
        // i got a obj
        Main obj = new Main();
        obj.Greeting();


    }

    void Greeting(){
        System.out.println("hello world");
    }

    Main(){
        String name= "joy";

    }


}
class New{
    int num = 2;
    New(int num){
        this.num= num;
    }
}


