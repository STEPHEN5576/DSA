package Treads.Stack;

public class Stack {
    private int[] array;
    private int stacktop;
    // only one lock should be because tread is now bound to this lock
    // which means other than this others cant use them
    final Object lock;

    public synchronized boolean push(int elements){
        // you can do it without writing synchronized by just writing synchronized(lock)
        synchronized (this){
            if(isFull()) return false;
            ++stacktop;
            try{Thread.sleep(1000);}catch (Exception e){ }
            array[stacktop] = elements;
            return true;
        }

    }
    // internally this happens
    public synchronized int pop(){
        synchronized (this){
            if(isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stacktop];
            array[stacktop] = Integer.MIN_VALUE;
            try{Thread.sleep(1000);}catch (Exception e){ }
            stacktop--;
            return obj;
        }

    }

    public Stack(int capacity){
        array = new int[capacity];
        stacktop = -1;
        lock = new Object();
    }
    public boolean isEmpty(){
        return stacktop < 0;
    }
    public boolean isFull(){
        return stacktop >= array.length-1;
    }
}
