package cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    Human(int age , String name){
        this.age = age;
        this.name = name;
        this.arr= new int[]{1, 2, 3};
    }
    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
        Human twin = (Human)super.clone(); // this both is actually shallow copy

        twin.arr = new int[twin.arr.length];
        for(int i =0; i<twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
