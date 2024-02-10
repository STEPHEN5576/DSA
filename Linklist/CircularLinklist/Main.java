package Linklist.CircularLinklist;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(22);
        list.insert(23);
        list.delete(1);
        list.display();
    }
}
