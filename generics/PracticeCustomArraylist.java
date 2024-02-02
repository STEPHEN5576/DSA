package generics;

import java.util.Arrays;

public class PracticeCustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    PracticeCustomArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int value){
        if(isfull()){
            resize();
        }
        data[size++] = value;
    }
    public boolean isfull(){
       return size == data.length;
    }
    public int remove(){
        int removed = data[size--];
        return removed;
    }
    public void resize(){
        int[] temp = new int[data.length * 2];
        for(int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "PracticeCustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        PracticeCustomArraylist list = new PracticeCustomArraylist();
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(25);
        list.remove();
        list.remove();
        list.add(32);
        System.out.println(list);

    }
}
