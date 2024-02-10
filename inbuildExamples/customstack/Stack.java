package inbuildExamples.customstack;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isfull()){
            System.out.println("Stach is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return  removed;

//        or
//        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty cannot peek");
        }
        return data[ptr];
    }
    public boolean isfull(){
        return ptr == data.length -1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
}
