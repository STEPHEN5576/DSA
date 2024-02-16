package inbuildExamples.QeueStack;
import java.util.Stack;
public class queuestack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public queuestack() {
        first = new Stack<>();
        second = new Stack<>();
    }
     public void insert(int item){
        first.push(item);
     }
     public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
         int removed = second.pop();
         while(!second.isEmpty()){
             first.push(second.pop());
         }
         return removed;

     }
}
