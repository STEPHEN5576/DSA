package Trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(50);
//        tree.insert(46);
//        tree.insert(48);
//        tree.insert(44);
//        tree.insert(54);
//        tree.insert(52);
//        tree.insert(51);
//        tree.insert(53);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        tree.SortedPopulate(arr);
        tree.display();

    }
}
