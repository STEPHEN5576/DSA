package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value
    
    public customArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public int get(int index){
        return data[index];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public void set(int index,int value){
        data[index] = value;
    }


    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i=0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static  void main(String[] args) {
       customArrayList list = new customArrayList();
       list.set(0,2);
       list.add(24);
        System.out.println(list);
    }
}
