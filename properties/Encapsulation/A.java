package properties.Encapsulation;

public class A {
     int num;
    String name;
    int[] arr;
    public int getNum() {
        return num;
    }
    public void setNum(int num){
        this.num = num;
        System.out.println("the number is been set to "+ this.num);
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }



    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
