package Trees.BinarySearchTree;

public class BinarySearchTree {
    private class Node{
       private int value;
       private Node right;
       private Node left;
       private int height;

       public Node(int value){
           this.value = value;
       }
       public int getValue(){
           return value;
       }
    }
    private Node root;

    BinarySearchTree(){
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
       display(root, "Root Node:");
    }
    private void display(Node node, String details){
        if(node == null){
          return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left Node of "+ node.value + " is : ");
        display(node.right, "Right Node of "+ node.value + " is : ");
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void SortedPopulate(int[] nums){
        SortedPopulate(nums, 0, nums.length-1);
    }
    private void SortedPopulate(int[] nums, int start, int end){
        if(start > end){
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        SortedPopulate(nums , start, mid - 1);
        SortedPopulate(nums, mid + 1 , end);
    }


    public void insert(int value){
       root= insert(root, value);
    }
    private Node insert(Node node , int value){
        if(node == null){
            node = new Node(value);
        }
        if(node.value < value){
            node.right = insert(node.right , value);
        }
        if(node.value > value){
            node.left = insert(node.left, value);
        }

        node.height = Math.max(height(node.right), height(node.left))+ 1;

        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

}
