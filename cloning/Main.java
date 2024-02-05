package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human stephen = new Human(20,"Stephen");

        Human twin = (Human) stephen.clone();
//        System.out.println(twin.name);
        String name = "Stephen";
        Change(name);
        System.out.println(name);
        int[] arr = {1,2};
        send(arr);
        System.out.println(arr[0]);


    }
    static void Change(String name){
        String name1 = name;
        name1 = "DOn";
        System.out.println(name1);
    }
    static void send(int[] arr){
        int[] temp = arr;
        temp[0] = 20;
    }
}
