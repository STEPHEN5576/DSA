package Linklist.CircularLinklist;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
//    public CLL(int val){
//        Node node = new Node(val);
//        head = node;
//        tail = node;
//    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }
//    public void display(){
//        Node temp = head;
//        System.out.print(temp.val+"->");
//        while(temp != tail){
//            System.out.print(temp.next.val+ "->");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
    public Node find(int value){
        Node node = head;
        if(node != null){
            do{
                if(node.next.val == value){
                    return node;
                }
            }while(node != head);

        }
        return node;
    }
    public void delete(int value){
       Node node = head;
       if(node == null){
           return;
       }

       if(node.val == value){
           head = head.next;
           tail.next = head;
       }
       do{
           Node n = node.next;
           if(n.val == value){
               node.next = n.next;
               break;
           }
           node = node.next;
       } while(node != head);



    }
    public void display(){
        Node temp = head;

        if(head != null){
            do{
                System.out.print(temp.val+" -> ");
                temp = temp.next;
            }while (temp != head);
        }
    }

    private class Node{
        private int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }


    }
}
