package Treads.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        new Thread(() ->{
            int count =0;
            while(++ count < 10){
                System.out.println(stack.push(100));
            }
        },"Pusher").start();

        new Thread(() ->{
            int count  =0 ;
            while(++ count < 40){
                System.out.println(stack.pop());
            }
        },"Poper").start();
    }
}
