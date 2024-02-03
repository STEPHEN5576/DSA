package generics;

import java.util.Arrays;
import java.util.List;

// here T sould either be Number or its subClasses
public class Wildcardexample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    Wildcardexample(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void getList(List<Number> list){
        //List<Number> list in this case only number to be passed
        //List<? extends Number> list in this case Integer boolean etc

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
        Wildcardexample<Integer> list= new Wildcardexample<>();
        list.add(20 );
        System.out.println(list);

    }
}
