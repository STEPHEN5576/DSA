package generics;

import java.util.Arrays;

public class Customgenericarraylist<T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    Customgenericarraylist(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isfull()){
            resize();
        }
        data[size++] = value;
    }
    public boolean isfull(){
        return size == data.length;
    }
    public T remove(){
        T removed = (T)(data[size--]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }


    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "PracticeCustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Customgenericarraylist<String> list= new Customgenericarraylist<>();
        list.add("Apples");
        System.out.println(list);

    }
}
