package Human;

public class Main {
    public static void main(String[] args) {
        Human specimen = new Human("stephen",23,22112, false);
        Human specimen2 = new Human("Ron", 22, 35000,true);

        System.out.println(specimen.name);
        if(specimen.married == true){
            System.out.println("he is married");
        }else{
            System.out.println("he is not married");
        }
        System.out.println(specimen.population);
        System.out.println(specimen2.population);


    }
}
