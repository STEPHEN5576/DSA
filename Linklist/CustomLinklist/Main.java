package Linklist.CustomLinklist;

public class Main {
    public static void main(String[] args) throws Exception {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertFirst(3);
        list.inserlast(99);
        list.insert(12,0);
        list.display();
        list.deletefirst();
        list.display();
        LL list1 = new LL();
        list1.insertFirst(20);
        list1.display();
        list1.deletefirst();
        list1.display();
        System.out.println(list.deleteLast()+ " is deleted");

    }
}
