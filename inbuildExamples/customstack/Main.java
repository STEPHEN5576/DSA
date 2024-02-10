package inbuildExamples.customstack;

public class Main {
    public static void main(String[] args) throws StackException{
        Stack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(11);
        stack.push(11);
        stack.push(11);
        stack.push(11);
        stack.push(11);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());




    }
}
