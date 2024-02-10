package Linklist.CustomLinklist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size =0;
    }
    public int deletefirst(){
       int val = head.value;
       head = head.next;
       if(head == null){
           tail = null;
       }
       size--;
       return val;

    }
    public void inserlast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public Node find (int value){
        Node node = head;
        if(node != null){
            if(node.value == value){
                return node;
            }
            node= node.next;
        }
        return null;
    }
    public int deleteLast(){
        if(size <= 1){
            return deletefirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail =  secondlast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public int delete(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletefirst();
        }
        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;



    }
    public void insert(int val, int index) throws Exception {

            if(index > size+1){
                throw new Exception("Out of bound");
            }


        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index ==  size){
            inserlast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head  = node;
        if(tail == null){
            tail = head;
        }
        size += 1;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;

        }
    }

    // questions
//    1.
    public void duplicates(){
      Node node = head;
      while(node.next != null){
          if(node.value == node.next.value){
              node.next = node.next.next;
          }else{
              node = node.next;
              size--;
          }
          tail = node;
          tail.next = null;
      }
    }

//    2. merge

    public  LL merge(LL first, LL second){
       Node f = first.head;
       Node s = second.head;

       LL ans = new LL();

       while (f != null && s != null){
           if(f.value < s.value){
               ans.insertFirst(f.value);
               f = f.next;
           }else{
               ans.insertFirst(s.value);
              s= s.next;
           }

       }
       while(f != null){
           ans.insertFirst(f.value);
           f= f.next;
       }while(s != null){
           ans.insertFirst(s.value);
           s= s.next;
       }
       return ans;


    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(6);
        list.display();
        list.duplicates();
        list.display();

    }
}
